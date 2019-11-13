USE eventsProject;

/* TABLES */

-- Phone
CREATE TABLE phone (
  phone_number int NOT NULL COMMENT 'User phone number',
  person_id int NOT NULL COMMENT 'Foreign key to the person that owns the phone number',
  creation_date date NOT NULL COMMENT 'Row date of creation',
  created_by varchar(30) NOT NULL COMMENT 'User which created the row',
  last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
  last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row',
  PRIMARY KEY (phone_number,person_id),
  UNIQUE KEY phone_number_UNIQUE (phone_number)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of users'' phone numbers';

-- Foreign keys
ALTER TABLE phone
	ADD CONSTRAINT person_phone_fk FOREIGN KEY (person_id) REFERENCES person(person_id);
####################################################################################################
-- Person
CREATE TABLE person (
	person_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'Person numeric identifier',
    first_name VARCHAR(30) NOT NULL COMMENT 'Person''s first name',
    middle_name VARCHAR(30) NOT NULL COMMENT 'Person''s middle name',
    last_name VARCHAR(30) NOT NULL COMMENT 'Person''s last name',
    id int NOT NULL COMMENT 'Person''s personal identification number',
    date_of_birth DATE NOT NULL COMMENT 'Person''s date of birth',
    photo VARCHAR(30) NOT NULL COMMENT 'Person''s profile picture filename',
    creation_date date NOT NULL COMMENT 'Row date of creation',
	created_by varchar(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of users with their information';

-- UNIQUE CONSTRAINTS
ALTER TABLE person 
	ADD CONSTRAINT person_id_uk UNIQUE (id);
####################################################################################################
-- Email
CREATE TABLE email (
	email_address VARCHAR(50) NOT NULL COMMENT 'User''s email address',
    person_id int NOT NULL COMMENT 'Foreign key to the person which owns the email address',
    creation_date date NOT NULL COMMENT 'Row date of creation',
	created_by varchar(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row',
    PRIMARY KEY (email_address, person_id),
    UNIQUE KEY email_address_uk (email_address)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of users'' email adresses';

-- Foreign keys
ALTER TABLE email
	ADD CONSTRAINT person_email_fk FOREIGN KEY (person_id) REFERENCES person(person_id);
#############################################################################################################
-- Person_User
CREATE TABLE person_user(
	user_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'User numeric identifier',
    username VARCHAR(30) NOT NULL COMMENT 'User''s username for credentials verification',
    user_password VARCHAR(30) NOT NULL COMMENT 'User''s password for credentials verification',
    person_id int NOT NULL COMMENT 'Reference to the person linked to the user account',
    user_type_id int NOT NULL COMMENT 'Reference to the user type',
    creation_date date NOT NULL COMMENT 'Row date of creation',
	created_by varchar(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of users'' account information';

-- Foreign keys
ALTER TABLE person_user
	ADD CONSTRAINT user_person_fk FOREIGN KEY (person_id) REFERENCES person(person_id),
    ADD CONSTRAINT user_usertype_fk FOREIGN KEY (user_type_id) REFERENCES user_type(user_type_id);
-- UNIQUE CONSTRAINTS
ALTER TABLE person_user
	ADD CONSTRAINT user_name_uk UNIQUE (username);
##############################################################################################################
-- User_Type
CREATE TABLE user_type(
	user_type_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'User type numeric identifier',
	user_type_name VARCHAR(30) NOT NULL COMMENT 'User type name identifier',
	creation_date date NOT NULL COMMENT 'Row date of creation',
	created_by varchar(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row',
    UNIQUE KEY user_type_name_uk (user_type_name)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of available user types';

##########################################################################################################
-- Comment
CREATE TABLE person_comment(
	comment_id int NOT NULL AUTO_INCREMENT COMMENT 'Comment numeric identifier',
    person_id int NOT NULL COMMENT 'Reference of person who made the comment',
    event_id int NOT NULL COMMENT 'Reference of social event that was commented',
    comment_body VARCHAR(400) DEFAULT NULL COMMENT 'Text body of the comment',
    photo VARCHAR(30) DEFAULT NULL COMMENT 'Filename of photo attached to the comment',
    creation_date date NOT NULL COMMENT 'Row date of creation',
	created_by varchar(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row',
    PRIMARY KEY (comment_id, person_id, event_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Table containing comments users make on social events';

-- Foreign keys
ALTER TABLE person_comment
	ADD CONSTRAINT comment_person_fk FOREIGN KEY (person_id) REFERENCES person(person_id),
    ADD CONSTRAINT comment_social_event_fk FOREIGN KEY (event_id) REFERENCES social_event(event_id);
###################################################################################################################
-- Review
CREATE TABLE person_review(
	person_id int NOT NULL COMMENT 'Reference to the person which made the review',
    event_id int NOT NULL COMMENT 'Reference to the social event that is reviewed',
    rating int NOT NULL COMMENT '0-100% rating of the event',
    review_comment VARCHAR(300) DEFAULT NULL COMMENT 'User comment for the review',
    creation_date date NOT NULL COMMENT 'Row date of creation',
	created_by varchar(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row',
    CONSTRAINT rating_percent_range CHECK(rating>=0 AND rating<=100),
    PRIMARY KEY (person_id, event_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Table containing user reviews for different events';

-- Foreign keys
ALTER TABLE person_review
	ADD CONSTRAINT review_person_fk FOREIGN KEY (person_id) REFERENCES person(person_id),
    ADD CONSTRAINT review_social_event_fk FOREIGN KEY (event_id) REFERENCES social_event(event_id);
###################################################################################################################
-- Status
CREATE TABLE person_event_status(
	person_id int NOT NULL COMMENT 'Reference to the person which owns the status',
    event_id int NOT NULL COMMENT 'Reference to the social event related to the status',
    status_type_id int NOT NULL COMMENT 'Reference to the status',
    creation_date date NOT NULL COMMENT 'Row date of creation',
	created_by varchar(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row',
    PRIMARY KEY (person_id, event_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Table containing user status for different events';

-- Foreign keys
ALTER TABLE person_event_status
	ADD CONSTRAINT status_person_fk FOREIGN KEY (person_id) REFERENCES person(person_id),
    ADD CONSTRAINT status_social_event_fk FOREIGN KEY (event_id) REFERENCES social_event(event_id),
    ADD CONSTRAINT status_type_fk FOREIGN KEY (status_type_id) REFERENCES status_type(status_type_id);
###################################################################################################################
-- Status_Type
CREATE TABLE status_type(
	status_type_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'Numeric identifier for the status type',
    status_name VARCHAR(20) NOT NULL COMMENT 'Status type name',
    creation_date date NOT NULL COMMENT 'Row date of creation',
	created_by varchar(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of person status towards events';
###################################################################################################################
-- Invitation
CREATE TABLE person_event_invitation(
	person_id int NOT NULL COMMENT 'Reference to the person that is invited',
    event_id int NOT NULL COMMENT 'Reference to the event linked to the invitation',
    creation_date date NOT NULL COMMENT 'Row date of creation',
	created_by varchar(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row',
    PRIMARY KEY (person_id, event_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Table that contains person invitations to events';

ALTER TABLE person_event_invitation
	ADD CONSTRAINT invitation_person_fk FOREIGN KEY (person_id) REFERENCES person(person_id),
    ADD CONSTRAINT invitation_social_event_fk FOREIGN KEY (event_id) REFERENCES social_event(event_id);
###################################################################################################################
-- Category
CREATE TABLE category(
	category_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'Category numeric identifier',
    category_name VARCHAR(30) NOT NULL COMMENT 'Name of the category',
    creation_date date NOT NULL COMMENT 'Row date of creation',
	created_by varchar(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of available categories for social events';
###################################################################################################################
ALTER TABLE category
	ADD CONSTRAINT category_name_uk UNIQUE (category_name);
-- Category_X_Person
CREATE TABLE category_x_person(
	person_id int NOT NULL COMMENT 'Reference of the person linked to the category',
    category_id int NOT NULL COMMENT 'Reference of the category linked to the person',
    creation_date date NOT NULL COMMENT 'Row date of creation',
	created_by varchar(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row',
    PRIMARY KEY (person_id, category_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='	Table containing the favorite categories of each user';

-- Foreign keys
ALTER TABLE category_x_person
	ADD CONSTRAINT cxp_person_fk FOREIGN KEY (person_id) REFERENCES person(person_id),
    ADD CONSTRAINT cxp_category_fk FOREIGN KEY (category_id) REFERENCES category(category_id);
##################################################################################################################
-- Social_Event
CREATE TABLE social_event(
	event_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'Social event numeric identifier',
    person_id int NOT NULL COMMENT 'Reference to the person which created the social event',
    address_id int NOT NULL COMMENT 'Reference to the address where the social event is held',
    category_id int NOT NULL COMMENT 'Reference to the category of the event',
    event_title VARCHAR(50) NOT NULL COMMENT 'Event name or title',
    event_description VARCHAR(400) NOT NULL COMMENT 'Text describing the event',
    start_date DATE NOT NULL COMMENT 'Date of event beginnning',
    end_date DATE NOT NULL COMMENT 'Date of event end',
    isPrivate BOOLEAN NOT NULL DEFAULT FALSE COMMENT 'Boolean field for event privacy',
    photo VARCHAR(30) NOT NULL COMMENT 'Photo filename for social event',
    creation_date date NOT NULL COMMENT 'Row date of creation',
	created_by varchar(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date date DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by varchar(30) DEFAULT NULL COMMENT 'Last user which modified the row'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Table containing social events';

-- Foreign keys
ALTER TABLE social_event
	ADD CONSTRAINT event_person_fk FOREIGN KEY (person_id) REFERENCES person(person_id),
    ADD CONSTRAINT event_category_fk FOREIGN KEY (category_id) REFERENCES category(category_id),
    ADD CONSTRAINT event_address_fk FOREIGN KEY (address_id) REFERENCES address(address_id);
##############################################################################################################
-- Address
CREATE TABLE address(
	address_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'Numeric identifier for addresses',
    district_id int NOT NULL COMMENT 'Reference to the district of the address',
    address_description VARCHAR(100) NOT NULL COMMENT 'Written specific address',
    creation_date DATE NOT NULL COMMENT 'Row date of creation',
	created_by VARCHAR(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date DATE DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by VARCHAR(30) DEFAULT NULL COMMENT 'Last user which modified the row'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of addresses for social events';

-- Foreign keys
ALTER TABLE address
	ADD CONSTRAINT address_district_fk FOREIGN KEY (district_id) REFERENCES district(district_id);
#################################################################################################################
-- District
CREATE TABLE district(
	district_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'District numeric identifier',
    canton_id int NOT NULL COMMENT 'Reference to the canton of the district',
    district_name VARCHAR(30) COMMENT 'District name',
    creation_date DATE NOT NULL COMMENT 'Row date of creation',
	created_by VARCHAR(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date DATE DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by VARCHAR(30) DEFAULT NULL COMMENT 'Last user which modified the row'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of districts';

-- Foreign keys
ALTER TABLE district
	ADD CONSTRAINT district_canton_fk FOREIGN KEY (canton_id) REFERENCES canton(canton_id);
################################################################################################################
-- Canton
CREATE TABLE canton(
	canton_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'Canton numeric identifier',
    province_id int NOT NULL COMMENT 'Reference to the province of the canton',
    canton_name VARCHAR(30) COMMENT 'Canton name',
    creation_date DATE NOT NULL COMMENT 'Row date of creation',
	created_by VARCHAR(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date DATE DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by VARCHAR(30) DEFAULT NULL COMMENT 'Last user which modified the row'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of cantons';

-- Foreign keys
ALTER TABLE canton
	ADD CONSTRAINT canton_province_fk FOREIGN KEY (province_id) REFERENCES province(province_id);
################################################################################################################
-- Province
CREATE TABLE province(
	province_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'Province numeric identifier',
    country_id int NOT NULL COMMENT 'Reference to the country of the province',
    province_name VARCHAR(30) COMMENT 'Province name',
    creation_date DATE NOT NULL COMMENT 'Row date of creation',
	created_by VARCHAR(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date DATE DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by VARCHAR(30) DEFAULT NULL COMMENT 'Last user which modified the row'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of provinces';

-- Foreign keys
ALTER TABLE province
	ADD CONSTRAINT province_country_fk FOREIGN KEY (country_id) REFERENCES country(country_id);
ALTER TABLE province
	ADD CONSTRAINT province_country_uk UNIQUE (country_id,province_name);
################################################################################################################
-- Country
CREATE TABLE country(
	country_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'Country numeric identifier',
    country_name VARCHAR(30) NOT NULL COMMENT 'Country name',
    creation_date DATE NOT NULL COMMENT 'Row date of creation',
	created_by VARCHAR(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date DATE DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by VARCHAR(30) DEFAULT NULL COMMENT 'Last user which modified the row'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of countries';
ALTER TABLE country
	ADD CONSTRAINT country_name_uk UNIQUE (country_name);
################################################################################################################
-- Parameter
CREATE TABLE parameter(
	parameter_name VARCHAR(20) NOT NULL COMMENT 'Parameter name and primary key',
    parameter_value int NOT NULL COMMENT 'Parameter value',
    creation_date DATE NOT NULL COMMENT 'Row date of creation',
	created_by VARCHAR(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date DATE DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by VARCHAR(30) DEFAULT NULL COMMENT 'Last user which modified the row',
    PRIMARY KEY (parameter_name)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of parameters';
################################################################################################################
-- Event_Log
CREATE TABLE event_log(
	log_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'Log numeric id',
    event_id int NOT NULL COMMENT 'Reference to the event that ended',
    creation_date DATE NOT NULL COMMENT 'Row date of creation',
	created_by VARCHAR(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date DATE DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by VARCHAR(30) DEFAULT NULL COMMENT 'Last user which modified the row'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Repository of parameters';

-- Foreign keys
ALTER TABLE event_log
	ADD CONSTRAINT log_event_fk FOREIGN KEY (event_id) REFERENCES social_event(event_id);

################################################################################################################
-- User Event Report
CREATE TABLE user_event_report(
	report_id int NOT NULL COMMENT 'Reference to the linked report',
    person_id int NOT NULL COMMENT 'Reference to the person liked to the report',
    event_id int NOT NULL COMMENT 'Reference to the event to be reminded',
    creation_date DATE NOT NULL COMMENT 'Row date of creation',
	created_by VARCHAR(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date DATE DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by VARCHAR(30) DEFAULT NULL COMMENT 'Last user which modified the row',
    PRIMARY KEY(report_id, person_id, event_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Table containing generated reports for daily user reminders';

ALTER TABLE user_event_report
	ADD CONSTRAINT user_event_report_report_fk FOREIGN KEY (report_id) REFERENCES report(report_id),
    ADD CONSTRAINT user_event_report_person_fk FOREIGN KEY (person_id) REFERENCES person(person_id),
    ADD CONSTRAINT user_event_report_event_fk FOREIGN KEY (event_id) REFERENCES social_event(event_id);
################################################################################################################
-- Report
CREATE TABLE report(
	report_id int AUTO_INCREMENT PRIMARY KEY COMMENT 'Report numeric id',
    report_date DATE NOT NULL COMMENT 'Date when report was generated',
    creation_date DATE NOT NULL COMMENT 'Row date of creation',
	created_by VARCHAR(30) NOT NULL COMMENT 'User which created the row',
	last_modification_date DATE DEFAULT NULL COMMENT 'Last date of row modification',
	last_modified_by VARCHAR(30) DEFAULT NULL COMMENT 'Last user which modified the row'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Table containing reports and the date of generation';
