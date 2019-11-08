USE eventsProject;
/* DML Procedures */
-- On user root
DELIMITER $$
/* Phone */
-- INSERT
CREATE PROCEDURE createPhone(IN p_phonenumber int, IN p_person_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting phone';
    END;
    
    INSERT INTO phone(phone_number, person_id)
    VALUES (p_phonenumber, p_person_id);
    COMMIT;
END;$$

-- UPDATE
CREATE PROCEDURE updatePhone(IN p_new_phonenumber int, IN p_old_phonenumber int, IN p_person_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error updating phone';
    END;
    
    UPDATE phone
    SET phone_number = p_new_phonenumber
    WHERE (phone_number, person_id) = (p_old_phonenumber, p_person_id);
    COMMIT;
END;$$

-- DELETE
CREATE PROCEDURE deletePhone(IN p_phonenumber int, IN p_person_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting phone';
    END;
    
    DELETE FROM phone
    WHERE (phone_number, person_id) = (p_phonenumber, p_person_id);
    COMMIT;
END;$$

/* Event_Log */
-- INSERT
CREATE PROCEDURE createEventLog(IN p_event_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting event log';
    END;
    
    INSERT INTO event_log(event_id)
    VALUES (p_event_id);
    COMMIT;
END;$$

-- DELETE
CREATE PROCEDURE deleteEventLog(IN p_event_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting event log';
    END;
    
    DELETE FROM event_log
    WHERE event_id = p_event_id;
    COMMIT;
END;$$

/* Category_X_Person */
-- INSERT
CREATE PROCEDURE createPersonFavorite(IN p_person_id int, IN p_category_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting favorite category for user';
    END;
    
    INSERT INTO category_x_person(person_id, category_id)
    VALUES (p_person_id, p_category_id);
    COMMIT;
END;$$

-- DELETE
CREATE PROCEDURE deletePersonFavorite(IN p_person_id int, IN p_category_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting favorite category for user';
    END;
    
    DELETE FROM category_x_person
    WHERE (person_id, category_id) = (p_person_id, p_category_id);
    COMMIT;
END;$$

/* Person_Review */
-- INSERT
CREATE PROCEDURE createPersonReview(IN p_person_id int, IN p_event_id int, IN p_rating int, IN p_comment VARCHAR(300))
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error creating user review';
    END;
    
    INSERT INTO person_review(person_id, event_id, rating, review_comment)
    VALUES(p_person_id, p_event_id, p_rating, p_comment);
    COMMIT;
END;$$

-- UPDATE
CREATE PROCEDURE updateReview(IN p_person_id int, IN p_event_id int, IN p_new_comment VARCHAR(300), IN p_new_rating int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error updating review';
    END;

	UPDATE person_review
    SET review_comment = IFNULL(p_new_comment, review_comment),
		rating = IFNULL(p_new_rating, rating)
    WHERE (person_id, event_id) = (p_person_id, p_event_id);
    COMMIT;
END;$$

-- DELETE
CREATE PROCEDURE deleteReview(IN p_person_id int, IN p_event_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting review';
    END;
    
    DELETE FROM person_review
    WHERE (person_id, event_id) = (p_person_id, p_event_id);
    COMMIT;
END;$$

/* Person_User */
-- REGISTER USER
CREATE PROCEDURE registerUser(IN p_first_name VARCHAR(30), IN p_middle_name VARCHAR(30), IN p_last_name VARCHAR(30),
							  IN p_id int, IN p_date_of_birth VARCHAR(11), IN p_photo VARCHAR(30),
                              IN p_username VARCHAR(30), IN p_password VARCHAR(30), IN p_user_type_id int,
                              IN p_phone_number int, IN p_email VARCHAR(50))
BEGIN
	DECLARE v_person_id int;
    DECLARE v_date_of_birth DATE;

	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error creating user/person';
    END;
    
    SET v_date_of_birth := STR_TO_DATE(p_date_of_birth, '%d/%m/%Y');
    
    INSERT INTO person(first_name, middle_name, last_name, id, date_of_birth, photo)
    VALUES(p_first_name, p_middle_name, p_last_name, p_id, v_date_of_birth, p_photo);
    SET v_person_id = LAST_INSERT_ID();
    
    INSERT INTO person_user(person_id, username, user_password, user_type_id)
    VALUES(v_person_id, p_username, p_password, p_user_type_id);
    
    INSERT INTO phone(phone_number, person_id)
    VALUES (p_phone_number, v_person_id);
    
    INSERT INTO email(email_address, person_id)
    VALUES (p_email, v_person_id);
    
    COMMIT;
END;$$

-- DELETE USER
CREATE PROCEDURE deleteUser(IN p_user_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting user';
    END;
    
    DELETE FROM person_user
    WHERE user_id = p_user_id;
    COMMIT;
END;$$

/* Email */
-- INSERT
CREATE PROCEDURE createEmail(IN p_email_address VARCHAR(50), IN p_person_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error creating email address';
    END;
    
    INSERT INTO email(email_address, person_id)
    VALUES (p_email_address, p_person_id);
    COMMIT;
END;$$

-- UPDATE
CREATE PROCEDURE updateEmail(IN p_old_email_address VARCHAR(50), IN p_new_email_address VARCHAR(50), IN p_person_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error updating email address';
    END;
    
    UPDATE email
    SET email_address = p_new_email_address
    WHERE (email_address, person_id) = (p_old_email_address, p_person_id);
    COMMIT;
END;$$

-- DELETE
CREATE PROCEDURE deleteEmail(IN p_email_address VARCHAR(50), IN p_person_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting email address';
    END;
    
    DELETE FROM email
    WHERE (email_address, person_id) = (p_email_address, p_person_id);
	COMMIT;
    
END;$$

/* Country */
-- INSERT
CREATE PROCEDURE createCountry(IN p_country_name VARCHAR(35))
BEGIN
	DECLARE v_country_id int;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting country';
    END;
    
    SET v_country_id = LAST_INSERT_ID();
    INSERT INTO country(country_id,country_name)
    VALUES (v_country_id,p_country_name);
    COMMIT;
END;$$

/* Province */
-- INSERT
CREATE PROCEDURE createProvince(IN p_province_name VARCHAR(35), IN p_country_id int)
BEGIN
	DECLARE v_province_id int;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting province';
    END;
    
    SET v_province_id = LAST_INSERT_ID();
    INSERT INTO province(province_id,country_id,province_name)
    VALUES (v_province_id,p_country_id,p_province_name);
    COMMIT;
END;$$

/* Canton */
-- INSERT
CREATE PROCEDURE createCanton(IN p_canton_name VARCHAR(35), IN p_province_id int)
BEGIN
	DECLARE v_canton_id int;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting canton';
    END;
    
    SET v_canton_id = LAST_INSERT_ID();
    INSERT INTO canton(canton_id,province_id,canton_name)
    VALUES (v_canton_id,p_province_id,p_canton_name);
    COMMIT;
END;$$

/* District */
-- INSERT
CREATE PROCEDURE createDistrict(IN p_district_name VARCHAR(35), IN p_canton_id int)
BEGIN
	DECLARE v_district_id int;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting district';
    END;
    
    SET v_district_id = LAST_INSERT_ID();
    INSERT INTO district(district_id,canton_id,district_name)
    VALUES (v_district_id,p_canton_id,p_district_name);
    COMMIT;
END;$$

/* Adress */
-- INSERT
CREATE PROCEDURE createAdress(IN p_address_desc VARCHAR(200), IN p_district_id int)
BEGIN
	DECLARE v_address_id int;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting adress';
    END;
    
    SET v_address_id = LAST_INSERT_ID();
    INSERT INTO address(address_id,district_id,address_description)
    VALUES (v_address_id,p_district_id,p_address_desc);
    COMMIT;
END;$$

/* User Type */
-- INSERT
CREATE PROCEDURE createUserType(IN p_user_type_name VARCHAR(35))
BEGIN
	DECLARE v_user_type_id int;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting user type';
    END;
    
    SET v_user_type_id = LAST_INSERT_ID();
    INSERT INTO user_type(user_type_id,user_type_name)
    VALUES (v_user_type_id,p_user_type_name);
    COMMIT;
END;$$
