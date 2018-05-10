package com.king.update.page;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import com.king.service.productService;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.domain.PageBean;
import com.king.domain.Product;

public class SerachPageServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//获得要查询的商品参数
			String goodsname = request.getParameter("goodsname");
			String currentpageStr = request.getParameter("currentPage");
			if(currentpageStr==null) currentpageStr="1";
			int currentPage=Integer.parseInt(currentpageStr);
			int currentcount=2;
			//再写一个service用来分页查询根据关键词的查询
			productService productService = new productService();
			PageBean pagebean = productService.findProductListByName(goodsname,currentPage, currentcount);
			request.setAttribute("goodsname", goodsname);
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
			request.getRequestDispatcher("/serach_list.jsp").forward(request, response);
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request,response);
	}

}
