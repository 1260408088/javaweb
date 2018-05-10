package com.king.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.king.domain.CarItem;
import com.king.domain.Cart;
import com.king.domain.Product;
import com.king.service.productService;

public class addProductToCar extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			//购物车是在session域之中的所以要放入session域之中,通过pid进行查询
			HttpSession session = request.getSession();
			productService service = new productService();
			//获得pid和购买数量的两个参数
			String pid = request.getParameter("pid");
			int buyNum = Integer.parseInt(request.getParameter("buyNum"));
			//获得商品信息
			Product product=null;
			try {
				product= service.findProductbyPid(pid);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//计算小计
			double subtotal=product.getShop_price()*buyNum;
			//封装CarItem
			CarItem carItem = new CarItem();
			carItem.setbuyNum(buyNum);
			carItem.setProduct(product);
			carItem.setSubTotal(subtotal);
			//获得购物车---判断是否在session中已经存在购物车
			Cart cart = (Cart) session.getAttribute("cart");
			if(cart==null){
				cart=new Cart();
			}
			Map<String, CarItem> caritems = cart.getCaritems();
			double newsubtotal=0.0;
			//判断商品是否已经存在购物车之中
			if(caritems.containsKey(pid)){
				//存在将商品数量增加，小计增加
				CarItem Item = caritems.get(pid);  //获得商品信息
				int newbuyNum=Item.getbuyNum()+buyNum;//将商品的原有购买个数取出，再与本次购买数量相加
				double oldTotal = Item.getSubTotal();
				newsubtotal=buyNum*product.getShop_price();//先获得本次购买小计
				//更新小计和总数
				Item.setbuyNum(newbuyNum);
				Item.setSubTotal(newsubtotal+oldTotal);
				//修改之后再添加进去(作为引用不用放回)
				//cart.setCaritems(caritems); 
			}else{
				//不存在则直接添加
				//设置商品条目到购物车
				cart.getCaritems().put(pid, carItem);
				newsubtotal=buyNum*product.getShop_price();  //直接本次的商品乘于单价
			}
			//计算总价
			double total=cart.getTotal()+newsubtotal;
			
			//设置单价到
			cart.setTotal(total);
			//将车再次访问session
			session.setAttribute("cart", cart);
			//使用重定向解决，页面刷新商品 总价增长的问题
			response.sendRedirect(request.getContextPath()+"/cart.jsp");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}