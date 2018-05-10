package com.king.web;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.king.domain.CarItem;
import com.king.domain.Cart;
import com.king.domain.Order;
import com.king.domain.Orderitem;
import com.king.domain.Product;
import com.king.domain.User;
import com.king.service.productService;
import com.king.utils.ConmmentUtils;
import com.king.utils.MailUtils;

public class submitOredrServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		  	HttpSession session = request.getSession();
			//先要在web层将Order对象封装完毕
			User user = (User) session.getAttribute("user");
			//判断用户是否登陆，未登陆跳转到登陆的页面，并返回不执行下面的代码
			if(user==null){
				response.sendRedirect(request.getContextPath()+"/login.jsp?flags=1");
				return;
			}
			Cart cart = (Cart) session.getAttribute("cart");
			Order order = new Order();
			//1.封装oid订单编号
			order.setOid(ConmmentUtils.getUUid());
			//2.封装下单时间
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			order.setOrdertime(sdf.format(date)+" ");
			//3.封装订单价格（小计）
			order.setTotal(cart.getTotal());
			//4.封装下单状态
			order.setState(0);
			//5.封转收货地址
			order.setAddress(null);
			//6.封转收货人姓名和电话
			order.setName(null);
			order.setTelephone(null);
			//7.封装订单所属的用户
			order.setUser(user);
			//8.封装订单项
			Map<String, CarItem> caritems = cart.getCaritems();
			for (Map.Entry<String, CarItem> carentry:caritems.entrySet()) {
				//获得map中的值，然后添加到order中的订单项之中
				CarItem cartitem = carentry.getValue();
				//创建一个rederitem 订单项的类
				Orderitem orderitem = new Orderitem();
				//封装itemid订单项id
				orderitem.setItemid(ConmmentUtils.getUUid());
				//封装订单项的商品数量
				orderitem.setCount(cartitem.getbuyNum());
				//封装订单项价格小计
				orderitem.setSubtotal(cartitem.getSubTotal());
				//封装订单项的 商品
				orderitem.setProduct(cartitem.getProduct());
				//封装此订单项的所属
				orderitem.setOrder(order);
				//将此订单项放入订单中order
				order.getOrderItems().add(orderitem);
			}
			//封装完对象之后，传递数据到service层
			productService service = new productService();
			service.submitOrder(order);
			//订单提交成功后，将订单信息添加到session中
			session.setAttribute("order", order);
			//跳转到订单展示页面
			response.sendRedirect(request.getContextPath()+"/order_info.jsp");
			
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}