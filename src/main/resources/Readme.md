create database management
use management;

CREATE TABLE employee (
    empId INT PRIMARY KEY not null AUTO_INCREMENT,
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    jobTitle VARCHAR(255),
    department VARCHAR(255),
    salary DECIMAL(10, 2),
    hireDate Timestamp
);