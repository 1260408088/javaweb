package com.king.domain;
/**
 * 购物车商品列表
 */
public class CarItem {
	
	public Product product; //商品对象
	public int buyNum;  //数量
	public double subTotal;  //小计
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getbuyNum() {
		return buyNum;
	}
	public void setbuyNum(int buyNum) {
		this.buyNum = buyNum;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
}
