CREATE TABLE hitrate_tmp (
     id int(5) NOT NULL AUTO_INCREMENT,
	 visit_date date NOT NULL,
	 website varchar(1000) NOT NULL,
     visits int(5) NOT NULL,
     PRIMARY KEY (id)
);