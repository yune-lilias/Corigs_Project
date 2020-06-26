package com.br.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.dao.GetMessageDao;
import com.br.dao.Show;
import com.br.dao.UsersDao;
import com.br.object.Users;

@Service("UsersService")
public class UsersServiceImpl implements UsersService{
	@Autowired
	private UsersDao UsersDao; 


	public String add(Users user) {
		// TODO Auto-generated method stub
		return UsersDao.add(user);
	}

	public void changepw(String username, String pw) {
		// TODO Auto-generated method stub
		UsersDao.changepw(username, pw);
	}

	public void changepw(int id, String pw) {
		// TODO Auto-generated method stub
		UsersDao.changepw(id,pw);
	}

	public void delete(Users user) {
		// TODO Auto-generated method stub
		UsersDao.delete(user);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		UsersDao.delete(id);
	}

	public void update(int id, String newbook) {
		// TODO Auto-generated method stub
		UsersDao.update(id, newbook);
	}

	public void forgetpw(String email, int num) {
		// TODO Auto-generated method stub
		UsersDao.forgetpw(email, num);
	}

	public List<Show> shows() {
		// TODO Auto-generated method stub
		return UsersDao.shows();
	}

	@Override
	public String verify(Users user, int type) {
		Users user2 = new Users();
		if(type == 1)
		user2 = UsersDao.verify(user);
		else 
		user2 = UsersDao.verifybyemail(user);
		if(user2.getId()==0)
			return "Not";
		else {
			if(user2.getPassword().equals(user.getPassword()))
				return user2.getUsername();
			else
				return "Fail";
		}
		// TODO Auto-generated method stub
		
	}

}
