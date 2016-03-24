package com.calvinklein.rewards.service;

import com.calvinklein.rewards.dao.LoginDao;
import com.calvinklein.rewards.dao.MemberDataDao;
import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.model.User;

/**
 * 
 * This class validates the member, by checks whether username and password are
 * valid
 *
 */
public class Login {

	User user1;

	/**
	 * This methods validates the Username and password
	 * 
	 * @param user
	 * @return boolean
	 */
	public boolean validateUser(User user) {

		String emailId = user.getEmail();
		String password = user.getPassword();
		LoginDao lDao = new LoginDao();

		user1 = lDao.getLoginInfo(emailId);
		if (emailId != null && password != null && password.equals(user1.getPassword())) {

			return true;
		} else {
			return false;
		}

	}

	/**
	 * This methods retrieves the memberId and password
	 * 
	 * @param memberId
	 * @return Member
	 */
	public Member getMemberDetails(int memberId) {

		MemberDataDao mdd = new MemberDataDao();
		Member member = null;
		member = mdd.getMemberInfo(memberId);
		return member;
	}

}
