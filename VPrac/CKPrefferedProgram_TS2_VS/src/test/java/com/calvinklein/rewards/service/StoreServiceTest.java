/**
 * 
 */
package com.calvinklein.rewards.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.map.HashedMap;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.calvinklein.rewards.dao.StoreDao;
import com.calvinklein.rewards.model.Country;
import com.calvinklein.rewards.model.State;
import com.calvinklein.rewards.model.Store;

/**
 * @author Boot Camp User 011
 *
 */
public class StoreServiceTest {

	@Mock
	private StoreDao storeDao;
	@InjectMocks
	private StoreService storeService;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Test method for
	 * {@link com.calvinklein.rewards.service.StoreService#getStores(java.lang.String)}
	 * .
	 */
	@Test
	public void testGetStores() {

		Store store = new Store();
		store.setStoreId("123456");
		store.setName("texas store");
		store.setStreet("regent blvd");
		store.setSuite("3050");
		store.setCity("texas");
		store.setStateId("232");

		List<Store> storeList = new ArrayList<Store>();
		storeList.add(store);

		HashedMap storeMap = new HashedMap();
		String value = storeList.get(0).getName() + ", " + storeList.get(0).getStreet() + ", "
				+ storeList.get(0).getSuite() + ", " + storeList.get(0).getCity();
		storeMap.put(storeList.get(0).getStoreId(), value);

		Mockito.when(storeDao.getStore(anyString())).thenReturn(storeList);
		assertEquals(storeMap, storeService.processStores("312"));
	}

	/**
	 * Test method for
	 * {@link com.calvinklein.rewards.service.StoreService#getCountries()}.
	 */
	@Test
	public void testGetCountries() {

		Country country = new Country();
		country.setCountryId("123456");
		country.setCountryAbb("USA");
		country.setCountryName("united states");

		List<Country> countryList = new ArrayList<Country>();
		countryList.add(country);

		HashedMap countryMap = new HashedMap();
		String value = countryList.get(0).getCountryName();
		countryMap.put(countryList.get(0).getCountryId(), value);

		Mockito.when(storeDao.getCountries()).thenReturn(countryList);
		assertEquals(countryMap, storeService.processCountries());
	}

	/**
	 * Test method for
	 * {@link com.calvinklein.rewards.service.StoreService#getStates(java.lang.String)}
	 * .
	 */
	@Test
	public void testGetStates() {

		State state = new State();
		state.setStateId("123456");
		state.setStateAbb("TX");
		state.setStateName("texas");

		List<State> stateList = new ArrayList<State>();
		stateList.add(state);

		HashedMap countryMap = new HashedMap();
		String value = stateList.get(0).getStateAbb() + ", " + stateList.get(0).getStateName();
		countryMap.put(stateList.get(0).getStateId(), value);

		Mockito.when(storeDao.getStates(anyString())).thenReturn(stateList);
		assertEquals(countryMap, storeService.processStates("2321sc"));
	}

}
