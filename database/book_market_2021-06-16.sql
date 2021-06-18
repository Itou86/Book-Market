CREATE DATABASE `book_market`;

USE `book_market`;

DROP TABLE IF EXISTS `books`;

CREATE TABLE `books` (
  `book_id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '书本ID',
  `book_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '书本名称',
  `book_counts` int NOT NULL DEFAULT '0' COMMENT '书本数量',
  `book_detail` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '书本描述',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

INSERT INTO `books` (`book_id`, `book_name`, `book_counts`, `detail`)
VALUES
	(1,'《JAVA核心》',10,'Java开发高级'),
	(2,'《Mysql入门》',5,'Mysql基础'),
	(3,'《SSM框架详解》',2,'JavaEE入门'),
	(4,'《系统架构》',1,'高级开发');
