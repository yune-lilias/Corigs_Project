package com.br.dao;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.ArrayList;

import com.br.object.Books;
import com.br.object.Users;

public interface Bookdao {
public String[] searchbyisbn(Users user,Books book);
public String[] searchbybarcode(Books book);
public String[] getfavorite(Books book,Users user);
public ArrayList<String[]> gethistory(Books book,Users user) throws MalformedURLException, ProtocolException, IOException;
String[] searchbyisbn2(Users user,Books book) throws MalformedURLException, ProtocolException, IOException;
public String[] addhistory(Users user,Books book);
}
