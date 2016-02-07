use test;

SET SQL_SAFE_UPDATES = 0;

create table stock(
   stock_id BIGINT(10) NOT NULL AUTO_INCREMENT,
   stock_code VARCHAR(50),
   stock_name VARCHAR(50),
   PRIMARY KEY (`stock_id`)
);


create table category(
   stock_id BIGINT(10) NOT NULL AUTO_INCREMENT,
   category_id VARCHAR(50),
   name VARCHAR(50),
   description VARCHAR(50),
   PRIMARY KEY (`stock_id`)
);

create table stock_category(
	stock_id BIGINT(10),
	category_id VARCHAR(50)
);