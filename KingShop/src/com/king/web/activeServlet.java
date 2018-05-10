package com.king.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.service.UserService;

public class activeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			//获得参数
			String activeCode = request.getParameter("activeCode");
			UserService userService = new UserService();
			boolean isActivity=false;
			try {
				//调用服务中的改变激活状态的方法
				isActivity= userService.changeState(activeCode);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(isActivity){
				response.sendRedirect(request.getContextPath()+"/login.jsp");
			}else{
				response.getWriter().write("激活失败");
			}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}