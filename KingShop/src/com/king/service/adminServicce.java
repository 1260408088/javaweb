package com.king.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.king.dao.AdminDao;
import com.king.domain.Category;
import com.king.domain.Order;
import com.king.domain.Product;

public class adminServicce {
	public static AdminDao adminDao = new AdminDao();
	//添加商品到数据库
	public void submitProductTodb(Product product) {
		try {
			adminDao.submitProductTodb(product);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//更新商品到数据库
	public void UpdateProduct(Product product){
		try {
			adminDao.UpdateProduct(product);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//获得所有订单的信息
	public List<Order> findAllorder() {
		List<Order> orderlist=null;
		try {
			orderlist= adminDao.findAllorder();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return orderlist;
	}
	//根据oid查询订单的信息
	public List<Map<String,Object>>findOrderByoid(String oid) {
		List<Map<String, Object>> listmap = null;
		try {
			listmap = adminDao.findOrderByoid(oid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listmap;
	}
	//得到所有分类的名称
	public List<Category> getAllCategoryName() {
		List<Category> allCategoryName=null;
		try {
			allCategoryName= adminDao.getAllCategoryName();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return allCategoryName;
	}
	
	//得到所有的商品
	public List<Product> getAllProduct() {
		List<Product> allProduct=null;
		try {
			allProduct= adminDao.getAllProduct();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allProduct;
	}
	
	
	//根据cid删除商品分类
	public void deleteCategory(String cid) {
		try {
			adminDao.deleteCategory(cid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//添加商品信息
	public void addcategory(Category category) {
		try {
			adminDao.addcategory(category);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//更新商品分类
	public void updateCategory(String cid,String cname) {
		try {
			adminDao.updateCategory(cid,cname);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//根据pid删除数据库中的商品
	public boolean deleteProduct(String pid) {
		int len=0;
		try {
			len = adminDao.deleteProduct(pid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return len>0;	
	}
	
	//获得商品的详细信息通过商品的pid
	public Product findProductbypid(String pid) {
		Product product =null;
		try {
			product=adminDao.findProductbypid(pid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}
	
}
