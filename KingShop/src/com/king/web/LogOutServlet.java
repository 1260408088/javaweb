package com.king.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogOutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			//1.先要将user从session域中移除
			request.getSession().removeAttribute("user");
			
			//2.还要将cookie中存储的username password 移除   
			Cookie cookie_username = new Cookie("cookie_username", "");//保存成一个空串
			cookie_username.setMaxAge(0);//即时失效
			Cookie cookie_passsword = new Cookie("cookie_passsword", "");
			cookie_passsword.setMaxAge(0);
			//将存储用户名和密码的cookie保存再本地
			response.addCookie(cookie_username);
			response.addCookie(cookie_passsword);
			//最后重定向到登陆的页面
			
			response.sendRedirect(request.getContextPath()+"/login.jsp");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}