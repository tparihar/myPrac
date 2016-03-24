package com.ck.reward.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ck.reward.dao.LocationDao;
import com.ck.reward.dao.StoreDao;
import com.ck.reward.entities.Country;
import com.ck.reward.entities.State;
import com.ck.reward.entities.Store;
/**
 * 
 * @author Bootcamp User 03
 * Handles store related functionality
 */
public class StoreService {
	LocationDao locationDao=new LocationDao();
	StoreDao storeDao=new StoreDao();
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 * Retrieves list of country where store is situated
	 */
	
	
	public void setDaos(StoreDao storeDao,LocationDao locationDao){
		this.locationDao=locationDao;
		this.storeDao=storeDao;
	}
	public List<Country> getCountries() throws Exception{
		try {
			return locationDao.getCountries();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Failed to load countries");
		}
		
		//return storeDao.getStores(countryId, stateId);
	}
	
	/**
	 * 
	 * @param countryId
	 * @return
	 * @throws Exception
	 * 
	 * Retrieves list of state for given the country
	 */
	public List<State> getStates(String countryId) throws Exception{
		try {
			return locationDao.getSates(countryId);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Failed to load states");
		}
		
		//return storeDao.getStores(countryId, stateId);
	}
	
	/**
	 * 
	 * @param countryId
	 * @param stateId
	 * @return
	 * @throws Exception
	 * Retrieves list of store and its details  in the given country and state
	 */
	public List<Store> getStores(String countryId, String stateId) throws Exception {
		try {
			return storeDao.getStores(countryId, stateId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Failed to load stores");
		}
	}
	
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 * Retrieves list of available store emails.
	 */
	public Map<String, String>  getEmails() throws Exception{
		try {
			return storeDao.getEmails();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Failed to stores emails");
		}
	}
	
	
	
	
}
