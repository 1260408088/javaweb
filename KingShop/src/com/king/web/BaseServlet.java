package com.king.web;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("all")
public class BaseServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		try {
			//1.获取method的名称
			String methodName = req.getParameter("method");
			//2.获得当前被访问的对象的字节码对象
			Class clazz = this.getClass();//ProductServlet.class   userServlet.class
			//3.获取当前字节码对象中的指定方法
			Method method = clazz.getMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			//4.执行响应的功能
			method.invoke(this, req,resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}