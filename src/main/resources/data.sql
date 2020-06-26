USE `book_review`;
INSERT IGNORE INTO user  VALUES('1@gmail.com','testuser1','1','testuser1','user1');
INSERT IGNORE INTO user  VALUES('2@gmail.com','testuser2','2','testuser2','user2');
INSERT IGNORE INTO user  VALUES('3@gmail.com','testuser3','3','testuser3','user3');
INSERT IGNORE INTO user  VALUES('4@gmail.com','testuser4','4','testuser4','user4');
INSERT IGNORE INTO user  VALUES('5@gmail.com','testuser5','5','testuser5','user5');

INSERT IGNORE INTO book VALUES('978-1523504459','1,000 Books to Read Before You Die: A Life-Changing List','James Mustich');
INSERT IGNORE INTO book VALUES('978-0439136358','Harry Potter and the Prisoner of Azkaban','J.K. Rowling');
INSERT IGNORE INTO book VALUES('978-0060883287','One Hundred Years of Solitude (P.S.)','Gabriel Garcia Marquez');
INSERT IGNORE INTO book VALUES('978-9353242060','Gone with the Wind','Margaret Mitchell');
INSERT IGNORE INTO book VALUES('978-0224017893','Missing Person','Patrick Modiano');

INSERT IGNORE INTO favorite VALUES('1','978-0439136358','978-9353242060',NULL,NULL,NULL);
INSERT IGNORE INTO favorite VALUES('2','978-1523504459','978-9353242060','978-0439136358',NULL,NULL);
INSERT IGNORE INTO favorite VALUES('3','978-0060883287',NULL,NULL,NULL,NULL);
INSERT IGNORE INTO favorite VALUES('4',NULL,NULL,NULL,NULL,NULL);
INSERT IGNORE INTO favorite VALUES('5','978-0439136358','978-9353242060',NULL,NULL,NULL);

INSERT IGNORE INTO history VALUES('1','20200101231102','978-0439136358');
INSERT IGNORE INTO history VALUES('1','20190106231102','978-9353242060');
INSERT IGNORE INTO history VALUES('2','20200101231102','978-0224017893');
INSERT IGNORE INTO history VALUES('4','20200101234402','978-0439136358');

INSERT IGNORE INTO comment VALUES('978-0439136358','Amazon',
'I''m 46 and male who works out and thinks he''s macho and I''ve read this book 4 times. If you have a stressful job like 
me where you can''t relax, read the HP books. They put you in a fantasy world and JK Rowling''s storytelling is so 
unbelievable and descriptive, she''s the best. I got this series for my father after my mother passed away. They were 
married 69 years and he was grieving. This is not his kind of book but after reminding him how much my mother loved them, 
he agreed to read them and agrees it puts him in another world and helps him gain peace.'
,'5.0',
'I purchased this copy for my little brother. I love the Harry Potter books, and I wanted to pass the magic on to him. I am
 quite the Potterhead and buy this for any 10-100 year old that has a birthday. I have already started reading the first 
 one to my daughter, who happens to be named after Molly Weasley. Personally, Harry Potter and the Goblet of Fire (#4) is 
 my favorite, but definitely start with #1 if you are just beginning. Obviously I recommend this to everyone'
,'5.0',
'As always with Rowling''s books, I loved Harry Potter and the Prisoner of Azkaban! JK Rowling''s words have a curious 
habit of coming to life, and her characters are funny, and realistic. One of the greatest things about Harry Potter, is 
that they improve with each book, and you can clearly glimpse the clever, intricate plot Rowling has wove, with cleverly 
placed foreshadowing and seemingly innocent hints.'
,'5.0','4.8',
'https://www.amazon.com/Harry-Potter-Prisoner-Azkaban-Rowling/dp/0439136350/ref=tmm_hrd_swatch_0?_encoding=UTF8&qid=&sr=');

INSERT IGNORE INTO comment VALUES('978-0224017893','Amazon',
'Missing Person is a fine work in Modiano''s hypnotic oeuvre. It is good to read it with Suspended Sentences and with 
Family Record. It is a sort of detective story where the person sought is the first-person narrator/detective. Time is so 
fluid in his works that it is hard to sort out events, but doing so is part of the pleasure of reading his elusive and 
illusive novels. There did seem a curious anachronism: a song (whose lyrics seem quite pertinent to the narrative, even 
if they are never stated) that was whistled by one of the Latin American characters in World War II -- "Tu me 
acostumbraste". It is, however, a Cuban song of 1957 composed by Frank Domínguez. Perhaps this is an error on Modiano''s 
part or perhaps it''s part of his slippery narrative to created doubt about the narrator''s account.'
,'5.0',
'Patrick Modiano is not an easy read but only because the novel is about a 
man who is trying to figure out who he was by looking for clues in photos and
 from friends. The style is spare and I had trouble keeping track of who was 
 who. But then again so is the narrator. If you are interested in something 
 thoughtful and truly literary (whatever that means) try Missing Person.'
 ,'4.0',
 'That Patrick Modiano is an important writer I have no doubt. He was the 
 first important French novelist to investigate the memory of Vichy and the 
 recovery of life in a post War France. Here he uses a stock device of a 
 person with amnesia intent on discovering who they were in fact. This 
 short novel holds out some tempting tidbits (the presence of the Dominican 
 playboy Porfirio Rubirosa, for one) but very little was made of them. The 
 narrative is loaded with geographical references which suggested something
 of significance I suspect, but nothing in the text supported them very well. 
 I do not think the problems are on the translator''s shoulders, but some 
 notation might have helped. Oh, well. You win some, you lose some. Tant pis.'
 ,'3.0','3.7',
 'https://www.amazon.com/Missing-Person-Patrick-Modiano/dp/0224017896/ref=tmm_hrd_swatch_0?_encoding=UTF8&qid=1593171531&sr=8-3');


