package com.king.web.admin;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.king.service.adminServicce;

public class findOrderInfoByOidServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			//获得ajax传递过来的oid
			String oid = request.getParameter("oid");
			adminServicce servicce = new adminServicce();
			List<Map<String, Object>> maplist = servicce.findOrderByoid(oid);
			//将传递过来的maplist转换成json
			Gson gson = new Gson();
			String json = gson.toJson(maplist);
			//输出查看格式
			//System.out.println(json);
			//编码，防止汉字乱码，并将json数据传递给ajax
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write(json);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}