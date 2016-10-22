package com.my.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.domain.User;
import com.my.service.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userSerivce; 

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Hello init");
		return "home";
	}
	@RequestMapping("/users")
	public @ResponseBody List<User> getUsers()
	{
		
		return userSerivce.getUsers();
		
	}
}
