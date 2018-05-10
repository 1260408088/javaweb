package com.king.service;

import java.sql.SQLException;

import com.king.dao.UserDao;
import com.king.domain.User;

public class UserService {
	private static UserDao userDao = new UserDao();
	public boolean register(User user) throws SQLException {
		System.out.println("UserService");
		int register = userDao.register(user);
		return register>0?true:false;
	}
	//调用数据库的改变激活状态的方法
	public boolean changeState(String activeCode) throws SQLException {
		int changeState = userDao.changeState(activeCode);
		return changeState>0?true:false;
	}
	//判断用户是否存在
	public boolean useIsExit(String username) throws SQLException {
		long useIsExit = userDao.useIsExit(username);
		System.out.println("1111111111111111111111------------------");
		return useIsExit>0?true:false;
	}
	
	//用户登录
	public User login(String username, String password) throws SQLException {
		User login = userDao.login(username,password);
		return login;
	}
	
}
