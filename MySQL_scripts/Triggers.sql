USE eventsProject;
/*TRIGGERS*/

-- Phone
DELIMITER $$
CREATE DEFINER= root@localhost TRIGGER Phone_BEFORE_INSERT 
BEFORE INSERT ON phone FOR EACH ROW 
BEGIN
	SET NEW.created_by := USER();
    SET NEW.creation_date := SYSDATE();
END;
$$
CREATE DEFINER= root@localhost TRIGGER Phone_BEFORE_UPDATE
BEFORE UPDATE ON phone FOR EACH ROW
BEGIN
	SET NEW.last_modified_by := USER();
    SET NEW.last_modification_date := SYSDATE();
END;
$$
###################################################################
-- Person
CREATE DEFINER= root@localhost TRIGGER Person_BEFORE_INSERT 
BEFORE INSERT ON person FOR EACH ROW 
BEGIN
	SET NEW.created_by := USER();
    SET NEW.creation_date := SYSDATE();
END;
$$

CREATE DEFINER= root@localhost TRIGGER Person_BEFORE_UPDATE
BEFORE UPDATE ON person FOR EACH ROW
BEGIN
	SET NEW.last_modified_by := USER();
    SET NEW.last_modification_date := SYSDATE();
END;
$$
###################################################################
-- Email
CREATE DEFINER= root@localhost TRIGGER Email_BEFORE_INSERT 
BEFORE INSERT ON email FOR EACH ROW 
BEGIN
	SET NEW.created_by := USER();
    SET NEW.creation_date := SYSDATE();
END;
$$

CREATE DEFINER= root@localhost TRIGGER Email_BEFORE_UPDATE
BEFORE UPDATE ON email FOR EACH ROW
BEGIN
	SET NEW.last_modified_by := USER();
    SET NEW.last_modification_date := SYSDATE();
END;
$$
###################################################################
-- Person_User
CREATE DEFINER= root@localhost TRIGGER Person_User_BEFORE_INSERT 
BEFORE INSERT ON person_user FOR EACH ROW 
BEGIN
	SET NEW.created_by := USER();
    SET NEW.creation_date := SYSDATE();
END;
$$

CREATE DEFINER= root@localhost TRIGGER Person_User_BEFORE_UPDATE
BEFORE UPDATE ON person_user FOR EACH ROW
BEGIN
	SET NEW.last_modified_by := USER();
    SET NEW.last_modification_date := SYSDATE();
END;
$$
###################################################################
-- User_Type
CREATE DEFINER= root@localhost TRIGGER User_Type_BEFORE_INSERT 
BEFORE INSERT ON user_type FOR EACH ROW 
BEGIN
	SET NEW.created_by := USER();
    SET NEW.creation_date := SYSDATE();
END;
$$

CREATE DEFINER= root@localhost TRIGGER User_Type_BEFORE_UPDATE
BEFORE UPDATE ON user_type FOR EACH ROW
BEGIN
	SET NEW.last_modified_by := USER();
    SET NEW.last_modification_date := SYSDATE();
END;
$$
###################################################################
-- Person_Comment
CREATE DEFINER= root@localhost TRIGGER Person_Comment_BEFORE_INSERT 
BEFORE INSERT ON person_comment FOR EACH ROW 
BEGIN
	SET NEW.created_by := USER();
    SET NEW.creation_date := SYSDATE();
END;
$$

CREATE DEFINER= root@localhost TRIGGER Person_Comment_BEFORE_UPDATE
BEFORE UPDATE ON person_comment FOR EACH ROW
BEGIN
	SET NEW.last_modified_by := USER();
    SET NEW.last_modification_date := SYSDATE();
END;
$$
###################################################################
-- Person_Review
CREATE DEFINER= root@localhost TRIGGER Person_Review_BEFORE_INSERT 
BEFORE INSERT ON person_review FOR EACH ROW 
BEGIN
	SET NEW.created_by := USER();
    SET NEW.creation_date := SYSDATE();
END;
$$

CREATE DEFINER= root@localhost TRIGGER Person_Review_BEFORE_UPDATE
BEFORE UPDATE ON person_review FOR EACH ROW
BEGIN
	SET NEW.last_modified_by := USER();
    SET NEW.last_modification_date := SYSDATE();
END;
$$
###################################################################
-- Person_Event_Status
CREATE DEFINER= root@localhost TRIGGER Person_Event_Status_BEFORE_INSERT 
BEFORE INSERT ON person_event_status FOR EACH ROW 
BEGIN
	SET NEW.created_by := USER();
    SET NEW.creation_date := SYSDATE();
END;
$$

CREATE DEFINER= root@localhost TRIGGER Person_Event_Status_BEFORE_UPDATE
BEFORE UPDATE ON person_event_status FOR EACH ROW
BEGIN
	SET NEW.last_modified_by := USER();
    SET NEW.last_modification_date := SYSDATE();
END;
$$
###################################################################
-- Status_Type
CREATE DEFINER= root@localhost TRIGGER Status_Type_BEFORE_INSERT 
BEFORE INSERT ON status_type FOR EACH ROW 
BEGIN
	SET NEW.created_by := USER();
    SET NEW.creation_date := SYSDATE();
END;
$$

CREATE DEFINER= root@localhost TRIGGER Status_Type_BEFORE_UPDATE
BEFORE UPDATE ON status_type FOR EACH ROW
BEGIN
	SET NEW.last_modified_by := USER();
    SET NEW.last_modification_date := SYSDATE();
END;
$$
###################################################################
-- Person_Event_Invitation
CREATE DEFINER= root@localhost TRIGGER Person_Event_Invitation_BEFORE_INSERT 
BEFORE INSERT ON person_event_invitation FOR EACH ROW 
BEGIN
	SET NEW.created_by := USER();
    SET NEW.creation_date := SYSDATE();
END;
$$

CREATE DEFINER= root@localhost TRIGGER Person_Event_Invitation_BEFORE_UPDATE
BEFORE UPDATE ON person_event_invitation FOR EACH ROW
BEGIN
	SET NEW.last_modified_by := USER();
    SET NEW.last_modification_date := SYSDATE();
END;
$$
###################################################################
-- Category
CREATE DEFINER= root@localhost TRIGGER Category_BEFORE_INSERT 
BEFORE INSERT ON category FOR EACH ROW 
BEGIN
	SET NEW.created_by := USER();
    SET NEW.creation_date := SYSDATE();
END;
$$

CREATE DEFINER= root@localhost TRIGGER Category_BEFORE_UPDATE
BEFORE UPDATE ON category FOR EACH ROW
BEGIN
	SET NEW.last_modified_by := USER();
    SET NEW.last_modification_date := SYSDATE();
END;
$$
###################################################################
-- Category_X_Person
CREATE DEFINER= root@localhost TRIGGER Category_X_Person_BEFORE_INSERT 
BEFORE INSERT ON category_x_person FOR EACH ROW 
BEGIN
	SET NEW.created_by := USER();
    SET NEW.creation_date := SYSDATE();
END;
$$

CREATE DEFINER= root@localhost TRIGGER Category_X_Person_BEFORE_UPDATE
BEFORE UPDATE ON category_x_person FOR EACH ROW
BEGIN
	SET NEW.last_modified_by := USER();
    SET NEW.last_modification_date := SYSDATE();
END;
$$
