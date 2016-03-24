package com.calvinklein.rewards.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

import com.calvinklein.rewards.service.DataHandler;

/**
 * 
 * This class includes all the test cases for service layer
 *
 */
public class TestDataHandler {

	/**
	 * @Success if the values is the list are same as expected values
	 */

	@Test
	public void testRetriveStoreDetailsForSuccess() {

		DataHandler dataHandler = new DataHandler();

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("STR00144001", "katy mills,5000 katy mills circle,suite 358,katy");
		hm.put("STR00144006", "allen premium outlets,820 west stacy rd,suite 131,allen");

		assertEquals(hm.get("STR00144001"), dataHandler.retriveStoreDetails().get("STR00144001"));
		assertEquals(hm.get("STR00144006"), dataHandler.retriveStoreDetails().get("STR00144006"));

	}

	/**
	 * @Failure if the values in the list are not same
	 */
	@Test
	public void testRetriveStoreDetailsForFailure() {

		DataHandler dataHandler = new DataHandler();

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("STR00144011", "tanger outlets,4015 interstate 35 south,ste. 507,san marcos");

		boolean isValid;
		if (hm.get("STR00144011").equals(dataHandler.retriveStoreDetails().get("STR00144012"))) {

			isValid = true;
		} else {
			isValid = false;
		}
		assertFalse(isValid);
	}

	/**
	 * @Success if the actual value is of type int in range 0 t0 10000000
	 */
	@Test
	public void testMemShipNumberGeneratorforNumberInrange() {

		DataHandler dataHandler = new DataHandler();
		dataHandler.memshipNumberGenerator();
		int memshipNember = dataHandler.memshipNumberGenerator();

		if (memshipNember >= 0 && memshipNember <= 10000000) {

			assertTrue(true);
		} else {

			fail();
		}

	}

	/**
	 * @Success if the actual value differ from expected value
	 */
	@Test
	public void testMemShipNumberGeneratorforRandomNum() {

		assertTrue(437489234 != new DataHandler().memshipNumberGenerator());
		assertTrue(437489234 != new DataHandler().memshipNumberGenerator());
		assertTrue(437489234 != new DataHandler().memshipNumberGenerator());
		assertTrue(437489234 != new DataHandler().memshipNumberGenerator());

	}

}
