package com.calvinklein.rewards.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.calvinklein.rewards.model.User;
import com.calvinklein.rewards.util.DatabaseConnection;

/**
 * 
 * This Class Retrieves the member information from database, when member tries
 * to login.
 *
 */
public class LoginDao {
	/**
	 * This Class Retrieves the member information from database, when member
	 * tries to login.
	 * 
	 * @param emailId
	 * @return User
	 */
	public User getLoginInfo(String emailId) {

		User user1 = new User();
		ResultSet rs;

		try {
			PreparedStatement pst = DatabaseConnection.getConnection()
					.prepareStatement("select password,memberId from login where emailid=?");
			pst.setString(1, emailId);

			rs = pst.executeQuery();
			while (rs.next()) {
				user1.setPassword(rs.getString(1));
				user1.setMemberId(rs.getString(2));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DatabaseConnection.getConnection().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return user1;
	}
}
