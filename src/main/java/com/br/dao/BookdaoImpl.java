package com.br.dao;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.br.object.Books;
import com.br.object.Users;

@Repository("bookDao")
public class BookdaoImpl implements Bookdao{
	@Autowired
	JdbcTemplate jdbcTemplateObject;

	@Override
	public String[] searchbyisbn(Users user,Books book) {
		String sql = "SELECT title,author FROM book WHERE isbn = ?";
		String[] temp = jdbcTemplateObject.queryForObject(sql,new Object[] {book.getIsbn()}, String[].class);
		 if(user.getId()>=1)
			 addhistory(user,book);
		return temp;
	}

	@Override
	public String[] searchbyisbn2(Users user, Books book) throws MalformedURLException, ProtocolException, IOException {
        if(user.getId()>=1)
        	addhistory(user,book);
		JavaGetRequest.findisbn(book);
		return new String[]{book.getBookname(),book.getBookpic(),book.getAuthor()};
	}

	@Override
	public String[] getfavorite(Books book, Users user) {
		// TODO Auto-generated method stub
		//String sql = "SELECT isbn FROM favorite WHERE userID = ?";
	//	return  jdbcTemplateObject.queryForObject(sql,new Object[] {user.getId()}, String[].class);
	return null;
	}

	@Override
	public ArrayList<String[]> gethistory(Books book, Users user) throws MalformedURLException, ProtocolException, IOException {
		String sql = "SELECT isbn FROM history WHERE userID = ?";
		ArrayList<String[]> rest = new ArrayList<String[]>();
		Books temp = new Books();
		Users tempu = new Users();
		Long[] isbns = jdbcTemplateObject.queryForObject(sql,new Object[] {user.getId()}, Long[].class);
		for(int i=0;i<isbns.length;i++) {
			temp.setIsbn(isbns[i]);
			tempu.setId(-1);
			rest.add(searchbyisbn2(tempu,temp));
			}
		return rest;
	}

	@Override
	public String[] searchbybarcode(Books book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] addhistory(Users user, Books book) {
		String SQL = "INSERT IGNORE INTO history (userID,time,isbn) VALUES(?,?,?);";
		String date1 = java.time.LocalDate.now().toString().replaceAll("-", "");
		String time1 = java.time.LocalTime.now().toString();
		time1 = date1+time1.substring(0,time1.indexOf(".")).replaceAll(":", "");  
		jdbcTemplateObject.update( SQL, new Object[]{user.getId(),time1,book.getIsbn()} );	
		return null;
	}

}
