/* Queries */
/* FUNCTIONS AND PROCEDURES */

DELIMITER $$
/* ADMINS */
-- Point a
DROP PROCEDURE getInvitedUsers;$$
CREATE PROCEDURE getInvitedUsers(IN filter_status_id int, IN filter_owner_id int)
BEGIN
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
    SET vStartDate := STR_TO_DATE(filter_start_date, '%d/%m/%Y');
    SET vEndDate := STR_TO_DATE(filter_end_date, '%d/%m/%Y');
    
	SELECT event_title, start_date, end_date
    FROM social_event
    WHERE event_id NOT IN (
		SELECT event_id FROM event_log
    )
    AND se.start_date <= IFNULL(vStartDate, se.start_date)
    AND se.end_date >= IFNULL(vEndDate, se.end_date);
END;$$
