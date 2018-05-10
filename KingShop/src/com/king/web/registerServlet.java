package com.king.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.king.domain.User;
import com.king.service.UserService;
import com.king.utils.ConmmentUtils;
import com.king.utils.MailUtils;
import com.sun.org.apache.commons.beanutils.ConvertUtils;
import com.sun.org.apache.commons.beanutils.Converter;

public class registerServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			Map<String,String[]> userMap = request.getParameterMap();
			User user = new User();
			System.out.println("1111111");
			try {
				//自己指定一个类型转换器（将String转成Date）
				ConvertUtils.register(new Converter(){
					public Object convert(Class clazz, Object value) {
						//将string转成date
						SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
						Date parse = null;
						try {
							parse = (Date) format.parse(value.toString());
						} catch (ParseException e) {
							e.printStackTrace();
						}
						return parse;
					}
				}, Date.class);
				//映射封装
				BeanUtils.populate(user, userMap);
			} catch (Exception e) {
				e.printStackTrace();
			} 
			System.out.println("2222222");
			//添加uid
			user.setUid(ConmmentUtils.getUUid());
			//添加telephone
			user.setTelephone(null);
			//添加激活码
			String activeCode=ConmmentUtils.getUUid();
			user.setCode(activeCode);
			//添加激活状态
			user.setState(0);
			
			UserService userservice = new UserService();
			System.out.println("3333333");
			boolean register=false;
			try {
				System.out.println("4444444");
				register= userservice.register(user);
				System.out.println("5555555");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			if(register){
				//注册成功跳转页面 ,发送激活邮件
				String Emailmsg="恭喜您注册成功，请点击下面的连接进行激活账户"
						+ "<a href='http://localhost:8080/KingShop/active?activeCode="+activeCode+"'>"
						+ "http://localhost:8080/KingShop/active?activeCode="+activeCode+"</a>";
				try {
					MailUtils.sendMail(user.getEmail(), Emailmsg);
				} catch (AddressException e) {
					e.printStackTrace();
				} catch (MessagingException e) {
					e.printStackTrace();
				}
				response.sendRedirect(request.getContextPath()+"/registerSuccess.jsp");
			}else{
				//注册失败显示本页 
				response.sendRedirect(request.getContextPath()+"/registerFail.jsp");
			}
			
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}