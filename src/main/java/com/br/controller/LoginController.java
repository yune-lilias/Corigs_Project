package com.br.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.service.GetMessageService;
import com.br.service.UsersService;
import com.br.service.BookService;

@Controller
public class LoginController {
	@Resource(name = "UsersService")
	UsersService UsersService;  // I change this without impl
	@Resource(name = "GetMessageService")
	GetMessageService getMessageService;
	@Resource(name = "BookService")
	BookService BookService;
	
	
	@RequestMapping("/search")
	public String searchbooks(ModelMap model) {
		if(!ShowController.islogin)
				return "redirect:/home";
		model.put("message","searching part: building");
		return "index";
	}
	
	@RequestMapping("/history")
	public String viewhistory(ModelMap model) {
		if(!ShowController.islogin)
			return "redirect:/home";
		model.put("message","history part: building");
		return "index";
	}
	
	@RequestMapping("/favorite")
	public String viewfavorite(ModelMap model) {
		if(!ShowController.islogin)
			return "redirect:/home";
		model.put("message","favorite part: building");
		return "index";
	}
	
	
}
