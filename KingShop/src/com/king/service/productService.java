package com.king.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.king.dao.ProductDao;
import com.king.domain.Category;
import com.king.domain.Order;
import com.king.domain.PageBean;
import com.king.domain.Product;
import com.king.utils.DataSourceUtils;

public class productService {
	private static ProductDao productDao=new ProductDao();
	//获得最热商品
	public List<Product> findHotproduct() throws SQLException {
		List<Product> hotproduct=productDao.findHotproduct();
		return hotproduct;
	}
	//获得最新商品
	public List<Product> findNewproduct() throws SQLException {
		List<Product> newproduct=productDao.findNewproduct();
		return newproduct;
	}
	//获得所有的分类
	public List<Category> findAllCotegory() throws SQLException {
		List<Category> list = productDao.findAllCotegory();
		return list;
	}
	//根据cid获得商品的分类列表(service层)
	public PageBean findProductListByCid(String cid,int currentPage,int currentCount){
		//封装一个pageBean 返回web层
		PageBean<Product> pageBean = new PageBean<Product>();
		//1.封装当前页
		pageBean.setCurrentPage(currentPage);
		//2.封装当前每页显示的条数
		pageBean.setCurrentCount(currentCount);
		//3.封装总条数
		int totalCount=0;
		try {
			totalCount=productDao.getCount(cid);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		pageBean.setTotalCount(totalCount);
		System.out.println("service1......................");
	
		//4.封装的总页数(总数除以每页的商品数，有小数要 加一页)
		int totalPage= (int) Math.ceil(1.0*totalCount/currentCount);
		pageBean.setTotalPager(totalPage);
		//5.获得当前页显示的数据
		// 当前页显示的数据
		//select * from product where cid=? limit ?,?;
		int index=(currentPage-1)*currentCount;  //0 12    12 12    24 12 
		List<Product> findProductListByCid = null;
		try {
			findProductListByCid = productDao.findProductListByCid(cid,index,currentCount);
			System.out.println("service2......................");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		pageBean.setList(findProductListByCid);
		
		return pageBean;
	}
	//根据pid查找商品
	public Product findProductbyPid(String pid) throws SQLException {
		Product product=productDao.findProductbyPid(pid);
		return product;
	}
	
	//提交订单到数据库（事务）
	public void submitOrder(Order order) {
		
		//涉及到订单的提交，要使用事务
		//1.开启事务
		try {
			DataSourceUtils.startTransaction();
			productDao.addorder(order);
			productDao.addorderitems(order);
		} catch (SQLException e) {
			//2.出错则要回滚数据
			try {
				DataSourceUtils.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			try {
				//3.没有错误后提交数据
				DataSourceUtils.commitAndRelease();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//更新收货人地址和电话姓名
	public void updateOrderAdrr(Order order) throws SQLException {
		productDao.updateOrderAdrr(order);
	}
	//付款成功后修改订单状态
	public void updateOrderState(String r6_Order) throws SQLException {
		productDao.updateOrderState(r6_Order);
	}
	
	//通过用户的uid获得所有的订单
	public List<Order> findAllOdrerByUid(String uid) throws SQLException {
		List<Order> orderlist = productDao.findAllOdrerByUid(uid);
		return orderlist;
	}
	//通过oid获得此订单中的所有订单项
	public List<Map<String, Object>> findAllOrderitemByOid(String oid) throws SQLException {
		List<Map<String, Object>> maplist = productDao.findAllOrderitemByOid(oid);
		return maplist;
	}
	
	//通过关键词查找商品
	public List<Product> FindProductByName(String name) throws SQLException{
		List<Product> NameProduct=productDao.FindProductByName(name);
		return NameProduct;
	}
	
	//根据关键词分页查找商品
	public PageBean findProductListByName(String goodsname,int currentpage,int currentcount){
		//封装一个pageBean 返回web层
		PageBean<Product> pageBean = new PageBean<Product>();
		//1.封装当前页
		pageBean.setCurrentPage(currentpage);
		//2.封装当前每页显示的条数
		pageBean.setCurrentCount(currentcount);
		//3.封装总条数
		int totalCount=0;
		try {
			totalCount=productDao.findcountByName(goodsname);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		pageBean.setTotalCount(totalCount);
		//4.封装的总页数(总数除以每页的商品数，有小数要 加一页)
		int totalPage= (int) Math.ceil(1.0*totalCount/currentcount);
		pageBean.setTotalPager(totalPage);
		//5.获得当前页显示的数据
		//select * from product where cid=? limit ?,?;
		int index=(currentpage-1)*currentcount;  //0 12    12 12    24 12 
		List<Product> findProductListByCid = null;
		try {
			findProductListByCid = productDao.findProductListByKeyName(goodsname,index,currentcount);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		pageBean.setList(findProductListByCid);
		return pageBean;
	}
}
