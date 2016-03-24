package com.ck.reward.service;




import java.sql.SQLException;
import java.util.Random;

import org.springframework.transaction.annotation.Transactional;

import com.ck.reward.dao.MemberDao;
import com.ck.reward.entities.Member;
import com.ck.reward.exception.RegistrationException;

/**
 * 
 * @author Bootcamp User 03 
 * This contains method to handle member registration  functionality.
 */

public class RegistrationService {

	MemberDao memberDao;

	/**
	 * @param memberDao
	 * MemberDao setter.
	 */
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	/**
	 * 
	 * @param account
	 * @param member
	 * @return
	 * @throws RegistrationException
	 * 
	 * Registers and saves member information. 
	 * Returns true if registration passes or else returns  false.
	 */
	@Transactional
	public boolean register(Member member) throws RegistrationException {
		
		if (checkUsernameExist(member.getAccount().getUsername())) {
			throw new RegistrationException("Username Exist");
		}
		
		member.setId("AB" + String.valueOf(new Random().nextInt(999) + 1000));
		
		memberDao.save(member);

		return true;

	}

	/**
	 * 
	 * @param username
	 * @return
	 * Checks if given username exist.
	 * 
	 */
	@Transactional(readOnly=true)
	public boolean checkUsernameExist(String username) {

		try {
			return memberDao.findUserId(username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
	
	
}
