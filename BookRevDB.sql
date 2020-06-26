create table if not exists USER(
userID int not null auto_increment,
email varchar(100),
phone bigint(10),
primary key (userID)
);

create table if not exists BOOK(
isbn bigint(13) not null,
title varchar(100),
author varchar(50),
primary key(isbn)
);

create table if not exists WEBSITE(
websiteID int not null auto_increment,
webName varchar(50),
URL varchar(255),
isbn bigint(13),
primary key(websiteID),
foreign key (isbn) references BOOK(isbn)
);

create table if not exists REVIEW(
reviewID int not null auto_increment,
rating float(3),
summary varchar(5000),
websiteID int(10),
isbn bigint(13),
primary key(reviewID),
foreign key (websiteID) references WEBSITE(websiteID),
foreign key (isbn) references BOOK(isbn)
);

create table if not exists SEARCHISTORY(
historyID int not null auto_increment,
userID int,
isbn bigint(13),
primary key(historyID),
foreign key (userID) references USER(userID),
foreign key (isbn) references BOOK(isbn)
);

insert into USER values('test@gmail.com', '1234567890');
insert into USER values('test1@gmail.com', '9365937493');
insert into USER values('test2@aol.com','6837847583');
insert into BOOK values('9780439023481','The Hunger Games','Suzanne Collins');
insert into BOOK values('9781492180746','The Mom Test','Rob Fitzpatrick');
insert into BOOK values('9781593278175', 'The Manga Guide To Microprocessors', 'Michio Shibuya');
insert into REVIEW (rating, summary, isbn) values ('1.3', 'this book is sucks', '9780439023481');
insert into REVIEW (rating, summary, isbn) values ('4.5', 'this book is great', '9780439023481');
insert into REVIEW (rating, summary, isbn) values ('3.3', 'this book is very helpful', '9781492180746');
insert into REVIEW (rating, summary, isbn) values ('5.0', 'this book is humorous', '9781492180746');
insert into REVIEW (rating, summary, isbn) values ('1.1', 'this book is dumb', '9781593278175');
insert into REVIEW (rating, summary, isbn) values ('2.2', 'why did i read this', '9781593278175');
insert into WEBSITE (webName, URL, isbn) values ('amazon','https://www.amazon.com/Hunger-Games-Book/dp/0439023483','9780439023481');
insert into WEBSITE (webName, URL, isbn) values ('amazon','https://www.amazon.com/Mom-Test-customers-business-everyone/dp/1492180742','9781492180746');
insert into WEBSITE (webName, URL, isbn) values ('amazon','https://www.amazon.com/Manga-Guide-Microprocessors-Michio-Shibuya/dp/1593278179','9781593278175');