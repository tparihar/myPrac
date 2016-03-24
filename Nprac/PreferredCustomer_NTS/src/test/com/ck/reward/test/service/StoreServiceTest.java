package com.ck.reward.test.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ck.reward.dao.LocationDao;
import com.ck.reward.dao.StoreDao;
import com.ck.reward.entities.Country;
import com.ck.reward.entities.State;
import com.ck.reward.entities.Store;
import com.ck.reward.service.StoreService;

public class StoreServiceTest {

	StoreService storeService;
	LocationDao locationDao;
	StoreDao storeDao;

	@Before
	public void setUp() {
		locationDao = mock(LocationDao.class);
		storeDao = mock(StoreDao.class);
		storeService = new StoreService();
		storeService.setDaos(storeDao, locationDao);
	}
	
	/**
	 * 
	 * @throws Exception
	 * Test  getCountries() method by validating expected list of countries 
	 * are returned.
	 * 
	 */

	@Test
	public void testGetCountries() throws Exception {
		
		List<Country> countryList = new ArrayList<Country>();
		
		Country country = new Country();
		country.setId("2");
		country.setName("US");
		countryList.add(country);

		when(locationDao.getCountries()).thenReturn(countryList);
		
		Country actualCountry = null;
		assertNotNull(actualCountry = storeService.getCountries().get(0));
		assertSame("US", actualCountry.getName());
		assertSame("2", actualCountry.getId());

	}

	/**
	 * 
	 * @throws Exception
	 * Test getCountries() method by returning empty list of countries.
	 */
	@Test
	public void testGetCountriesWithEmptyList() throws Exception {
		List<Country> countryList = new ArrayList<Country>();

		when(locationDao.getCountries()).thenReturn(countryList);
		List<Country> actualCountryList = null;
		assertNotNull(actualCountryList = storeService.getCountries());
		assertSame(0, actualCountryList.size());

	}

	
	/**
	 * 
	 * @throws Exception
	 * Test getStates(String countryId) method providing valid country id
	 * Expected result is valid list of states
	 */
	@Test
	public void testGetStatesWithValidCountryId() throws Exception {
		List<State> stateList = new ArrayList<State>();
		State state = new State();
		state.setId("2");
		state.setName("Texas");
		stateList.add(state);

		when(locationDao.getSates(any(String.class))).thenReturn(stateList);
		State actualState = null;
		assertNotNull(actualState = storeService.getStates("1").get(0));
		assertSame("Texas", actualState.getName());
		assertSame("2", actualState.getId());
	}

	
	/**
	 * 
	 * @throws Exception
	 * Test getStates(String countryId) method providing invalid country id
	 * Expected result is state list with size zero
	 */
	@Test
	public void testGetStatesWithInValidCountryId() throws Exception {
		List<State> stateList = new ArrayList<State>();

		when(locationDao.getSates(any(String.class))).thenReturn(stateList);
		List<State> actualStateList = null;
		assertNotNull(actualStateList = storeService.getStates("022"));
		assertSame(0, actualStateList.size());

	}
	/**
	 * 
	 * @throws Exception
	 * Test getStores(String countryId ,String StoreId) method with valid country and state id
	 * expected result is for it to return valid store 
	 */
	@Test
	public void testGetStoresWithValidDetails() throws Exception {

		String stateId = "2";
		String countryId = "2";

		List<Store> storeList = new ArrayList<Store>();
		Store store = new Store();
		store.setAddress1("4803 Regent Blvd");
		store.setAddress2("Suite 008");
		store.setId("1");
		store.setName("Tech Wick");
		store.setCity("Irving");
		store.setZip("74034");
		store.setStateId(stateId);
		store.setCountryId(countryId);
		storeList.add(store);

		when(storeDao.getStores(any(String.class), any(String.class))).thenReturn(storeList);
		List<Store> actualStoreList = null;
		Store actualStore = null;
		assertNotNull(actualStoreList = storeService.getStores(countryId, stateId));
		assertNotNull(actualStore = actualStoreList.get(0));

		assertSame("4803 Regent Blvd", actualStore.getAddress1());
		assertSame("Suite 008", actualStore.getAddress2());
		assertSame("1", actualStore.getId());
		assertSame("Tech Wick", actualStore.getName());
		assertSame("74034", actualStore.getZip());
		assertSame(stateId, actualStore.getStateId());

	}
}
