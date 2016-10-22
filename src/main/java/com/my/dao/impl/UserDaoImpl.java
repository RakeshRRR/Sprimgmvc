package com.my.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.dao.UserDao;
import com.my.domain.User;
@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory factory;

	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return factory.getCurrentSession().createQuery("from User").list();
	}
	
	
}
