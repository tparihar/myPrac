/**
 * 
 */
package com.calvinklein.rewards.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.calvinklein.rewards.dao.LoginDao;
import com.calvinklein.rewards.dao.MemberDao;
import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.model.User;

/**
 * @author Boot Camp User 011
 *
 */
public class LoginTest {

	@Mock
	private LoginDao loginDao;
	@Mock
	private MemberDao memberDao;
	@InjectMocks
	private Login login;
	private Member member;
	private User user;

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

		user = new User();
		user.setEmail("vishal@");
		user.setPassword("vicky");
		user.setMemberId(20);
	}

	/**
	 * Test method for
	 * {@link com.calvinklein.rewards.service.Login#validateUser(com.calvinklein.rewards.model.User, com.calvinklein.rewards.model.User)}
	 * for Success
	 */
	@Test
	public void testValidateUserSuccess() {

		Mockito.when(loginDao.getLoginInfo(anyString())).thenReturn(user);
		assertEquals(20, login.validateUser(user));
	}

	/**
	 * Test method for
	 * {@link com.calvinklein.rewards.service.Login#validateUser(com.calvinklein.rewards.model.User, com.calvinklein.rewards.model.User)}
	 * for Failure
	 */
	@Test
	public void testValidateUserFailure() {

		User failedUser = new User();

		Mockito.when(loginDao.getLoginInfo(anyString())).thenReturn(failedUser);
		assertEquals(0, login.validateUser(user));
	}

	/**
	 * Test method for
	 * {@link com.calvinklein.rewards.service.Login#getMemberDetails(int)}.
	 */
	@Test
	public void testGetMemberDetails() {

		Mockito.when(memberDao.getMember(1)).thenReturn(member);
		assertEquals(member, login.getMemberDetails(1));
		assertEquals(member.getFirstName(), login.getMemberDetails(1).getFirstName());
		assertEquals(member.getFirstName(), login.getMemberDetails(1).getFirstName());

	}

}
