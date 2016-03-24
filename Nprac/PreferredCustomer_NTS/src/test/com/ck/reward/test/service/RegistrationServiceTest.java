package com.ck.reward.test.service;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.ck.reward.dao.AccountDao;
import com.ck.reward.dao.MemberDao;
import com.ck.reward.entities.Account;
import com.ck.reward.entities.Address;
import com.ck.reward.entities.Member;
import com.ck.reward.entities.Profile;
import com.ck.reward.entities.Store;
import com.ck.reward.exception.RegistrationException;
import com.ck.reward.service.RegistrationService;

public class RegistrationServiceTest {

	RegistrationService registrationService = new RegistrationService();

	MemberDao memberDao;
	AccountDao accountDao;

	Account testAccount;
	Member testMember;
	Store testStore;
	Address testAddress;
	Profile testProfile;

	@Before
	public void setUp() {

		memberDao = mock(MemberDao.class);
		accountDao = mock(AccountDao.class);
		registrationService.setDaos(accountDao, memberDao);

		testAccount = new Account();
		testAccount.setUserId(TempAccountDetail.username);
		testAccount.setPassword(TempAccountDetail.password);

		testMember = new Member();

		testMember.setFirstName(TempMemberDetails.firstName);
		testMember.setLastName(TempMemberDetails.lastName);
		testMember.setEmail(TempMemberDetails.email);
		testMember.setPhone(TempMemberDetails.phone);
		testStore = new Store();
		testStore.setId(TempStore.id);
		testStore.setStateId(TempStore.stateId);
		testStore.setCountryId(TempStore.countryId);
		testMember.setStore(testStore);

		testAddress = new Address();
		testAddress.setAddress1(TempMemberAddress.address1);
		testAddress.setAddress2(TempMemberAddress.address2);
		testAddress.setCity(TempMemberAddress.city);
		testAddress.setZip(TempMemberAddress.zip);
		testAddress.setStateId(TempMemberAddress.stateId);
		testAddress.setCountryId(TempMemberAddress.countryId);
		testMember.setAddress(testAddress);

		testProfile = new Profile();
		testProfile.setGender(TempMemberProfile.gender);
		testProfile.setMaritalStatus(TempMemberProfile.maritalState);
		testProfile.setBirthDay(TempMemberProfile.bday);
		testProfile.setBirthMonth(TempMemberProfile.bmonth);
		testProfile.setIncomeRange(TempMemberProfile.incomRangeId);
		testProfile.setEmailPreferences(TempMemberProfile.emailPref);
		testMember.setProfile(testProfile);
	}

	/**
	 * 
	 * @throws Exception
	 *             Test register(Account account,Member member) by providing
	 *             valid details Expected returned result is true and member id
	 *             should have right account id.
	 */
	@Test
	public void testRegisterWithValidData() throws Exception {

		Account mockedAccount = new Account();
		mockedAccount.setId("5");
		mockedAccount.setUserId(TempAccountDetail.username);
		mockedAccount.setPassword(TempAccountDetail.password);

		when(accountDao.createAccount(any(Account.class))).thenReturn(mockedAccount);
		when(memberDao.createMember(any(Member.class))).thenReturn(true);
		when(memberDao.saveAddress(any(Address.class), any(String.class))).thenReturn(true);
		when(memberDao.saveProfile(any(Profile.class), any(String.class))).thenReturn(true);
		when(memberDao.saveEmailPreference(any(String[].class), any(String.class))).thenReturn(true);

		assertTrue(registrationService.register(testAccount, testMember));
		assertSame("5", testMember.getAccountId());

	}

	/**
	 * 
	 * @throws SQLException
	 * @throws RegistrationException
	 * Test register(Account account,Member member) by providing null username
	 * Expected result is null 
	 */
	@Test
	public void testRegisterWithMissingUsername() throws SQLException, RegistrationException {

		when(accountDao.createAccount(any(Account.class))).thenThrow(new SQLException("Data was not inserted"));
		when(memberDao.createMember(any(Member.class))).thenReturn(true);
		when(memberDao.saveAddress(any(Address.class), any(String.class))).thenReturn(true);
		when(memberDao.saveProfile(any(Profile.class), any(String.class))).thenReturn(true);
		when(memberDao.saveEmailPreference(any(String[].class), any(String.class))).thenReturn(true);
		testAccount.setUserId("");

		assertFalse(registrationService.register(testAccount, testMember));

	}

	/**
	 * 
	 * @throws SQLException
	 * @throws RegistrationException
	 * Test register(Account account,Member member) by providing null member object
	 * Expected result is false
	 */
	@Test
	public void testRegisterWithNullMemberObject() throws SQLException, RegistrationException {
		Account mockedAccount = new Account();
		mockedAccount.setId("5");
		mockedAccount.setUserId(TempAccountDetail.username);
		mockedAccount.setPassword(TempAccountDetail.password);

		when(accountDao.createAccount(any(Account.class))).thenReturn(mockedAccount);
		when(memberDao.createMember(any(Member.class))).thenReturn(true);
		when(memberDao.saveAddress(any(Address.class), any(String.class))).thenReturn(true);
		when(memberDao.saveProfile(any(Profile.class), any(String.class))).thenReturn(true);
		when(memberDao.saveEmailPreference(any(String[].class), any(String.class))).thenReturn(true);

		
		assertFalse(registrationService.register(testAccount, null));

	}
	
	/**
	 * 
	 * @throws SQLException
	 * Test register(Account account,Member member) by providing correct username
	 * Expected result is true
	 */
	@Test
	public void testCheckUsernameExistWithCorrectUsername() throws SQLException {
		when(accountDao.checkUsernameExist(any(String.class))).thenReturn(true);
		assertTrue(registrationService.checkUsernameExist("username"));
	}

	/**
	 * 
	 * @throws SQLException
	 * Test register(Account account,Member member) by providing incorrect username
	 * Expected result is false
	 */
	@Test
	public void testCheckUsernameExistWithInCorrectUsername() throws SQLException {
		when(accountDao.checkUsernameExist(any(String.class))).thenReturn(false);
		assertFalse(registrationService.checkUsernameExist("username2"));
	}

	/**
	 * 
	 * @throws SQLException
	 * Test register(Account account,Member member) by providing null username
	 * Expected result is false
	 */
	@Test
	public void testCheckUsernameExistWithNullUsername() throws SQLException {
		when(accountDao.checkUsernameExist(any(String.class))).thenReturn(false);
		assertFalse(registrationService.checkUsernameExist(""));
	}

}
