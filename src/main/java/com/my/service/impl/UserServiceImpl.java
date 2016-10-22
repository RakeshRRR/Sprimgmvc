package com.my.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.my.dao.UserDao;
import com.my.domain.User;
import com.my.service.UserService;
@Service
@Transactional
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserDao dao;

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return dao.getUsers();
	}
	
	
	
	
	
}
