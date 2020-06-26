package com.br.service;

import java.util.List;

import javax.sql.DataSource;

import com.br.dao.Show;
import com.br.object.Users;

public interface UsersService {
    public String add(Users user);
    public void changepw(String username,String pw);
    public void changepw(int id,String pw);
    public void delete(Users user);
    public void delete(int id);
    public void update(int id, String newbook);
    public void forgetpw(String email,int num);
    public List<Show> shows();
    public String verify(Users user,int type);
}
