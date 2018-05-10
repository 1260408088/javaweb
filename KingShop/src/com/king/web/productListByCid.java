package com.king.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.domain.PageBean;
import com.king.domain.Product;
import com.king.service.productService;

public class productListByCid extends HttpServlet {
	//通过分类来查找商品，用于主页分类显示商品
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			String cid = request.getParameter("cid");  //获得cid
			String currentpagerStr = request.getParameter("currentPage"); //获得currentPage
			if(currentpagerStr==null) currentpagerStr="1";  //获得后如果为空，设置为1，当作为是从主页点击的
			int currentpage=Integer.parseInt(currentpagerStr);
			int currentCount=12;
			productService productService = new productService();
			PageBean pagebean = productService.findProductListByCid(cid,currentpage, currentCount);
			request.setAttribute("cid", cid);
			request.setAttribute("pagebean", pagebean);
			
			//定义一个记录历史商品信息的集合
			ArrayList<Product> historyProductList = new ArrayList<Product>();
			//获取客户端携带名字叫pids的cookie
			Cookie[] cookies = request.getCookies();
			if(cookies!=null){
				for(Cookie cookie:cookies){
					if("pids".equals(cookie.getName())){
						String pids =cookie.getValue();//3-2-1
						String [] split=pids.split("-");
						for(String pid:split){
							try {
								Product pro = productService.findProductbyPid(pid);
								historyProductList.add(pro);
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
			//将历史记录的集合放到域中
			request.setAttribute("historyProductList", historyProductList);
			request.getRequestDispatcher("/product_list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}