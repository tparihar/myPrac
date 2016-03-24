package com.ck.reward.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ck.reward.entities.Store;
import com.ck.reward.util.DBUtility;
import com.ck.reward.util.QueryResult;

/**
 * 
 * @author Bootcamp User 03 
 * It contains methods that handles store information  on database.
 */
public class StoreDao {
	/**
	 * 
	 * @param countryId
	 * @param stateId
	 * @return
	 * @throws SQLException
	 *  Retrieve all the available stores in the gien country and    state id
	 */
	public List<Store> getStores(String countryId, String stateId) throws SQLException {
		
		List<Store> stores = new ArrayList<Store>();

		QueryResult result = DBUtility.queryBy("select id,name,address1,address2,city,zip from ck.store where country_id=? and state_id=?",
												new Object[] { countryId, stateId });
		
		ResultSet resultSet = result.getResultSet();
		
		while (resultSet.next()) {
			Store store = new Store();
			store.setId(resultSet.getString("id"));
			store.setCountryId(countryId);
			store.setStateId(stateId);
			store.setName(resultSet.getString("name"));
			store.setAddress1(resultSet.getString("address1"));
			store.setAddress2(resultSet.getString("address2"));
			store.setZip(resultSet.getString("zip"));
			store.setCity(resultSet.getString("city"));
			stores.add(store);

		}
		result.close();

		return stores;

	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 *  Retrieves all the store emails
	 */
	public Map<String, String> getEmails() throws SQLException {

		Map<String, String> emailList = new HashMap<String, String>();

		QueryResult result = DBUtility.queryBy("select id,name from ck.store_email", new Object[] {});
		
		ResultSet resultSet = result.getResultSet();
		
		while (resultSet.next()) {
			emailList.put(resultSet.getString("id"), resultSet.getString("name"));
		}
		result.close();

		return emailList;

	}
}
