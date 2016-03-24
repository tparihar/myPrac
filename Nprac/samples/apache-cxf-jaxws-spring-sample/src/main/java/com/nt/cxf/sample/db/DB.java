package com.nt.cxf.sample.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
	Connection connection=null;
	PreparedStatement statement=null;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setConnection() {
		try {
			 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1", "webservice",
																"webservice");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet selectQuery(String sql,Object... item) throws SQLException{

		statement=getPreparedStatement(sql,item);
		return statement.executeQuery();
		
	
		
		
	}
	
	public int updateQuery(String sql,Object... item) throws SQLException{

		statement=getPreparedStatement(sql,item);
		return statement.executeUpdate();
	
		
		
	}
	
	public void close() throws SQLException{
		
		statement.close();
		connection.close();
		
		
		statement=null;
		connection=null;
	}
	
	
	
	public PreparedStatement getPreparedStatement(String sql,Object... item) throws SQLException{

	
		
			PreparedStatement statement1 = connection.prepareStatement(sql);
			for (int i = 0; i < item.length; i++) {

				try {
					statement1.setObject(i + 1, item[i]);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return statement1;
		
		
	
		
		
	}
}
