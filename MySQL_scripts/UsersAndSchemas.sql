/*On user root*/
CREATE DATABASE eventsProject;
USE eventsProject;

-- DB Users
CREATE USER 'PE'@'%' IDENTIFIED BY 'PE';
GRANT USAGE ON *.* TO PE@'%';

GRANT ALL PRIVILEGES ON eventsproject.* TO 'PE'@'%'; 

SHOW GRANTS FOR PE;