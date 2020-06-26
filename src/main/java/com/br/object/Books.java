package com.br.object;

import java.io.File;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Books {
private long isbn;
private String bookpic;
private String bookname;
private double[] rate;   //rate on different platforms                          
           //1st element is Amazon, 2nd is goodReads, 3rd is others
private int[] numofgoodreviews;
private int[] numofmidreviews;
private int[] numofbadreviews;
private String[] comments;   //base on the number of reviews in three platforms
                             //pick up 20 comments
private int[] price;
private String author;
private String link;


@Id											
@GeneratedValue	
public long getIsbn() {
	return isbn;
}
public void setIsbn(long isbn) {
	this.isbn = isbn;
}

public String getBookpic() {
	return bookpic;
}
public void setBookpic(String bookpic) {
	this.bookpic = bookpic;
}

public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}

public double[] getRate() {
	return rate;
}
public void setRate(double[] rate) {
	this.rate = rate;
}

public int[] getNumofgoodreviews() {
	return numofgoodreviews;
}
public void setNumofgoodreviews(int[] numofgoodreviews) {
	this.numofgoodreviews = numofgoodreviews;
}
public int[] getNumofmidreviews() {
	return numofmidreviews;
}
public void setNumofmidreviews(int[] numofmidreviews) {
	this.numofmidreviews = numofmidreviews;
}
public int[] getNumofbadreviews() {
	return numofbadreviews;
}
public void setNumofbadreviews(int[] numofbadreviews) {
	this.numofbadreviews = numofbadreviews;
}

public String[] getComments() {
	return comments;
}
public void setComments(String[] comments) {
	this.comments = comments;
}

public int[] getPrice() {
	return price;
}
public void setPrice(int[] price) {
	this.price = price;
}

public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}

public String getLink() {
	return link;
}
public void setLink(String link) {
	this.link = link;
}

}
