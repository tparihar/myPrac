package com.ck.reward.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ck.reward.entities.Country;
import com.ck.reward.entities.State;

/**
 * 
 * @author Bootcamp User 03 
 * Provides country and state details.
 */

@Repository
public class LocationDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	

	/**
	 * 
	 * @return
	 * @throws SQLException
	 * Retrieves country list from the table.
	 */
	@SuppressWarnings("unchecked")
	public List<Country> getCountries() throws SQLException {

		return sessionFactory.getCurrentSession().createQuery("from Country").list();

	}
	

	/**
	 * 
	 * @param countryId
	 * @return
	 * @throws SQLException
	 * 
	 * Retrieves state list from the table.
	 */

	@SuppressWarnings("unchecked")
	public List<State> getSates(int countryId) throws SQLException {

		Criteria crit = sessionFactory.getCurrentSession().createCriteria(State.class);		

		Criterion countryCondition = Restrictions.eq("country.id", countryId);

		crit.add(countryCondition);

		return crit.list();

	}
	

}
