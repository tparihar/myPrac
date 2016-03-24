package com.calvinklein.rewards.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.calvinklein.rewards.dao.LoginDao;
import com.calvinklein.rewards.model.User;

public class TestLoginDao {

	/**
	 * @Success: This test checks whether user information is valid by comparing
	 *           passwords for provided actual email Id
	 *
	 */
	@Test
	public void testGetLoginInfoForSuccess() {

		User userDetailsExpected = new User();
		userDetailsExpected.setEmail("vishalpariharthakur@gmail.com");

		LoginDao lDao = new LoginDao();
		assertEquals("123456", lDao.getLoginInfo(userDetailsExpected.getEmail()).getPassword());
		assertEquals("9", lDao.getLoginInfo(userDetailsExpected.getEmail()).getMemberId());
	}

	/**
	 * @Failure: This test checks whether user information is valid by comparing
	 *           passwords for provided fake email Id
	 * 
	 */
	public void testGetLoginInfoForFailure() {

		User userDetailsExpected = new User();
		userDetailsExpected.setEmail("vishal_thakur1992yahoo.com");

		LoginDao lDao = new LoginDao();

		if (lDao.getLoginInfo(userDetailsExpected.getEmail()).getPassword() != ("123456")
				&& lDao.getLoginInfo(userDetailsExpected.getEmail()).getMemberId() != ("72")) {

		} else {
			assertFalse(false);
		}
	}

	/**
	 * @Failure: This test checks whether user information is valid for Null
	 *           email Id
	 * 
	 */
	@Test
	public void testGetLoginInfoForNull() {

		User userDetailsExpected = new User();

		LoginDao lDao = new LoginDao();

		assertEquals(null, lDao.getLoginInfo(userDetailsExpected.getEmail()).getPassword());
		assertEquals(null, lDao.getLoginInfo(userDetailsExpected.getEmail()).getMemberId());
	}

	/**
	 * @Success: This test check where the obtained object reference is of type
	 *           User
	 * 
	 */
	@Test
	public void testGetLoginInfoForReturnType() {

		User userDetailsExpected = new User();
		LoginDao lDao = new LoginDao();
		assertTrue(lDao.getLoginInfo(userDetailsExpected.getEmail()) instanceof User);
	}
}