DROP TABLE IF EXISTS invoice;
 
CREATE TABLE invoice (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  asd VARCHAR(250) NOT NULL,
  username VARCHAR(250) NOT NULL,
  token VARCHAR(250) NOT NULL,
  extTid VARCHAR(250) NOT NULL,
  pin VARCHAR(250) NOT NULL,
  dealerUser VARCHAR(250) NOT NULL,
  dealerLocation VARCHAR(250) NOT NULL
);
 
  INSERT INTO invoice (asd,username,token,extTid,pin,dealerUser,dealerLocation) VALUES
 ('a','b','c','d','f','g','test');