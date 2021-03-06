# SpringBoot-Security-MySQL

## Spring Security Architecture

![spring security arch diagram](https://user-images.githubusercontent.com/9671419/87207889-a905e500-c32a-11ea-9c81-cc39e39188bd.JPG)

## Database MySQL :

create database mysecurity;

use mysecurity;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `active` int(11) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

select * from user;

INSERT INTO `user` (`user_id`, `active`, `email`, `last_name`, `name`, `password`)
VALUES	(1,1,'admin@gmail.com','s','Dowlath','dowlath'), (2,1,'admin@gmail.com','s','youtube','youtube');
    
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `role` (`role_id`, `role`)
VALUES (1,'ADMIN');
    
CREATE TABLE `user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `user_role` (`user_id`, `role_id`)
VALUES (1,1);
  
## application.properties 

spring.datasource.url=jdbc:mysql://localhost:3306/mysecurity

spring.datasource.username=root

spring.datasource.password =root123

spring.datasource.testWhileIdle=true

spring.datasource.validationQuery=SELECT 1

spring.jpa.show-sql=true

spring.jpa.hibernate.ddl-auto=update

spring.jpa.hibernate.naming-strategy=org.hibernate.cfg.ImprovedNamingStrategy

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

server.port = 9111

## URL's :

http://localhot:9111/rest/hello

![my_1](https://user-images.githubusercontent.com/9671419/87023717-c38a7200-c1f5-11ea-8145-dc6a016c7895.PNG)

http://localhost:9111/rest/hello/secured/all

User Name : Dowlath

Password : dowlath

![my_2](https://user-images.githubusercontent.com/9671419/87023720-c4bb9f00-c1f5-11ea-9904-46868eb57d2b.PNG)

![My_3](https://user-images.githubusercontent.com/9671419/87023722-c5543580-c1f5-11ea-8a8f-8cfa032ccf1e.PNG)

