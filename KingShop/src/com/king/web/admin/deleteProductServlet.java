package com.king.web.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.service.adminServicce;

public class deleteProductServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
			String pid = request.getParameter("pid");
			adminServicce service = new adminServicce();
			boolean isdelete = service.deleteProduct(pid);
			if(isdelete){
				request.getRequestDispatcher("/allProductlist").forward(request, response);
			}else{
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write("删除失败");
			}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}