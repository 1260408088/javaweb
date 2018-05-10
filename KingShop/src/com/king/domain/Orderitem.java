package com.king.domain;

public class Orderitem {
	/*
	FieldTypeComment
	itemid varchar(32) NOT NULL
	count int(11) NULL
	subtotal double NULL
	pid varchar(32) NULL
	oid varchar(32) NULL*/
	private String itemid;  //订单项id
	private int count;  //订单项内的商品数量 
	private double subtotal; //订单项价格小计
	private Product product; //此订单项的商品
	private Order order;  //此订单属于那个订单
	
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
}
