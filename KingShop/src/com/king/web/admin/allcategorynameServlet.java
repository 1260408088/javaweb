package com.king.web.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.domain.Category;
import com.king.service.adminServicce;

public class allcategorynameServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			adminServicce service = new adminServicce();
			List<Category> namelist = service.getAllCategoryName();
			for (Category string : namelist) {
				System.out.println(string);
			}
			
			System.out.println("----1111----");
			request.setAttribute("namelist", namelist);
			request.getRequestDispatcher("/admin/category/list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}