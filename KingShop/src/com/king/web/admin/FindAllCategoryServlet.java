package com.king.web.admin;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.king.domain.Category;
import com.king.service.productService;

public class FindAllCategoryServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			//获得商品分类的信息
			productService service = new productService();
			List<Category> findAllCotegory=null;
			try {
				findAllCotegory = service.findAllCotegory();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			Gson gosn = new Gson();
			String json=null;
			if(findAllCotegory!=null){
				json= gosn.toJson(findAllCotegory);
			}
			//测试输出json
			System.out.println(json);
			//将json数据返回给ajax,并将编码设置成UTF-8
			
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write(json);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}