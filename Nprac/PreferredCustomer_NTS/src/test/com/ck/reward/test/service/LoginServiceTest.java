package com.ck.reward.test.service;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.ck.reward.dao.AccountDao;
import com.ck.reward.entities.Account;
import com.ck.reward.service.LoginService;

public class LoginServiceTest {

	LoginService loginService = new LoginService();
	AccountDao accountDao = mock(AccountDao.class);
	
	
	@Before
	public void setUp(){
		loginService.setAccountDao(accountDao);
	}

	/**
	 * 
	 * @throws Exception
	 * Test login() method by  sending null values and
	 * expected result is false
	 */
	@Test
	public void testLoginWithNullValues() throws Exception {

		
		when(accountDao.checkAccountExist(any(Account.class))).thenReturn(false);

		Account account = new Account();
		account.setPassword("");
		account.setUserId("");

		assertFalse(loginService.login(account));
	}

	
	/**
	 * 
	 * @throws Exception
	 * Test login() method by  wrong username 
	 *  expected result is method should return false
	 */
	@Test
	public void testLoginWrongUsername() throws Exception {

		
		when(accountDao.checkAccountExist(any(Account.class))).thenReturn(false);

		Account account = new Account();
		account.setPassword("john");
		account.setUserId("johnx");

		assertFalse(loginService.login(account));
	}
	
	
	/**
	 * 
	 * @throws Exception
	 *  Test login() method with  wrong password 
	 *  expected result is method should return false
	 */
	@Test
	public void testLoginWrongPassword() throws Exception {

		
		when(accountDao.checkAccountExist(any(Account.class))).thenReturn(false);

		Account account = new Account();
		account.setPassword("johnx");
		account.setUserId("john");

		assertFalse(loginService.login(account));
	}

}
