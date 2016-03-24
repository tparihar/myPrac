/**
 * 
 */
package com.calvinklein.rewards.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.calvinklein.rewards.dao.MemberDao;
import com.calvinklein.rewards.model.Address;
import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.model.User;

/**
 * @author Boot Camp User 011
 *
 */
public class DataHandlerTest {

	@Mock
	private MemberDao memDao;
	@InjectMocks
	private DataHandler dataHandler;

	private Member member;
	private User user;
	private Address address;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

		member = new Member();
		member.setFirstName("vishal");
		member.setLastName("parihar");
		member.setMaritalStatus("Single");
		member.setGender("male");
		member.setEmailId("vishal@gmail.com");

		user = new User();
		user.setEmail("vishal@");
		user.setPassword("vicky");
		user.setMemberId(20);

		address = new Address();
		address.setAddress1("6242");
		address.setAddress2("wain wright drive");
		address.setCity("new orleans");
		address.setState("lousiana");
		address.setCountry("usa");
		address.setZip("70122");

		member.setUser(user);
		member.setAdr(address);
	}

	/**
	 * Test method for
	 * {@link com.calvinklein.rewards.service.DataHandler#validateEmail(java.lang.String)}
	 * for Success
	 */
	@Test
	public void testValidateEmailSuccess() {
		Mockito.when(memDao.getEmail(anyString())).thenReturn(false);
		assertEquals(false, dataHandler.validateEmail("vishal@vishal.com"));
	}

	/**
	 * Test method for
	 * {@link com.calvinklein.rewards.service.DataHandler#validateEmail(java.lang.String)}
	 * for Failure
	 */
	@Test
	public void testValidateEmailFailure() {
		Mockito.when(memDao.getEmail("vishal@gmail.com")).thenReturn(true);
		assertEquals(false, dataHandler.validateEmail("vishal@vishal.com"));
		assertEquals(true, dataHandler.validateEmail("vishal@gmail.com"));
	}

	/**
	 * Test method for
	 * {@link com.calvinklein.rewards.service.DataHandler#registerMember(com.calvinklein.rewards.model.Member)}
	 * .
	 */
	@Test
	public void testRegisterMember() {
		/*
		 * Mockito.when(dataHandler.memshipNumberGenerator()).thenReturn(2464985
		 * );
		 */
		Mockito.when(memDao.registerMember(any(Member.class), any(Address.class), any(User.class))).thenReturn(true);
		assertEquals(true, dataHandler.registerMember(member));
	}

}
