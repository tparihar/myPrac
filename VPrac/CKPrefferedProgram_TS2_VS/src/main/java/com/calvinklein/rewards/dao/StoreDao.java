package com.calvinklein.rewards.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.calvinklein.rewards.model.Country;
import com.calvinklein.rewards.model.State;
import com.calvinklein.rewards.model.Store;

/**
 * 
 * This Class Retrieves the store information from database, when member visits
 * Join page.
 *
 */
public class StoreDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * This Class Retrieves the country information from database, when member
	 * visits Join page.
	 * 
	 * @return HashMap
	 */
	@Transactional
	public List<Country> getCountries() {

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Country");
		List<Country> country = query.list();
		return country;

	}

	/**
	 * This Class Retrieves the states information from database, when member
	 * visits Join page.
	 * 
	 * @return HashMap
	 */
	@Transactional
	public List<State> getStates(String countryId) {

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from State where countryId = :countryId");
		query.setString("countryId", countryId);
		List<State> state = query.list();
		return state;

	}

	/**
	 * This Class Retrieves the store information from database, when member
	 * visits Join page.
	 * 
	 * @return HashMap
	 */
	@Transactional
	public List<Store> getStore(String stateId) {

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Store where stateId = :stateId");
		query.setString("stateId", stateId);
		List<Store> store = query.list();
		return store;

	}

}
