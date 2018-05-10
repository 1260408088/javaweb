package com.king.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.domain.Product;
import com.king.service.productService;

public class productServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			productService productService = new productService();
			List<Product> Hotproduct=null;
			List<Product> Newproduct=null;
			try {
				Hotproduct=productService.findHotproduct();
				Newproduct=productService.findNewproduct();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//非空判断，转发到jsp的页面填充数据
			if(Hotproduct!=null&&Newproduct!=null){
				request.setAttribute("Hotproduct", Hotproduct);
				request.setAttribute("Newproduct", Newproduct);
				System.out.println("可以进行jsp的操作了");
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}
			
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}