package com.king.web.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.domain.Order;
import com.king.service.adminServicce;

public class orderlistServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			adminServicce service = new  adminServicce();
			List<Order> orderlist = service.findAllorder();
			//将获得的订单信息传递给admin/order/list
			request.setAttribute("orderlist", orderlist);
			request.getRequestDispatcher("/admin/order/list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}