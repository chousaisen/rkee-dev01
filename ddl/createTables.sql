DROP TABLE IF EXISTS `website`;

CREATE TABLE website (
  id int NOT NULL,
  name varchar(20)   ,
  url varchar(30)   DEFAULT '',
  age int  NOT NULL,
  country char(3)   DEFAULT '',
  PRIMARY KEY (id)
) 