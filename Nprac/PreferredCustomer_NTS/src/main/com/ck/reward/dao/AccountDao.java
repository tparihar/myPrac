package com.ck.reward.dao;

import java.sql.ResultSet;

/**
 * It  contains methods that handles Account information on database.
 */
import java.sql.SQLException;

import com.ck.reward.entities.Account;
import com.ck.reward.util.DBUtility;
import com.ck.reward.util.QueryResult;
import com.ck.reward.util.UpdateResult;

public class AccountDao {

	/**
	 * 
	 * @param account
	 * @return Account
	 * @throws SQLException
	 * 
	 *             Saves account information in the table
	 */
	public Account createAccount(Account account) throws SQLException {

		UpdateResult result = DBUtility.save("insert into ck.account(username,password) values(?,?)",
				new Object[] { account.getUserId(), account.getPassword() });

		long returnValue = result.affectedRows().length > 0 ? result.getGeneratedKey().get(0) : 0;

		if (returnValue > 0) {
			account.setId(String.valueOf(returnValue));
		} else {
			throw new SQLException("Data was not inserted");
		}

		result.close();

		return account;
	}

	/**
	 * 
	 * @param username
	 * @return
	 * @throws SQLException
	 * 
	 *  Checks if username is available in the table or not
	 */
	public boolean checkUsernameExist(String username) throws SQLException {
		
		boolean resultFound = true;

		QueryResult result = DBUtility.queryBy("select * from ck.account where username=?", new Object[] { username });

		resultFound = result.getResultSet().next();

		result.close();

		return resultFound;
	}

	/**
	 * 
	 * @param account
	 * @return
	 * @throws SQLException
	 * 
	 *             Check if requested account exists in the table or not
	 */

	public boolean checkAccountExist(Account account) throws SQLException {
		boolean resultFound = true;
		
		QueryResult result = DBUtility.queryBy("select id from ck.account where username=? and password=?",
												new Object[] { account.getUserId(), account.getPassword() });
		
		ResultSet resultSet = result.getResultSet();
		
		if (resultFound = resultSet.next()) {
			account.setId(resultSet.getString("id"));
		}
		result.close();
		
		return resultFound;
	}

}
