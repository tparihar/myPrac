package com.ck.reward.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.ck.reward.entities.Store;
import com.ck.reward.entities.StoreEmail;

/**
 * 
 * @author Bootcamp User 03 
 * It contains methods that handles store information on database.
 */

public class StoreDao {
	/**
	 * 
	 * @param countryId
	 * @param stateId
	 * @return
	 * @throws SQLException
	 * Retrieve all the available stores in the given country and
	 * state id
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	
	/**
	 * 
	 * @param countryId
	 * @param stateId
	 * @return
	 * @throws SQLException
	 * 
	 * Retrieves stores in the given country and state.
	 */
	@SuppressWarnings("unchecked")
	public List<Store> getStores(int countryId, int stateId) throws SQLException {

		Criteria crit = sessionFactory.getCurrentSession().createCriteria(Store.class);		

		Criterion stateCondition = Restrictions.eq("state.id", stateId);
		Criterion countryCondition = Restrictions.eq("country.id", countryId);
		
		crit.add(stateCondition);
		crit.add(countryCondition);
		
		return crit.list();


	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 * Retrieves all the store emails
	 */
	@SuppressWarnings("unchecked")
	public List<StoreEmail> getEmails() throws SQLException {

		return sessionFactory.getCurrentSession().createCriteria(StoreEmail.class).list();
		

	}
}
