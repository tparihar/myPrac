package com.ck.reward.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Bootcamp User 03
 * This class encapsulate resultset, statement,connection object returned for insert or update queries.
 */
public class UpdateResult {


	private Connection connection;
	private Statement statement;
	private int[] affectedRows;

	

	public UpdateResult(Connection connection, Statement statement, int[] affectedRows) {

		this.connection = connection;
		this.statement = statement;
		this.affectedRows=affectedRows;
	}
	
	
	//Returns count of affected Rows
	public int[] affectedRows(){
		return affectedRows;
	}
	
	
	//Returns newly generated value of the column that has auto increment  set.
	public List<Long> getGeneratedKey() {
		List<Long> generatedKeys= new ArrayList<>();
		try (ResultSet res = statement.getGeneratedKeys()) {
			
			while (res.next()) {
				generatedKeys.add(res.getLong(1));
			}
			res.close();
		} catch (SQLException e) {

		}
		return generatedKeys;

	}

	
	//Closes all the opened resources.
	public void close() {

		try {
			
			this.statement.close();
			this.connection.close();
			this.statement = null;
			this.connection = null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		

	}



}
