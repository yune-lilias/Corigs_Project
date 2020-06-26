package com.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.dao.GetMessageDao;
import com.br.service.GetMessageService;

@Service("GetMessageService")
public class GetMessageServiceImpl implements GetMessageService{
	@Autowired
	private GetMessageDao getMessageDao; 
	public String getMessage() {
		return getMessageDao.getMessage();
	}	
}