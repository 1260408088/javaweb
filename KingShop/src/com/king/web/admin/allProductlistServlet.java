package com.king.web.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.domain.Product;
import com.king.service.adminServicce;

public class allProductlistServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
			adminServicce servicce = new adminServicce();
			List<Product> allProduct = servicce.getAllProduct();
			request.setAttribute("allProduct", allProduct);
			request.getRequestDispatcher("admin/product/list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}