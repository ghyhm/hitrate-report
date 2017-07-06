--CREATE SEQUENCE hitrate_id_seq;
--CREATE TABLE hitrate (
--  id int NOT NULL DEFAULT nextval('hitrate_id_seq'),
--  visit_date date NOT NULL,
--  website varchar(1000) NOT NULL,
--  visits int NOT NULL
--);
--ALTER SEQUENCE hitrate_id_seq OWNED BY hitrate.id;
CREATE TABLE hitrate (
     id int(5) NOT NULL AUTO_INCREMENT,
	 visit_date date NOT NULL,
	 website varchar(1000) NOT NULL,
     visits int(5) NOT NULL,
     PRIMARY KEY (id)
);