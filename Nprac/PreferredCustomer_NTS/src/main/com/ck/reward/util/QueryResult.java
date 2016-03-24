package com.ck.reward.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Bootcamp User 03 
 * This class encapsulate resultset, statement,c onnection object returned for select queries.
 */
public class QueryResult {

	private Connection connection;
	private Statement statement;

	private ResultSet resultSet;

	public QueryResult(Connection connection, Statement statement, ResultSet resultSet) {

		this.connection = connection;
		this.statement = statement;
		this.resultSet = resultSet;
	}

	//Returns resultset 
	public ResultSet getResultSet() {
		return this.resultSet;
	}

	
	//Closes all the opened resources.
	public void close() {

		try {

			this.resultSet.close();
			this.statement.close();
			this.connection.close();
			this.resultSet = null;
			this.statement = null;
			this.connection = null;
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
