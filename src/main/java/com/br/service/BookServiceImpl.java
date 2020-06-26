package com.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.dao.Bookdao;
import com.br.dao.UsersDao;

@Service("BookService")
public class BookServiceImpl implements BookService{
	@Autowired
	private Bookdao BookDao; 
	@Autowired
	private UsersDao Userdao;
	
}
