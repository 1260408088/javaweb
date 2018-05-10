package com.king.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.king.domain.User;
import com.king.service.UserService;

public class UserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			//获得有汉字需要，改变编码
			request.setCharacterEncoding("UTF-8");
			//获得session
			HttpSession session = request.getSession();
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String flags = request.getParameter("flags");
			//获得自动登陆的值
			String autologin = request.getParameter("autologin");
			System.out.println(autologin+"--------------");
			//System.out.println(flags+"-------------");
			//获得提交的验证码
			String checkcode = request.getParameter("checkcode");
			//获得生成图片的文字的验证码
			String checkCode_session = (String) request.getSession().getAttribute("checkcode_session");
			System.out.print("自己提交的"+checkcode+"--------网页传递过来的"+checkCode_session);
			
			//验证验证码是否相同(乱码问题，待解决)
			if(!checkCode_session.equals(checkcode)){
				request.setAttribute("loginInfo", "您的验证码不正确");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				return;
			}
			UserService service = new UserService();
			User user=null;
			try {
				user=service.login(username,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(user!=null){
				//***************判断用户是否勾选了自动登录，勾选后设置自动登陆*****************
				if("autologin".equals(autologin)){
					Cookie cookie_username = new Cookie("cookie_username", username);
					cookie_username.setMaxAge(10*60);//one hour
					Cookie cookie_passsword = new Cookie("cookie_passsword", password);
					cookie_passsword.setMaxAge(60*10);
					//将存储用户名和密码的cookie保存再本地
					response.addCookie(cookie_username);
					response.addCookie(cookie_passsword);
				}
				
				
				//将user对象存到session中
				session.setAttribute("user", user);
				//从那个页面跳转到登陆页面的然后再跳转回去
				if("1".equals(flags)){
					response.sendRedirect(request.getContextPath()+"/cart.jsp");
					return;
					//System.out.println("...********...");
					//request.getRequestDispatcher(request.getContextPath()+"/cart.jsp").forward(request, response);
				}if("2".equals(flags)){
					response.sendRedirect(request.getContextPath()+"/orderinfo");
				}else{
					response.sendRedirect(request.getContextPath()+"/index.jsp");
				}
			}else{
				request.setAttribute("loginInfo", "用户名或密码错误");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}