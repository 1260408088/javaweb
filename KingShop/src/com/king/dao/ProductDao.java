package com.king.dao;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.apache.taglibs.standard.tag.common.sql.DataSourceUtil;

import com.king.domain.Category;
import com.king.domain.Order;
import com.king.domain.Orderitem;
import com.king.domain.Product;
import com.king.utils.DataSourceUtils;
import com.sun.org.apache.xml.internal.utils.IntVector;

public class ProductDao {
	private static QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
	public List<Product> findHotproduct() throws SQLException {
		String sql=" select * from product where is_hot=? limit ?,? ";
		List<Product> hotproduct = runner.query(sql, new BeanListHandler<Product>(Product.class), 1,0,9);//从零开始查询九个
		return hotproduct;
	}

	public List<Product> findNewproduct() throws SQLException {
		String sql=" select * from product order by pdate desc limit ?,? ";//根据pdate的时间大小进行降序排列
		List<Product> newproduct = runner.query(sql, new BeanListHandler<Product>(Product.class),0,9);//从零开始查询九个
		return newproduct;
	}
	//获得所有的商品分类
	public List<Category> findAllCotegory() throws SQLException {
		String sql="select * from category";
		List<Category> list = runner.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : list) {
			category.toString();
		}
		return list;
	}
	
	//根据cid获得商品的分类列表
	public List<Product> findProductListByCid(String cid,int index,int currentCount) throws SQLException {
		String sql="select * from product where cid=? limit ?,?";
		List<Product> query = runner.query(sql, new BeanListHandler<Product>(Product.class),cid,index,currentCount);
		System.out.println("DAo2......................");
		return query;
	}
	//获得当前的cid下的所有商品数
	public int getCount(String cid) throws SQLException {
		String sql="select count(*) from product where cid=?";
		long query = (Long) runner.query(sql, new ScalarHandler(),cid);
		System.out.println("DAo1......................");
		return (int) query;
	}
	//获得商品通过pid
	public Product findProductbyPid(String pid) throws SQLException {
		String sql="select * from product where pid=?";
		Product product = runner.query(sql,new BeanHandler<Product>(Product.class),pid);
		return product;
	}
	//向Order表添加Order
	public void addorder(Order order) throws SQLException {
		QueryRunner runners = new QueryRunner();
		System.out.println("插入order");
		String sql="insert into orders values(?,?,?,?,?,?,?,?)";
		System.out.println("插入order");
		Connection conn = DataSourceUtils.getConnection();
		runners.update(conn, sql, order.getOid(),order.getOrdertime(),order.getTotal(),order.getState(),order.getAddress()
				,order.getName(),order.getTelephone(),order.getUser().getUid());
	}
	
	//向Orderitem表添加数据
	public void addorderitems(Order order) throws SQLException {
		QueryRunner runners = new QueryRunner();
		System.out.println("插入orderitems");
		String sql="insert into orderitem values(?,?,?,?,?)";
		System.out.println("插入orderitems");
		Connection conn = DataSourceUtils.getConnection();
		List<Orderitem> orderItems = order.getOrderItems();
		for (Orderitem orderitem : orderItems) {
			runners.update(conn, sql, orderitem.getItemid(),orderitem.getCount(),orderitem.getSubtotal(),orderitem.getProduct().getPid(),orderitem.getOrder().getOid());
		}
		
	}
	//更新收货人地址和电话 姓名
	public void updateOrderAdrr(Order order) throws SQLException {
		String sql="update orders set name= ?,address=?,telephone=? where oid=?";
		runner.update(sql, order.getName(),order.getAddress(),order.getTelephone(),order.getOid());
	}
	//付款成功后修改订单状态
	public void updateOrderState(String r6_Order) throws SQLException {
		String sql="update orders set state=? where oid=?";
		runner.update(sql, 1,r6_Order);
	}
		
	//通过用户名获得所有的订单
	public List<Order> findAllOdrerByUid(String uid) throws SQLException {
		String sql="select * from orders where uid=?";
		List<Order> query = runner.query(sql, new BeanListHandler<Order>(Order.class), uid);
		return query;
	}
	//通过oid获得此订单中的所有订单项
	public List<Map<String, Object>> findAllOrderitemByOid(String oid) throws SQLException {
		//"select i.count,i.subtotal,p.pimage,p.pname,p.shop_price from orderitem i,product p where i.pid=p.pid and i.oid=?";
		String sql="select i.count,i.subtotal,p.pimage,p.pname,p.shop_price from  orderitem i,product p where i.pid=p.pid and i.oid=?";
		List<Map<String, Object>> mapList = runner.query(sql, new MapListHandler(), oid);
		return mapList;
	}
	
	//根据商品 名称进行查询
	public List<Product> FindProductByName(String name) throws SQLException {
		String sql="select * from product where pname like ?";
		List<Product> list = runner.query(sql,new BeanListHandler<Product>(Product.class),"%"+name+"%");
		if(list!=null){
			System.out.println("---------------------------");
		}
		return list;
	}
	//根据商品名称进行分页查询
	public List<Product> findProductListByKeyName(String name,int index,int count) throws SQLException{
		String sql="select * from product where pname like ? limit ?,?";
		List<Product> list = runner.query(sql, new BeanListHandler<Product>(Product.class),"%"+name+"%",index,count);//从零开始查询九个
		return list;
	}
	
	//根据关键词查询的总条目数
	public int findcountByName(String name) throws SQLException{
		String sql="select count(*) from product where pname like ?";
		long query = (Long) runner.query(sql, new ScalarHandler(),"%"+name+"%");
		return (int)query;
	}
	
}
