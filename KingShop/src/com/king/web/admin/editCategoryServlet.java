package com.king.web.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.service.adminServicce;

public class editCategoryServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			String cname = request.getParameter("cname");
			String cid = request.getParameter("cid");
			
			adminServicce service = new adminServicce();
			service.updateCategory(cid,cname);
			System.out.println(cid);
			//转到商品分类展示页面
			request.getRequestDispatcher("/allcategoryname").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}