package com.kente.spittr.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kente.spittr.daoImpl.UserDaoImpl;
import com.kente.spittr.model.User;

public class UserController
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/spring/application.xml");
		
		UserDaoImpl userDao = (UserDaoImpl) ctx.getBean("userDao");
		
		List<User> users = userDao.getAllUsers();
		
		System.out.println(users.get(0).getAge());
		
		
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
