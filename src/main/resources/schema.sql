CREATE DATABASE IF NOT EXISTS book_review;
USE `book_review`;

CREATE TABLE IF NOT EXISTS user
(
  email VARCHAR(50) NOT NULL,
  username VARCHAR(20) NOT NULL,
  userID INT NOT NULL AUTO_INCREMENT,
  password VARCHAR(20) NOT NULL,
  nickname VARCHAR(20),
  PRIMARY KEY (userID)
);

CREATE TABLE IF NOT EXISTS book
(
   isbn VARCHAR(14) NOT NULL,
   title VARCHAR(50) NOT NULL,
   author VARCHAR(40) NOT NULL,
   PRIMARY KEY (isbn)
);

CREATE TABLE IF NOT EXISTS favorite
(
   userID INT NOT NULL,
   isbn1 VARCHAR(14),
   isbn2 VARCHAR(14),
   isbn3 VARCHAR(14),
   isbn4 VARCHAR(14),
   isbn5 VARCHAR(14),
   FOREIGN KEY(userID) REFERENCES user(userID)
);

CREATE TABLE IF NOT EXISTS history
(
   userID INT NOT NULL,
   time BIGINT,
   isbn VARCHAR(14),
   FOREIGN KEY(userID) REFERENCES user(userID),
   FOREIGN KEY(isbn) REFERENCES book(isbn)
);

CREATE TABLE IF NOT EXISTS comment
(
   isbn VARCHAR(14) NOT NULL,
   platformname VARCHAR(20) NOT NULL,
   comment1 VARCHAR(1000),
   rate1 FLOAT,
   comment2 VARCHAR(1000),
   rate2 FLOAT,
   comment3 VARCHAR(1000),   
   rate3 FLOAT,
   rating FLOAT,
   url VARCHAR(200),
   FOREIGN KEY(isbn) REFERENCES book(isbn)  
);



