package com.king.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.domain.Product;
import com.king.service.productService;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class productinfoServlet extends HttpServlet {
	//显示商品的详细信息
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			String pid = request.getParameter("pid");
			String cid = request.getParameter("cid");
			String currentPage = request.getParameter("currentPage");
			//获得cid
			request.setAttribute("cid", cid);
			//获得当前页currentPage
			request.setAttribute("currentPage", currentPage);
			productService productService = new productService();
			Product product=null;
			try {
				product =productService.findProductbyPid(pid);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//获得客户端携带的cookie---获得名字是pids的cookie
			String pids=pid;
			Cookie[] cookies = request.getCookies();
			if(cookies!=null){
				for (Cookie cookie : cookies) {
					if("pids".equals(cookie.getName())){
						pids=cookie.getValue();
						//1-3-2 本次访问商品pid是8----->8-1-3-2  最新访问的要放到最前面
						//1-3-2 本次访问商品pid是3----->3-1-2  
						//1-3-2 本次访问商品pid是2----->2-1-3
						//将pids拆成一个数组
						String[] split = pids.split("-");//{3,1,2}
						List<String> asList = Arrays.asList(split);
						LinkedList<String> list = new LinkedList<String>(asList);
						//判断集合中是否存在当前的pid
						if(list.contains(pid)){
							//包含商品时,将包含的除去，然后再将其放入开始的位置
							list.remove(pid);  
							list.addFirst(pid);
						}else{
							//不包含当前查看的商品的pid 直接将该pid放到头上
							list.addFirst(pid);
						}
						//将[3,1,2]转成3-1-2的字符串
						StringBuffer sb = new StringBuffer();
						for(int i=0;i<list.size()&&i<7;i++){
							sb.append(list.get(i));
							sb.append("-");
						}
						//去掉3-1-2-后的-
						pids=sb.substring(0, sb.length()-1);
					}
				}
			}
			
			Cookie cookie_pids = new Cookie("pids", pids);
			response.addCookie(cookie_pids);
			
			request.setAttribute("product", product);
			request.getRequestDispatcher("/product_info.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}