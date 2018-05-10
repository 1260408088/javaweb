package com.king.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.king.domain.Category;
import com.king.domain.Order;
import com.king.domain.Product;
import com.king.utils.DataSourceUtils;

public class AdminDao {
	public static QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
	//向数据库中插入商品信息
	public void submitProductTodb(Product product) throws SQLException {
		
		String sql="insert into product values(?,?,?,?,?,?,?,?,?,?)";
		runner.update(sql, product.getPid(),product.getPname(),product.getMarket_price(),
				product.getShop_price(),product.getPimage(),product.getPdate(),
				product.getIs_hot(),product.getPdesc(),product.getPflag(),product.getCategory().getCid());
	}
	
	//获得所有订单的信息
	public List<Order> findAllorder() throws SQLException {
		String sql="select * from orders";
		List<Order> orderlist = runner.query(sql,new  BeanListHandler<Order>(Order.class));
		return orderlist;
	}
	
	//通过oid获得订单的详细信息
	public List<Map<String,Object>> findOrderByoid(String oid) throws SQLException {
		String sql="select p.pimage,p.pname,p.shop_price,i.count,i.subtotal "+
					" from orderitem i,product p "+
					" where i.pid=p.pid and i.oid=? ";
		return runner.query(sql, new MapListHandler(), oid);
	}
	//得到所有的分类名称
	public List<Category> getAllCategoryName() throws SQLException {
		String sql="select * from category";
		List<Category> list = runner.query(sql, new BeanListHandler<Category>(Category.class));
		System.out.println(list+"im a test pro");
		return list;
	}
	//得到所有的商品
	public List<Product> getAllProduct() throws SQLException {
		String sql="select * from product";
		List<Product> productList = runner.query(sql, new BeanListHandler<Product>(Product.class));
		return productList;
	}
	
	//根据cid删除商品分类
	public void deleteCategory(String cid) throws SQLException {
		String sql="delete from category where cid=?";
		runner.update(sql, cid);
	}
	//添加商品分类
	public void addcategory(Category category) throws SQLException {
		String sql="insert into category values(?,?)";
		runner.update(sql, category.getCid(),category.getCname());
	}
	//更新商品分类
	public void updateCategory(String cid,String cname) throws SQLException {
		String sql="update category set cname=? where cid=?";
		runner.update(sql, cname,cid);
	}
	
	//根据pid删除商品数据
	public int deleteProduct(String pid) throws SQLException {
		String sql="delete from product where pid=?";
		int len = runner.update(sql, pid);
		return len;
	}
	//通过pid获得商品的所有信息
	public Product findProductbypid(String pid) throws SQLException {
		String sql="select * from product where pid=?";
		Product product = runner.query(sql, new BeanHandler<Product>(Product.class), pid);
		return product;
	}
	
	//通过pid来更新商品的信息
	public void UpdateProduct(Product product) throws SQLException {
		String sql="update product set pname=?,market_price=?,shop_price=?,pimage=?,pdate=?," +
				"is_hot=?,pdesc=?,pflag=?,cid=? where pid=?";
		runner.update(sql,product.getPname(),product.getMarket_price(),
				product.getShop_price(),product.getPimage(),product.getPdate(),
				product.getIs_hot(),product.getPdesc(),product.getPflag(),product.getCategory().getCid(),product.getPid());
	}
	
}
