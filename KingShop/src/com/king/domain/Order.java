package com.king.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {

	/*FieldTypeComment
	oid varchar(32) NOT NULL
	ordertime datetime NULL
	total double NULL
	state int(11) NULL
	address varchar(30) NULL
	name varchar(20) NULL
	telephone varchar(20) NULL
	uid varchar(32) NULL*/
	
	private String oid;  //订单编号
	private String ordertime; //下单时间
	private double total; //订单价格
	private int state; //下单状态，已付款，未付款
	private String address; //收货地址
	private String name; //收货人姓名
	private String telephone; //收货人电话
	private User user; //用户
	//该订单中有多少订单项
	List<Orderitem> orderItems = new ArrayList<Orderitem>(); //订单中有多少订单项
	
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Orderitem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<Orderitem> orderItems) {
		this.orderItems = orderItems;
	}
	
}
