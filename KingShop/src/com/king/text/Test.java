package com.king.text;

import java.sql.SQLException;

import com.king.dao.ProductDao;

public class Test {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 ProductDao dao=new ProductDao();
		 int name = dao.findcountByName("华为");
		 System.out.println(name);
	}

}
