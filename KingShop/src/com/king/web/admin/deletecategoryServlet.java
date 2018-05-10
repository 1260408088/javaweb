package com.king.web.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.service.adminServicce;

public class deletecategoryServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			String cid = request.getParameter("cid");
			
			adminServicce service = new adminServicce();
			service.deleteCategory(cid);
			request.getRequestDispatcher("/allcategoryname").forward(request, response);
			
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}