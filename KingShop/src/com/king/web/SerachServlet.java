package com.king.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.domain.Product;
import com.king.service.productService;

public class SerachServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			String goodsname = request.getParameter("goodsname");
			//商品服务
			productService service = new productService();
			List<Product> list=null;
			try {
				list= service.FindProductByName(goodsname);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(list!=null){
				request.setAttribute("serachlist", list);
				request.setAttribute("goodsname", goodsname);
			}
			request.getRequestDispatcher("/serach_list.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);
	}

}
