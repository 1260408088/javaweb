package com.king.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.king.domain.Order;
import com.king.domain.Orderitem;
import com.king.domain.Product;
import com.king.domain.User;
import com.king.service.productService;
//得到当前用户的所有的订单     (分页查询，待做，还没思路)
public class OrderinfoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			//判断用户是否登陆，未登陆跳转到主页进行登陆
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");
			if(user==null){
				response.sendRedirect(request.getContextPath()+"/login.jsp?flags=2");
				return;
			}
			//先获得当前用户的所有的订单
			productService service = new productService();
			List<Order> orderlist=null;
			try {
				orderlist= service.findAllOdrerByUid(user.getUid());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(orderlist!=null){
				for (Order order : orderlist){
					//获得每一个订单的oid,得到每个订单里的oredritem（订单项）
					String oid = order.getOid();
					List<Map<String, Object>> mapList=null;
					try {
						mapList = service.findAllOrderitemByOid(oid);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					//判断maplist不为空，对其进行遍历用于显示
					if(mapList!=null){
						for (Map<String, Object> map : mapList) {
							try {
								Orderitem orderitem = new Orderitem();
								//1.从map中取出count subtotal 封装到orderitem中
								BeanUtils.populate(orderitem, map);
								//2.从 map中取出pimage pname shop_price 封装到Product中
								Product product = new Product();
								BeanUtils.populate(product, map);
								//将product封装到orderitem中
								orderitem.setProduct(product);
								//将orderitem封装到order之中
								order.getOrderItems().add(orderitem);
							} catch (Exception e) {
								e.printStackTrace();
							} 
						}
					}
				}
			}
			for (Order order : orderlist) {
				System.out.println(order.getOid()+"my test ---");
			}
			//存入到request之中然后转发到order_list的页面
			request.setAttribute("orderlist", orderlist);
			request.getRequestDispatcher("/order_list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}