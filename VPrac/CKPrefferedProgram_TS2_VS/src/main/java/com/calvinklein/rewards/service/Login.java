package com.calvinklein.rewards.service;

import javax.jws.WebService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
@Transactional
@Service
@WebService(endpointInterface = "com.calvinklein.rewards.service.LoginInterface")
public class Login implements LoginInterface {

	/* User user1 = new User(); */

	private LoginDao lDao;

	/**
	 * @param lDao
	 *            the lDao to set
	 */
	public void setlDao(LoginDao lDao) {
		this.lDao = lDao;
	}

	/**
	 * @param mDao
	 *            the mDao to set
	 */
	public void setmDao(MemberDao mDao) {
		this.mDao = mDao;
	}

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
		/*
		 * MemberDao memDao = new MemberDao(); member =
		 * memDao.getMember(memberId); return member;
		 */
		Member member = null;
		member = mDao.getMember(memberId);
		return member;

	}

}
