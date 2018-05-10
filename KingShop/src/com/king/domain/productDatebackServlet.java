package com.king.domain;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.service.adminServicce;

/**
 * @author ningb_000
 *	获得商品的详细信息用于回显edit页面
 */
public class productDatebackServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			String pid = request.getParameter("pid");
			System.out.println(pid+"+++++++++++++++++++++++++++++++++++");
			adminServicce service = new adminServicce();
			//获得商品的全部信息
			Product product = service.findProductbypid(pid);
			//获得分类的信息
			List<Category> listcate = service.getAllCategoryName();
			//将product 和 listcate的信息放入request域转发到edit.jsp页面
			request.setAttribute("product", product);
			request.setAttribute("listcate", listcate);
			//传递pid用于根据id来更新商品数据
			request.setAttribute("productpid", pid);
			request.getRequestDispatcher("/admin/product/edit.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}