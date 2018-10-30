# connect to mysql and run as root user
#Create Databases
CREATE DATABASE sf_dev;
CREATE DATABASE sf_prod;

#Create database accounts

CREATE USER 'sf_dev_user'@'localhost'  IDENTIFIED WITH mysql_native_password BY 'ic';
CREATE USER 'sf_prod_user'@'localhost'  IDENTIFIED WITH mysql_native_password BY 'ic';
CREATE USER 'sf_dev_user'@'%'  IDENTIFIED WITH mysql_native_password BY 'ic';
CREATE USER 'sf_prod_user'@'%'  IDENTIFIED WITH mysql_native_password BY 'ic';

#Database grants
GRANT SELECT ON sf_dev.* to 'sf_dev_user'@'localhost';
GRANT INSERT ON sf_dev.* to 'sf_dev_user'@'localhost';
GRANT DELETE ON sf_dev.* to 'sf_dev_user'@'localhost';
GRANT UPDATE ON sf_dev.* to 'sf_dev_user'@'localhost';
GRANT SELECT ON sf_prod.* to 'sf_prod_user'@'localhost';
GRANT INSERT ON sf_prod.* to 'sf_prod_user'@'localhost';
GRANT DELETE ON sf_prod.* to 'sf_prod_user'@'localhost';
GRANT UPDATE ON sf_prod.* to 'sf_prod_user'@'localhost';
GRANT SELECT ON sf_dev.* to 'sf_dev_user'@'%';
GRANT INSERT ON sf_dev.* to 'sf_dev_user'@'%';
GRANT DELETE ON sf_dev.* to 'sf_dev_user'@'%';
GRANT UPDATE ON sf_dev.* to 'sf_dev_user'@'%';
GRANT SELECT ON sf_prod.* to 'sf_prod_user'@'%';
GRANT INSERT ON sf_prod.* to 'sf_prod_user'@'%';
GRANT DELETE ON sf_prod.* to 'sf_prod_user'@'%';
GRANT UPDATE ON sf_prod.* to 'sf_prod_user'@'%';