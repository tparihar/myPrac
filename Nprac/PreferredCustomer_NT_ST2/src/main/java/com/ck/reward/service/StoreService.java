package com.ck.reward.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ck.reward.dao.LocationDao;
import com.ck.reward.dao.StoreDao;
import com.ck.reward.entities.Country;
import com.ck.reward.entities.State;
import com.ck.reward.entities.Store;
import com.ck.reward.entities.StoreEmail;

/**
 * 
 * @author Bootcamp User 03 
 * Handles store related functionality
 */

public class StoreService {

	LocationDao locationDao;
	StoreDao storeDao;

	
	
	/**
	 * @param locationDao
	 * LocationDao setter method.
	 */
	public void setLocationDao(LocationDao locationDao) {
		this.locationDao = locationDao;
	}

	
	/**
	 * @param storeDao
	 * StoreDao setter method.
	 */
	public void setStoreDao(StoreDao storeDao) {
		this.storeDao = storeDao;
	}

	
	/**
	 * @return
	 * @throws Exception
	 * Retrieves list of country.
	 */
	@Transactional(readOnly = true)
	public List<Country> getCountries() throws Exception {
		
		try {			
			return locationDao.getCountries();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Failed to load countries");
		}
		
	}

	/**
	 * 
	 * @param countryId
	 * @return
	 * @throws Exception
	 * 
	 * Retrieves list of state for given the country.
	 */
	@Transactional(readOnly = true)
	public List<State> getStates(int countryId) throws Exception {
		
		try {
			return locationDao.getSates(countryId);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Failed to load states");
		}

		
	}

	/**
	 * 
	 * @param countryId
	 * @param stateId
	 * @return
	 * @throws Exception
	 * Retrieves list of store and its address details in the given country
	 * and state.
	 */
	@Transactional(readOnly = true)
	public List<Store> getStores(int countryId, int stateId) throws Exception {

		try {
			return storeDao.getStores(countryId, stateId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Failed to load stores");
		}
	}
	

	/**
	 * @return
	 * @throws Exception
	 * Retrieves list of available store emails.
	 */
	@Transactional(readOnly = true)
	public List<StoreEmail> getEmails() throws Exception {
		
		try {
			return storeDao.getEmails();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new Exception("Failed to stores emails");
		}
		
	}
	

}
