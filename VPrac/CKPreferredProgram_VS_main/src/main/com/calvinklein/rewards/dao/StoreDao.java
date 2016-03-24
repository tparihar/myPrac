package com.calvinklein.rewards.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import com.calvinklein.rewards.util.DatabaseConnection;

/**
 * 
 * This Class Retrieves the store information from database, when member visits
 * Join page.
 *
 */
public class StoreDao {
	/**
	 * This Class Retrieves the store information from database, when member
	 * visits Join page.
	 * 
	 * @return HashMap
	 */

	public HashMap<String, String> getStoreDetails() {

		HashMap<String, String> hm = new HashMap<String, String>();
		ResultSet rs;

		try {
			PreparedStatement pst = DatabaseConnection.getConnection()
					.prepareStatement("select * from ckstore where state_id=?");
			pst.setString(1, "SID00144");
			rs = pst.executeQuery();
			while (rs.next()) {
				String store = rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + "," + rs.getString(5);
				hm.put(rs.getString(1), store);
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

		return hm;

	}
}
