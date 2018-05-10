package com.king.domain;

import java.util.HashMap;
import java.util.Map;
	

/**
 * 购物车
 *
 */
public class Cart {
	private Map<String,CarItem> caritems=new HashMap<String, CarItem>();  //装购物车商品对象的Map
	private double total; //购物车中商品的总价
	
	public Map<String, CarItem> getCaritems() {
		return caritems;
	}
	public void setCaritems(Map<String, CarItem> caritems) {
		this.caritems = caritems;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
