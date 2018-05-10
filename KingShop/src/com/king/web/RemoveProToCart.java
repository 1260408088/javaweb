package com.king.web;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.king.domain.CarItem;
import com.king.domain.Cart;

public class RemoveProToCart extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			String pid = request.getParameter("pid");
			HttpSession session = request.getSession();
			Cart cart = (Cart) session.getAttribute("cart");
			if(cart!=null){
				Map<String, CarItem> caritems = cart.getCaritems();
				CarItem carItem = caritems.get(pid);//通过pid获得session中的商品
				cart.setTotal(cart.getTotal()-carItem.getSubTotal());//商品总价减去获得商品的小计
				//删除
				caritems.remove(pid);
				cart.setCaritems(caritems);//其实是不用放回的
			}
			
			session.setAttribute("cart", cart);
			//跳转回jsp
			response.sendRedirect(request.getContextPath()+"/cart.jsp");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}