use test;

SET SQL_SAFE_UPDATES = 0;


create table stock(
   stock_id BIGINT(10) NOT NULL AUTO_INCREMENT,
   stock_code VARCHAR(50),
   stock_name VARCHAR(50),
   PRIMARY KEY (`stock_id`)
);


create table stock_daily_recorded(
   stock_id BIGINT(10) NOT NULL AUTO_INCREMENT,
   recorded_id BIGINT(10), 
   price_open VARCHAR(50),
   price_close VARCHAR(50),
   price_change VARCHAR(50),
   volume VARCHAR(50),
   date DATE,
   PRIMARY KEY (`stock_id`)
)
