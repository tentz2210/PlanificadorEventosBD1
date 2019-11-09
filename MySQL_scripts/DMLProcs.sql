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
CREATE PROCEDURE createCountry(IN p_country_name VARCHAR(30))
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

-- DELETE
CREATE PROCEDURE deleteCountry(IN p_country_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting country';
    END;
    
    DELETE FROM country
    WHERE country_id = p_country_id;
	COMMIT;
    
END;$$

/* Province */
-- INSERT
CREATE PROCEDURE createProvince(IN p_province_name VARCHAR(30), IN p_country_id int)
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

-- DELETE
CREATE PROCEDURE deleteProvince(IN p_province_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting province';
    END;
    
    DELETE FROM province
    WHERE province_id = p_province_id;
	COMMIT;
    
END;$$

/* Canton */
-- INSERT
CREATE PROCEDURE createCanton(IN p_canton_name VARCHAR(30), IN p_province_id int)
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

-- DELETE
CREATE PROCEDURE deleteCanton(IN p_canton_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting canton';
    END;
    
    DELETE FROM canton
    WHERE canton_id = p_canton_id;
	COMMIT;
    
END;$$

/* District */
-- INSERT
CREATE PROCEDURE createDistrict(IN p_district_name VARCHAR(30), IN p_canton_id int)
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

-- DELETE
CREATE PROCEDURE deleteDistrict(IN p_district_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting district';
    END;
    
    DELETE FROM district
    WHERE district_id = p_district_id;
	COMMIT;
    
END;$$

/* Adress */
-- INSERT
CREATE PROCEDURE createAdress(IN p_address_desc VARCHAR(100), IN p_district_id int)
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

-- DELETE
CREATE PROCEDURE deleteAddress(IN p_address_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting address';
    END;
    
    DELETE FROM address
    WHERE address_id = p_address_id;
	COMMIT;
    
END;$$

/* User Type */
-- INSERT
CREATE PROCEDURE createUserType(IN p_user_type_name VARCHAR(30))
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

-- DELETE
CREATE PROCEDURE deleteUserType(IN p_user_type_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting user type';
    END;
    
    DELETE FROM user_type
    WHERE user_type_id = p_user_type_id;
	COMMIT;
    
END;$$

/* Social Event */
-- INSERT
CREATE PROCEDURE createSocialEvent(IN p_person_id int, IN p_address_id int, IN p_category_id int, IN p_event_tile VARCHAR(50),
								   IN p_event_description VARCHAR(400), IN p_start_date VARCHAR(20), IN p_end_date VARCHAR(20),
                                   IN p_is_private tinyint, IN p_photo VARCHAR(30))
BEGIN
	DECLARE v_event_id int;
    DECLARE v_start_date DATE;
    DECLARE v_end_date DATE;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting event';
    END;
    
    SET v_event_id = LAST_INSERT_ID();
    SET v_start_date := STR_TO_DATE(p_start_date, '%d/%m/%Y %H:%i');
    SET v_end_date := STR_TO_DATE(p_end_date, '%d/%m/%Y %H:%i');
    INSERT INTO social_event(event_id,person_id,address_id,category_id,event_title,event_description,start_date,end_date,isPrivate,photo)
    VALUES (v_event_id,p_person_id,p_address_id,p_category_id,p_event_title,p_event_description,v_start_date,v_end_date,p_is_private,p_photo);
    COMMIT;
END;$$

-- DELETE
CREATE PROCEDURE deleteSocialEvent(IN p_social_event_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error deleting social event';
    END;
    
    DELETE FROM event
    WHERE event_id = p_social_event_id;
	COMMIT;
    
END;$$

/* Person */
-- INSERT
CREATE PROCEDURE createPerson(IN p_first_name VARCHAR(30), IN p_middle_name VARCHAR(30), IN p_last_name VARCHAR(30), IN p_id int,
							  IN p_date_of_birth VARCHAR(10), IN p_photo VARCHAR(30))
BEGIN
	DECLARE v_person_id int;
    DECLARE v_birth_date DATE;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting person';
    END;
    
    SET v_person_id = LAST_INSERT_ID();
    SET v_birth_date := STR_TO_DATE(p_date_of_birth, '%d/%m/%Y');
    INSERT INTO person(person_id,first_name,middle_name,last_name,id,date_of_birth,photo)
    VALUES (v_person_id,p_first_name,p_middle_name,p_last_name,p_id,v_birth_date,p_photo);
    COMMIT;
END;$$

/* Parameter */
-- INSERT
CREATE PROCEDURE createParameter(IN p_parameter_name VARCHAR(20), IN p_parameter_value int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting parameter';
    END;
    
    INSERT INTO parameter(parameter_name,parameter_value)
    VALUES (p_parameter_name,p_parameter_value);
    COMMIT;
END;$$

/* Person Event Status */
-- INSERT
CREATE PROCEDURE createPersonEventStatus(IN p_person_id int, IN p_event_id int, IN p_status_type_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting person\'s status for selected event';
    END;
    
    INSERT INTO person_event_status(person_id,event_id,status_type_id)
    VALUES (p_person_id,p_event_id,p_status_type_id);
    COMMIT;
END;$$

/* Person Event Invitation */
-- INSERT
CREATE PROCEDURE createPersonEventInvitation(IN p_person_id int, IN p_event_id int)
BEGIN
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting person\'s invitation for selected event';
    END;
    
    INSERT INTO person_event_invitation(person_id,event_id)
    VALUES (p_person_id,p_event_id);
    COMMIT;
END;$$

/* Category */
-- INSERT
CREATE PROCEDURE createCategory(IN p_category_name VARCHAR(30))
BEGIN
	DECLARE v_category_id int;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting category';
    END;
    
    SET v_category_id = LAST_INSERT_ID();
    INSERT INTO category(category_id,category_name)
    VALUES (v_category_id,p_category_name);
    COMMIT;
END;$$

/* Status Type */
-- INSERT
CREATE PROCEDURE createStatusType(IN p_status_name VARCHAR(20))
BEGIN
	DECLARE v_status_id int;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting status type';
    END;
    
    SET v_status_id = LAST_INSERT_ID();
    INSERT INTO status_type(status_type_id,status_name)
    VALUES (v_status_id,p_status_name);
    COMMIT;
END;$$

/* Person Comment */
-- INSERT
CREATE PROCEDURE createPersonComment(IN p_person_id int, IN p_event_id int, IN p_comment VARCHAR(400), IN p_photo VARCHAR(30))
BEGIN
	DECLARE v_comment_id int;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		ROLLBACK;
        SELECT 'Error inserting comment';
    END;
    
    SET v_comment_id = LAST_INSERT_ID();
    INSERT INTO person_comment(comment_id,person_id,event_id,comment_body,photo)
    VALUES (v_comment_id,p_person_id,p_event_id,p_comment,p_photo);
    COMMIT;
END;$$
