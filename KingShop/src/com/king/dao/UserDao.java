package com.king.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.king.domain.User;
import com.king.utils.DataSourceUtils;

public class UserDao {
	private static QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
	//注册插入
	public int register(User user) throws SQLException {
		String sql="insert into user values(?,?,?,?,?,?,?,?,?,?)";
		System.out.print("UserDao");
		int update = runner.update(sql, user.getUid(),user.getUsername(),user.getPassword(),
				user.getName(),user.getEmail(),user.getTelephone(),user.getBirthday(),
				user.getSex(),user.getState(),user.getCode());
		return update;
	}
	//改变状态的方法
	public int changeState(String activeCode) throws SQLException {
		String sql="update user set state=? where code=?";
		int update = runner.update(sql, "1",activeCode);
		return update;
	}
	//查看用户名是否存在
	public long useIsExit(String username) throws SQLException {
		String sql="select count(*) from user where username=?";
		System.out.println("32333333333333333------------------");
		return (Long) runner.query(sql, new ScalarHandler(),username);
	}
	//登陆
	public User login(String username, String password) throws SQLException {
		String sql="select * from user where username=? and password=?";
		User query = runner.query(sql, new BeanHandler<User>(User.class), username,password);
		return query;
	}
	
}
