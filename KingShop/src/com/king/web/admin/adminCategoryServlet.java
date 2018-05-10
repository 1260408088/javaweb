package com.king.web.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.king.domain.Category;
import com.king.domain.Product;
import com.king.service.adminServicce;
import com.king.utils.ConmmentUtils;

//添加商品分类
public class adminCategoryServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			String cname = request.getParameter("cname");
			String cid=ConmmentUtils.getUUid();
			Category category = new Category();
			//封装category
			category.setCname(cname);
			category.setCid(cid);
			adminServicce service = new adminServicce();
			service.addcategory(category);
			request.getRequestDispatcher("/allcategoryname").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}