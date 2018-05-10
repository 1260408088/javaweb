package com.king.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//没用，不用看
import com.king.domain.Category;
import com.king.service.productService;

public class testServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			productService service = new productService();
			List<Category> findAllCotegory=null;
			try {
				findAllCotegory = service.findAllCotegory();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(findAllCotegory!=null){
				String test=null;
				for (Category category : findAllCotegory) {
					test+=category.toString();
				}
				response.setContentType("text/html;charset=UTF-8");
				response.getWriter().write(test);
			}
			
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}