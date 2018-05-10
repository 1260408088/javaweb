package com.king.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.king.domain.Order;
import com.king.service.productService;
import com.king.utils.PaymentUtil;
import com.sun.org.apache.commons.beanutils.BeanUtils;

public class confirmOrderServlcet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			//获得参数  收货人姓名   收货人地址   收货人电话（二次封装）
			request.setCharacterEncoding("UTF-8");
			Map properties = request.getParameterMap();
			Order order = new Order();
			try {
				BeanUtils.populate(order, properties);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			productService service = new productService();
			try {
				service.updateOrderAdrr(order);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			//2、在线支付
			/*if(pd_FrpId.equals("ABC-NET-B2C")){
				//介入农行的接口
			}else if(pd_FrpId.equals("ICBC-NET-B2C")){
				//接入工行的接口
			}*/
			//.......
			
			//只接入一个接口，这个接口已经集成所有的银行接口了  ，这个接口是第三方支付平台提供的
			//接入的是易宝支付
			// 获得 支付必须基本数据
			String orderid = request.getParameter("oid");
			//String money = order.getTotal()+"";//支付金额
			System.out.println(order.getTotal());  //无法得到总金额，还是需要在jsp页面传递过来
			String money = "0.01";//支付金额
			// 银行
			String pd_FrpId = request.getParameter("pd_FrpId");

			// 发给支付公司需要哪些数据
			String p0_Cmd = "Buy";
			String p1_MerId = ResourceBundle.getBundle("merchantInfo").getString("p1_MerId");
			String p2_Order = orderid;
			String p3_Amt = money;
			String p4_Cur = "CNY";
			String p5_Pid = "";
			String p6_Pcat = "";
			String p7_Pdesc = "";
			// 支付成功回调地址 ---- 第三方支付公司会访问、用户访问
			// 第三方支付可以访问网址
			String p8_Url = ResourceBundle.getBundle("merchantInfo").getString("callback");
			String p9_SAF = "";
			String pa_MP = "";
			String pr_NeedResponse = "1";
			// 加密hmac 需要密钥
			String keyValue = ResourceBundle.getBundle("merchantInfo").getString(
					"keyValue");
			String hmac = PaymentUtil.buildHmac(p0_Cmd, p1_MerId, p2_Order, p3_Amt,
					p4_Cur, p5_Pid, p6_Pcat, p7_Pdesc, p8_Url, p9_SAF, pa_MP,
					pd_FrpId, pr_NeedResponse, keyValue);


			String url = "https://www.yeepay.com/app-merchant-proxy/node?pd_FrpId="+pd_FrpId+
					"&p0_Cmd="+p0_Cmd+
					"&p1_MerId="+p1_MerId+
					"&p2_Order="+p2_Order+
					"&p3_Amt="+p3_Amt+
					"&p4_Cur="+p4_Cur+
					"&p5_Pid="+p5_Pid+
					"&p6_Pcat="+p6_Pcat+
					"&p7_Pdesc="+p7_Pdesc+
					"&p8_Url="+p8_Url+
					"&p9_SAF="+p9_SAF+
					"&pa_MP="+pa_MP+
					"&pr_NeedResponse="+pr_NeedResponse+
					"&hmac="+hmac;

			//重定向到第三方支付平台
			response.sendRedirect(url);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}