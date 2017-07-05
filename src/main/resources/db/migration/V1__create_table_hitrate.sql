CREATE SEQUENCE hitrate_id_seq;
CREATE TABLE hitrate (
  hitrate_id int NOT NULL DEFAULT nextval('hitrate_id_seq'),
  visit_date date NOT NULL,
  website varchar(1000) NOT NULL,
  visits int NOT NULL
);
ALTER SEQUENCE hitrate_id_seq OWNED BY hitrate.hitrate_id;