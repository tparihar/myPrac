package com.calvinklein.rewards.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.calvinklein.rewards.dao.StoreDao;
import com.calvinklein.rewards.model.Country;
import com.calvinklein.rewards.model.State;
import com.calvinklein.rewards.model.Store;

public class StoreService {

	@Autowired
	private StoreDao storeDao;

	/**
	 * This methods process state information
	 * 
	 * @param stateId
	 * @return HashMap
	 */
	public HashMap<String, String> processStores(String stateId) {

		List<Store> stores = storeDao.getStore(stateId);
		HashMap<String, String> storeList = new HashMap<String, String>();

		for (Store str : stores) {
			String value = str.getName() + ", " + str.getStreet() + ", " + str.getSuite() + ", " + str.getCity();
			storeList.put(str.getStoreId(), value);
		}
		return storeList;

	}

	/**
	 * This methods process country information
	 * 
	 * @return HashMap
	 */
	public HashMap<String, String> processCountries() {

		List<Country> countries = storeDao.getCountries();
		HashMap<String, String> CountryList = new HashMap<String, String>();

		for (Country country : countries) {
			String value = country.getCountryName();
			CountryList.put(country.getCountryId(), value);
		}
		return CountryList;
	}

	/**
	 * This methods process store information
	 * 
	 * @param countryId
	 * @return HashMap
	 */
	public HashMap<String, String> processStates(String countryId) {

		List<State> states = storeDao.getStates(countryId);
		HashMap<String, String> stateList = new HashMap<String, String>();
		for (State states1 : states) {
			String value = states1.getStateAbb() + ", " + states1.getStateName();
			stateList.put(states1.getStateId(), value);
		}
		return stateList;
	}
}