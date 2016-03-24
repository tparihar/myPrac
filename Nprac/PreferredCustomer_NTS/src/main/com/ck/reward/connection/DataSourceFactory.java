package com.ck.reward.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


/**
 * 
 * @author Bootcamp User 03
 * This class contains method to get connection from database pool using jndi lookup
 */
public class DataSourceFactory {

	
	private static DataSource datasource = null;
	
	/**
	 * 
	 * @return
	 * @throws NamingException
	 * Retrieves datasource using jndi resource lookup
	 */
	public static DataSource getDataSource() throws NamingException{
		if(datasource==null){
			
			datasource= (DataSource)new InitialContext().lookup("java:comp/env/jdbc/ck");
		}
		return datasource;
	}
	
	/**
	 * 
	 * @return
	 * @throws NamingException
	 * @throws SQLException
	 * Method gets connection from connection pool
	 */
	public static Connection getConnection() throws NamingException, SQLException{
		
		return datasource.getConnection();
	}
	
	
	private DataSourceFactory(){}
	
	
	
	
	
	
	
	
	
	
	

}
