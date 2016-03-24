package com.calvinklein.rewards.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.calvinklein.rewards.dao.LoginDao;
import com.calvinklein.rewards.dao.MemberDao;
import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.model.User;

/**
 * 
 * This class validates the member, by checks whether username and password are
 * valid
 *
 */
public class Login {

	User user1 = new User();

	@Autowired
	private LoginDao lDao;

	@Autowired
	private MemberDao mDao;

	/**
	 * This methods validates the Username and password
	 * 
	 * @param user
	 * @return boolean
	 */
	public int validateUser(User user) {

		User user1 = lDao.getLoginInfo(user.getEmail());
		if (user.getPassword().equals(user1.getPassword())) {
			return user1.getMemberId();
		} else {
			return 0;
		}
	}

	/**
	 * This methods retrieves the member details from database
	 * 
	 * @param memberId
	 * @return Member
	 */

	public Member getMemberDetails(int memberId) {
		Member member = null;
		member = mDao.getMember(memberId);
		return member;
	}

}
