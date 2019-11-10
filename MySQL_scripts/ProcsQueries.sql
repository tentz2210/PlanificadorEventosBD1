/* Queries */
/* FUNCTIONS AND PROCEDURES */

DELIMITER $$
/* ADMINS */
-- Point a
CREATE PROCEDURE getInvitedUsers(IN filter_status_id int, IN filter_owner_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error executing query';
    END;
	SELECT CONCAT(per.first_name,' ',per.middle_name,' ',per.last_name) full_name,
		   se.event_title, stat.status_name
	FROM person per INNER JOIN person_event_invitation pei
    ON per.person_id = pei.person_id
    INNER JOIN social_event se
    ON se.event_id = pei.event_id
	INNER JOIN person_event_status pes
    ON se.event_id = pes.event_id
    INNER JOIN status_type stat
    ON stat.status_type_id = pes.status_type_id
	WHERE se.person_id = filter_owner_id
	  AND stat.status_type_id = IFNULL(filter_status_id, stat.status_type_id);
END;$$

-- Point b
CREATE PROCEDURE getFinishedEvents(IN filter_start_date VARCHAR(11), IN filter_end_date VARCHAR(11))
BEGIN
	DECLARE vStartDate DATE DEFAULT NULL;
    DECLARE vEndDate DATE DEFAULT NULL;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error executing query';
    END;
    SET vStartDate := STR_TO_DATE(filter_start_date, '%d/%m/%Y');
    SET vEndDate := STR_TO_DATE(filter_end_date, '%d/%m/%Y');
    
	SELECT se.event_title, se.start_date, se.end_date
    FROM social_event se INNER JOIN event_log el
    WHERE se.start_date <= IFNULL(vStartDate, se.start_date)
    AND se.end_date >= IFNULL(vEndDate, se.end_date);
END;$$ 

CREATE PROCEDURE getPendingEvents(IN filter_start_date VARCHAR(11), IN filter_end_date VARCHAR(11))
BEGIN
	DECLARE vStartDate DATE DEFAULT NULL;
    DECLARE vEndDate DATE DEFAULT NULL;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error executing query';
    END;
    SET vStartDate := STR_TO_DATE(filter_start_date, '%d/%m/%Y');
    SET vEndDate := STR_TO_DATE(filter_end_date, '%d/%m/%Y');
    
	SELECT event_title, start_date, end_date
    FROM social_event
    WHERE event_id NOT IN (
		SELECT event_id FROM event_log
    )
    AND start_date <= IFNULL(vStartDate, start_date)
    AND end_date >= IFNULL(vEndDate, end_date);
END;$$

-- Point c
CREATE PROCEDURE getEventReviews(IN filter_event_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error executing query';
    END;
	SELECT se.event_id, se.event_title,
		   CONCAT(per.first_name, ' ', per.middle_name, ' ', per.last_name) person_name,
           rev.rating, rev.review_comment
	FROM social_event se INNER JOIN person_review rev
    ON se.event_id = rev.event_id
    INNER JOIN person per
    ON per.person_id = rev.person_id
    WHERE se.event_id = IFNULL(filter_event_id, se.event_id)
    ORDER BY se.event_title;
END;$$

/* USERS */
-- Point a
CREATE PROCEDURE getInvitations(IN p_person_id int, IN filter_category_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error executing query';
    END;
	SELECT se.event_title, se.start_date, se.end_date, cat.category_name
    FROM social_event se INNER JOIN person_event_invitation pei
    ON se.event_id = pei.event_id
    INNER JOIN category cat
    ON cat.category_id = se.category_id
    WHERE pei.person_id = p_person_id
      AND cat.category_id = IFNULL(filter_category_id, cat.category_id)
    ORDER BY se.event_title;
END;$$

-- Point b
CREATE PROCEDURE getPublicEvents(IN p_current_user_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error executing query';
    END;
	SELECT se.event_title, se.start_date, se.end_date, se.photo, cat.category_name, pro.province_name,  can.canton_name, cxp.cat_id
    FROM social_event se INNER JOIN category cat
    ON se.category_id = cat.category_id
    LEFT OUTER JOIN (SELECT category_id cat_id
				FROM category_x_person
                WHERE person_id = p_current_user_id
			   ) cxp
	ON cat.category_id = cxp.cat_id
    INNER JOIN address addr
    ON se.address_id = addr.address_id
    INNER JOIN district dis
    ON addr.district_id = dis.district_id
    INNER JOIN canton can
    ON dis.canton_id = can.canton_id
    INNER JOIN province pro
    ON can.province_id = pro.province_id
    ORDER BY -cxp.cat_id DESC, se.category_id, se.event_title ASC;
END;$$

-- Point c
CREATE PROCEDURE getAssistedEvents(IN p_current_person_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error executing query';
    END;
	SELECT se.event_title, se.start_date, rev.rating, rev.review_comment
    FROM social_event se INNER JOIN event_log el
    ON se.event_id = el.event_id
    INNER JOIN person_event_status pes
    ON se.event_id = pes.event_id
    LEFT OUTER JOIN person_review rev
    ON se.event_id = rev.event_id
    WHERE pes.status_type_id = 2 -- AQUI VA EL PARAMETRO
      AND pes.person_id = p_current_person_id;
END;$$

/* User Login */

CREATE PROCEDURE userLogin(IN p_username VARCHAR(30), IN p_userpassword VARCHAR(30))
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
        SELECT 'Error logging in';
    END;
    DECLARE EXIT HANDLER FOR NOT FOUND
    BEGIN
		SELECT 'Username or password incorrect';
    END;

    SELECT user_id, person_id
    FROM person_user
    WHERE username = p_username
      AND user_password = p_userpassword;
END;$$

-- STATISTICS MODULE --

-- Point a: getEventStatisticsPerCategory
CREATE PROCEDURE getEventStatisticsPerCategory() 
BEGIN
	DECLARE vnTotalEvents int;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error executing query';
    END;
    
    SELECT count (1)
    INTO vnTotalEvents
    FROM social_event;
        
	SELECT c.category_name AS "Category", count(1) AS "Number of events", count(1)/vnTotalEvents *100 AS "Percentage"
	FROM social_event s INNER JOIN category c
	ON s.category_id = c.category_id
	GROUP BY category_name;
END;$$

-- Point b
-- Point c
-- Point d
-- Point e
-- Point f
-- Point g
-- Point h
