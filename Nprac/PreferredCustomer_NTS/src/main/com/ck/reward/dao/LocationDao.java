package com.ck.reward.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ck.reward.entities.Country;
import com.ck.reward.entities.State;
import com.ck.reward.util.DBUtility;
import com.ck.reward.util.QueryResult;

/**
 * 
 * @author Bootcamp User 03 
 * It contains methods that handles location data on  database.
 */
public class LocationDao {
	/**
	 * 
	 * @return
	 * @throws SQLException
	 *  Retrieves country list from the table.
	 */
	public List<Country> getCountries() throws SQLException {

		List<Country> countries = new ArrayList<Country>();

		QueryResult result = DBUtility.queryBy("select id,name from ck.country", new Object[] {});

		ResultSet resultSet = result.getResultSet();

		while (resultSet.next()) {
			countries.add(new Country(resultSet.getString("id"), resultSet.getString("name")));

		}
		result.close();

		return countries;

	}

	/**
	 * 
	 * @param countryId
	 * @return
	 * @throws SQLException
	 * 
	 *  Retrieves state list from the table.
	 */

	public List<State> getSates(String countryId) throws SQLException {

		List<State> states = new ArrayList<State>();

		QueryResult result = DBUtility.queryBy("select id,name from ck.state where country_id=?",
				new Object[] { countryId });

		ResultSet resultSet = result.getResultSet();

		while (resultSet.next()) {
			State state = new State();
			state.setId(resultSet.getString("id"));
			state.setName(resultSet.getString("name"));
			states.add(state);

		}
		result.close();

		return states;

	}

}
