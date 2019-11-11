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
    ON se.event_id = el.event_id
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

-- Point b: getPeopleStatisticsPerCategory
CREATE PROCEDURE getPeopleStatisticsPerCategory()
BEGIN
	DECLARE vnTotalPersons int;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error executing query';
    END;
    
    SELECT count (1)
    INTO vnTotalPersons
    FROM person_event_status
    WHERE status_type_id = 1; -- 1 se refiere al id de asistiré
    
	SELECT c.category_name AS "Category", count(1) AS "Total Persons", count(1)/vnTotalPersons*100 AS "Percentage"
    FROM category c
	INNER JOIN(SELECT se.category_id cat_id
			   FROM (SELECT event_id id
					 FROM person_event_status
					 WHERE status_type_id = 1 -- 1 se refiere al id de asistiré
					) t_events
			   INNER JOIN social_event se
			   ON t_events.id = se.event_id) t_cats
	ON c.category_id = t_cats.cat_id
    GROUP BY category_name;
END;$$

-- Point c: getEventStatiticsPerDate
-- Point d getTopEventsWithMostAssistance
-- Point e: getTopEventsWithBestCalif
-- Point f getTopEventsWithWorstCalif

-- Point g: getAgeStatistics
-- FUNCTION getAgeRankId --
CREATE FUNCTION getAgeRank(p_date_of_birth DATE) RETURNS VARCHAR(21) NO SQL
BEGIN
	DECLARE vnAge INT;
    DECLARE vcRank VARCHAR(21);
	SET vnAge:= FLOOR((DATEDIFF(CURDATE(),p_date_of_birth))/365.25);
	IF (vnAge BETWEEN 0 AND 18) THEN
		SET vcRank = '0 a 18';
	ELSEIF (vnAge BETWEEN 19 AND 30) THEN
		SET vcRank = '19 a 30';
	ELSEIF (vnAge BETWEEN 30 AND 45) THEN
		SET vcRank = '30 a 45';
	ELSEIF (vnAge BETWEEN 46 AND 55) THEN
		SET vcRank = '46 a 55';
	ELSEIF (vnAge BETWEEN 55 AND 65) THEN
		SET vcRank = '55 a 65';
	ELSEIF (vnAge BETWEEN 66 AND 75) THEN
		SET vcRank = '66 a 75';
	ELSEIF (vnAge BETWEEN 76 AND 85) THEN
		SET vcRank = '76 a 85';
	ELSE -- vnAge > 85
		SET vcRank = 'mayor a 85';
	END IF;
	RETURN vcRank;
END;$$

-- PROCEDURE getStatisticsUsersAge --
CREATE PROCEDURE getStatisticsUsersAge()
BEGIN
	DECLARE vnTotalUsers INT;
	SELECT count (1)
	INTO vnTotalUsers
	FROM person;
            
	SELECT a.age_rank, count(1) total, count(1)/vnTotalUsers * 100 percentage
	FROM (SELECT getAgeRank(p.date_of_birth) age_rank FROM person p) a
	GROUP BY age_rank;
END;$$

-- Point h: getReviewsStatisticsPerCategory
CREATE PROCEDURE getReviewsStatisticsPerCategory()
BEGIN
	DECLARE vnTotalReviews INT;
    SELECT count(1)
    INTO vnTotalReviews
    FROM person_review;
    
    SELECT c.category_name, count(1) total, count(1)/vnTotalReviews * 100 percentage
    FROM category c
    INNER JOIN (SELECT se.category_id cat_id
				FROM social_event se INNER JOIN person_review r
				ON r.event_id = se.event_id) t
	ON t.cat_id = c.category_id
    GROUP BY c.category_name;
END;$$
