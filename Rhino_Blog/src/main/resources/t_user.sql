CREATE TABLE `t_user`(
                       `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'primary key',
                       `user_id` VARCHAR(32) DEFAULT 'NULL' COMMENT 'USER ID',
                       `user_name` VARCHAR(64) NOT NULL DEFAULT 'NULL' COMMENT 'USER NAME',
                       `nick_name` VARCHAR(64) NOT NULL DEFAULT 'NULL' COMMENT 'NICK NAME',
                       `password` VARCHAR(64) NOT NULL DEFAULT 'NULL' COMMENT 'PASSWORD',
                       `status` CHAR(1) DEFAULT '0' COMMENT 'ACCOUNT STATUS (0:ACTIVE,1:INACTIVE)',
                       `email` VARCHAR(64) DEFAULT 'NULL' COMMENT 'EMAIL',
                       `phone_number` VARCHAR(32) DEFAULT 'NULL' COMMENT 'PHONE NUMBER',
                       `sex` CHAR(1) DEFAULT NULL COMMENT 'SEX 0:Male 1:Female 2:Unknown',
                       `avatar` VARCHAR(128) DEFAULT 'NULL' COMMENT 'AVATAR',
                       `user_type` CHAR(1) NOT NULL DEFAULT '1' COMMENT 'USER TYPE(0:ADMINISTRATOR,1:USER)',
                       `create_time` VARCHAR(32) DEFAULT 'NULL' COMMENT 'CREATE TIME',
                       `update_time` VARCHAR(32) DEFAULT 'NULL' COMMENT 'UPDATE TIME',
                       PRIMARY KEY(`id`)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='USER TABLE';
# Test Data
INSERT INTO rhino_blog.t_user (user_name,nick_name,password,status,sex) VALUES("Allen","GeekS","123456","0","0");

select * from rhino_blog.t_user;