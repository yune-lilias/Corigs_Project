package com.br.dao;

import org.springframework.stereotype.Repository;

@Repository
public class GetMessageDaoImpl implements GetMessageDao{
	public String getMessage() {
		return "Hello World";
	}
}   