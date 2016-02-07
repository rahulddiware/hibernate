create table stock(
   stock_id BIGINT(10) NOT NULL AUTO_INCREMENT,
   stock_code VARCHAR(50),
   stock_name VARCHAR(50),
   PRIMARY KEY (`stock_id`)
)


create table stockdetails(
   stock_id BIGINT(10) NOT NULL AUTO_INCREMENT,
   comp_name VARCHAR(50),
   comp_desc VARCHAR(50),
   remark VARCHAR(50),
   listed_date DATE,
   PRIMARY KEY (`stock_id`)
)