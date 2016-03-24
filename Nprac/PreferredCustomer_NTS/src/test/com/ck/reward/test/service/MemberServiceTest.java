package com.ck.reward.test.service;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ck.reward.dao.MemberDao;
import com.ck.reward.entities.Income;
import com.ck.reward.entities.Member;
import com.ck.reward.entities.Store;
import com.ck.reward.service.MemberService;
import static org.junit.Assert.*;

public class MemberServiceTest {

	MemberService memberService = new MemberService();
	MemberDao memberDao = mock(MemberDao.class);

	@Before
	public void setUp() {
		memberService.setMemberDao(memberDao);
	}

	/**
	 * 
	 * @throws Exception
	 *             Tests getIncomeRange() method by validating if results
	 *             returned are correct.
	 * 
	 */
	@Test
	public void testGetIncomeRange() throws Exception {

		List<Income> incomeRange = new ArrayList<Income>();
		Income expectedIncome = new Income();
		expectedIncome.setId("123");
		expectedIncome.setRange("$4000-$5000");
		incomeRange.add(expectedIncome);

		when(memberDao.getIncomeRange()).thenReturn(incomeRange);

		Income actual = memberService.getIncomeRange().get(0);

		assertSame(expectedIncome.getId(), actual.getId());
		assertSame(expectedIncome.getRange(), actual.getRange());

	}

	/**
	 * 
	 * @throws Exception
	 *             Tests getMemberDetail(String memberId) method by providing
	 *             valid member id and it validates return result is correct or
	 *             not.
	 */
	@Test
	public void testGetMemberWithValidAccountId() throws Exception {
		
		String[] memberDetail = new String[] { "1", "fname", "lname", "email", "phone" };
		String[] storeDetail = new String[] { "2", "storename" };
		
		Member member = new Member();
		member.setAccountId(memberDetail[0]);
		member.setFirstName(memberDetail[1]);
		member.setLastName(memberDetail[2]);
		member.setEmail(memberDetail[3]);
		member.setPhone(memberDetail[4]);
		
		Store store = new Store();
		store.setId(storeDetail[0]);
		store.setName(storeDetail[1]);
		member.setStore(store);

		when(memberDao.getMember(any(String.class))).thenReturn(member);

		Member actualMember = memberService.getMemberDetail("2");

		assertSame(memberDetail[0], actualMember.getAccountId());
		assertSame(memberDetail[1], actualMember.getFirstName());
		assertSame(memberDetail[2], actualMember.getLastName());
		assertSame(memberDetail[3], actualMember.getEmail());
		assertSame(memberDetail[4], actualMember.getPhone());
		assertSame(storeDetail[0], actualMember.getStore().getId());
		assertSame(storeDetail[1], actualMember.getStore().getName());

	}
    /**
     * 
     * @throws Exception
     * Test getMember(String memeberId) method by providing incorrect member id.
     * Expected result is null;
     */
	@Test
	public void testGetMemberNonExistentAccountId() throws Exception {

		when(memberDao.getMember(any(String.class))).thenReturn(null);

		assertNull(memberService.getMemberDetail("2xx"));
	}
	
	/**
	 * 
	 * @throws Exception
	 * Test getMember(String memeberId) method by providing null member id.
	 * Expected result is null;
	 */
	@Test
	public void testGetMemberNullAccountId() throws Exception {

		when(memberDao.getMember(any(String.class))).thenReturn(null);

		assertNull(memberService.getMemberDetail(""));
	}

}
