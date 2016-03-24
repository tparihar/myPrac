package com.ck.reward.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.ck.reward.connection.DataSourceFactory;
/**
 * 
 * @author Bootcamp User 03
 * Handles establishing database connection and CRUD operations
 */
public class DBUtility {
	
	
	/**
	 * 
	 * @param sql
	 * @param item
	 * @return
	 * @throws SQLException
	 * Handle queries regarding retrieving data from tables
	 */
	public static QueryResult queryBy(String sql, Object[] item) throws SQLException {
		
		try {
			Connection connection=DataSourceFactory.getDataSource().getConnection();
			
			PreparedStatement statement = genearatePreparedStatement(connection,sql, item);

			ResultSet resultSet = statement.executeQuery();

			return new QueryResult(connection,statement,resultSet);

		} catch (NamingException e) {
			
			e.printStackTrace();
			throw new SQLException("Connection not found");
		}

	}
	
	

	
/**
 * 
 * @param sql
 * @param item
 * @return
 * @throws SQLException
 * 
 * Handles queries regarding inserts and update to tables
 */
	public static UpdateResult save(String sql, Object[] item) throws SQLException{

		
		
		try {
			
			Connection connection=DataSourceFactory.getDataSource().getConnection();
			PreparedStatement statement = genearatePreparedStatement(connection,sql, item);
			
			int[] rowInsertedCount=new int[]{statement.executeUpdate()};
			
			return new UpdateResult(connection,statement,rowInsertedCount);
			
		} catch (NamingException e) {
			
			e.printStackTrace();
			throw new SQLException("Connection not found");
		}
		
		
		

	}
	
	/**
	 * 
	 * @param sql
	 * @param items
	 * @return
	 * @throws SQLException
	 * Handles batch inserts into table
	 */
	public static UpdateResult batchSave(String sql, List<Object[]> items) throws SQLException{

		
		try {
			
			Connection connection = DataSourceFactory.getDataSource().getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			
			for(Object[] item:items){
			 statement = genearatePreparedStatement(statement, item);
			 statement.addBatch();
			 
			}			
			
			int[] rowInsertedCount=statement.executeBatch();
			
			return new UpdateResult(connection,statement,rowInsertedCount);
			
		} catch (NamingException e) {
			e.printStackTrace();
			throw new SQLException("Connection not found");
			
		}
		

	}

	/*public static void closeConnection(ResultSet resultSet) {
		try {
			Statement statement = resultSet.getStatement();
			Connection connection = statement.getConnection();
			System.out.println("closing Connection : "+connection);
			resultSet.close();
			statement.close();
			connection.close();

			resultSet = null;
			statement = null;
			connection = null;
		} catch (SQLException e) {
				e.printStackTrace();
		}
		System.out.println("Connection closed");

	}*/
	
	/**
	 * 
	 * @param con
	 * @param sql
	 * @param item
	 * @return
	 * @throws SQLException
	 * @throws NamingException
	 * Generates Prepared Statement for given query and connection.
	 */
	private static PreparedStatement genearatePreparedStatement(Connection con,String sql, Object... item)
			throws SQLException, NamingException {
		
		
		PreparedStatement statement = con.prepareStatement(sql);
		
		for (int i = 0; i < item.length; i++) {

			statement.setObject(i + 1, item[i]);
		}
		return statement;

	}
	
	/**
	 * 
	 * @param statement
	 * @param item
	 * @return
	 * @throws SQLException
	 * @throws NamingException
	 * Generates Prepared Statement for given query .
	 */
	
	private static PreparedStatement genearatePreparedStatement(PreparedStatement statement, Object... item)
			throws SQLException, NamingException {
		
		for (int i = 0; i < item.length; i++) {
			statement.setObject(i + 1, item[i]);
		}
		return statement;

	}

}
