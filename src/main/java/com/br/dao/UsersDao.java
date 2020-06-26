package com.br.dao;

import java.util.List;

import javax.sql.DataSource;

import com.br.object.Users;

public interface UsersDao {
     public String add(Users user);
     public void changepw(String username,String pw);
     public void changepw(int id,String pw);
     public void delete(Users user);
     public void delete(int id);
     public void update(int id, String newbook);
     public void forgetpw(String email,int num);
     public Users verify(Users user);
     public Users verifybyemail(Users user);
     public List<Show> shows(); //for testing the connection to database
}
