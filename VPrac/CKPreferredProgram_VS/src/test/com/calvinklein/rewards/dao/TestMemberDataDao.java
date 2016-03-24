package com.calvinklein.rewards.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.calvinklein.rewards.dao.MemberDataDao;
import com.calvinklein.rewards.model.Member;

public class TestMemberDataDao {

	/**
	 * @Success: This test checks whether user information is valid for valid
	 *           Email Id
	 * 
	 */
	@Test
	public void testGetMemberInfoforSuccess() {

		int memberId = 9;
		MemberDataDao mdd = new MemberDataDao();
		Member member = mdd.getMemberInfo(memberId);

		assertEquals("Thakur Vishal Singh", member.getFirstName());
		assertEquals("Parihar", member.getLastName());

	}

	/**
	 * @Success: This test checks whether user information is valid for invalid
	 *           member ID
	 */
	@Test
	public void testGetMemberInfoforFailure() {

		int memberId = 50;
		MemberDataDao mdd = new MemberDataDao();
		Member member = mdd.getMemberInfo(memberId);

		assertEquals(null, member.getFirstName());
		assertEquals(null, member.getLastName());

	}

	/**
	 * @Success: This test checks whether user information is valid for non
	 *           existing member ID
	 */
	@Test
	public void testGetMemberInfoforZero() {

		int memberId = 0;
		MemberDataDao mdd = new MemberDataDao();
		Member member = mdd.getMemberInfo(memberId);

		assertEquals(null, member.getFirstName());
		assertEquals(null, member.getLastName());

	}
}
