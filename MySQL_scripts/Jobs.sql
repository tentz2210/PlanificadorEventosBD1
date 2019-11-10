/* JOBS PROCEDURES */ 

SET GLOBAL event_scheduler = ON;

-- get finished events
DELIMITER $$

CREATE PROCEDURE checkFinishedEvents()
BEGIN
	DECLARE done INT DEFAULT FALSE;
    DECLARE v_finished_event_id int DEFAULT 0;
    
	DECLARE cursor_new_finished_events CURSOR FOR
	SELECT event_id
    FROM social_event
    WHERE end_date < SYSDATE()
      AND event_id NOT IN (SELECT event_id
						   FROM event_log);
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error updating event log';
    END;
    
    OPEN cursor_new_finished_events;
    read_loop: LOOP
		FETCH cursor_new_finished_events into v_finished_event_id;
		IF done THEN
			LEAVE read_loop;
		END IF;
        INSERT INTO event_log(event_id)
        VALUES(v_finished_event_id);
	END LOOP;
    
    CLOSE cursor_new_finished_events;
    COMMIT;
END;$$

CREATE EVENT finished_Events_Checker
ON SCHEDULE EVERY 30 MINUTE
STARTS CURRENT_TIMESTAMP
DO
	CALL checkFinishedEvents();$$
    
CREATE PROCEDURE generatePendingEventsReport()
BEGIN
	DECLARE v_report_id int;
    DECLARE v_person_id int;
    DECLARE v_event_id int;
    DECLARE done int DEFAULT FALSE;
    
    DECLARE cursor_report CURSOR FOR
    SELECT pes.person_id, se.event_id
    FROM social_event se INNER JOIN person_event_status pes
    ON se.event_id = pes.event_id
    WHERE se.start_date > SYSDATE()
      AND pes.status_type_id = 2; -- PARAMETRO DE ASISTIR
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error generating report';
    END;
    
    INSERT INTO report(report_date)
    VALUES(SYSDATE());
    SET v_report_id := LAST_INSERT_ID();
    
    OPEN cursor_report;
    read_loop: LOOP
		FETCH cursor_report into v_person_id, v_event_id;
		IF done THEN
			LEAVE read_loop;
		END IF;
        INSERT INTO user_event_report(event_id, person_id, report_id)
        VALUES(v_event_id, v_person_id, v_report_id);
	END LOOP;
    CLOSE cursor_report;
    
    COMMIT;
END;$$

CREATE EVENT daily_report_generator
ON SCHEDULE EVERY 1 DAY
STARTS DATE_ADD(CONCAT(DATE(SYSDATE()), ' 01:00:00'), INTERVAL 1 DAY)
DO
	CALL generatePendingEventsReport();$$

