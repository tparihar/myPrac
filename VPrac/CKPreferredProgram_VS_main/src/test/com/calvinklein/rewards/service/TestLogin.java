package com.calvinklein.rewards.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calvinklein.rewards.model.User;
import com.calvinklein.rewards.service.Login;

public class TestLogin {

	/**
	 * @Success: test to check whether user is valid with actual password
	 */
	@Test
	public void testValidateUserforTruePassword() {

		User user = new User();
		user.setEmail("vishalpariharthakur@gmail.com");
		user.setPassword("123456");

		Login login = new Login();
		boolean isValidUser = login.validateUser(user);

		assertTrue(isValidUser);

	}

	/**
	 * @Failure: test to check whether user is valid with false password
	 */
	@Test
	public void testValidateUserforfalsePassword() {

		User user = new User();
		user.setEmail("vishalpariharthakur@gmail.com");
		user.setPassword("vishal");

		Login login = new Login();
		boolean isValidUser = login.validateUser(user);

		assertFalse(isValidUser);

	}

	/**
	 * @Failure: test to check whether user is valid for null values
	 */
	@Test
	public void testValidateUserforNull() {

		User user = new User();
		Login login = new Login();
		boolean isValidUser = login.validateUser(user);

		assertFalse(false);

	}
}
