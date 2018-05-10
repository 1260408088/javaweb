package com.king.domain;

import java.util.List;

public class PageBean<T> {
	private int currentPage;  //当前页  total
	private int currentCount; //每页显示的个数   page
	private int totalCount;	  //总的商品数   size
	private int totalPager;   //总页数   rows
	private List<T> list;
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getCurrentCount() {
		return currentCount;
	}
	public void setCurrentCount(int currentCount) {
		this.currentCount = currentCount;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPager() {
		return totalPager;
	}
	public void setTotalPager(int totalPager) {
		this.totalPager = totalPager;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	} 
}
