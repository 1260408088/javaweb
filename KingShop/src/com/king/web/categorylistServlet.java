package com.king.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import redis.clients.jedis.Jedis;

import com.google.gson.Gson;
import com.king.domain.Category;
import com.king.service.productService;
import com.king.utils.JedisPoolUtils;

public class categorylistServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			productService service = new productService();
			//先从缓存中查询categorylist如果有直接使用，没有再从数据库中查询 存到缓存中
			//1.获得jredis对象，连接redis数据库
			Jedis jedis = JedisPoolUtils.getJedis();
			String categoryListJson=jedis.get("categoryListJson");
			//判断categoryListJson是否为空
			//String categoryListJson=null;
			if(categoryListJson==null){
				List<Category> category=null;
				try {
					category=service.findAllCotegory();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				if(category!=null){
					System.out.println("可以进行jsp的此操作了");
					Gson gson = new Gson();
					categoryListJson= gson.toJson(category);
					jedis.set("categoryListJson", categoryListJson);
				}
			}else{
				System.out.println("从缓存之中读取数据");
				List<Category> category=null;
				try {
					category=service.findAllCotegory();
				} catch (SQLException e) {
					 e.printStackTrace();
				}
				
				
				System.out.println("可以进行jsp的此操作了");
				Gson gson = new Gson();
				categoryListJson= gson.toJson(category);
			}
			
			
		/*	List<Category> category=null;
			String categoryListJson=null;
			try {
				category = service.findAllCotegory();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(category!=null){
				Gson gson = new Gson();
				categoryListJson = gson.toJson(category);
			}
			*/
			response.setContentType("text/html;charset=UTF-8");
			//System.out.println(categoryListJson);
			response.getWriter().write(categoryListJson);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
}