package com.king.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.service.UserService;

public class checkUsername extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			String username = request.getParameter("username");
			UserService service = new UserService();
			System.out.println("_____________________------------------");
			boolean isExist=false;
			try {
				isExist= service.useIsExit(username);
				System.out.println("222222222222222222------------------");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			String json="{\"isExist\":"+isExist+"}";
			response.getWriter().write(json);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}