package com.ck.reward.service;

import javax.jws.WebService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ck.reward.dao.MemberDao;
import com.ck.reward.entities.Account;
import com.ck.reward.entities.Member;
import com.ck.reward.web.LoginController;

/**
 * 
 * @author Bootcamp User 03 This handles login logic
 */
@Service
@WebService(endpointInterface = "com.ck.reward.service.LoginService", serviceName = "loginService")
public class LoginServiceImpl implements LoginService{

	private static final Logger logger=LogManager.getLogger(LoginServiceImpl.class);
	
	private MemberDao memberDao;
	
	

	/**
	 * @param memberDao
	 * Setter for MemberDao.
	 */
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	
	/**
	 * @param account
	 * @return
	 * @throws Exception
	 * Performs user login based on account credential
	 * Retrieves member info if user is found
	 * Returns true if login is success or else returns false 
	 */
	
	@Transactional(readOnly = true)
	public Member login(Account account) throws Exception {
		
		logger.info("login account");
		if (memberDao.checkAccountExist(account)) {
			
			Member member = memberDao.getMember(account);
			
			if (null != member) {
				logger.info("returning member");
				return member;
			}
		}
		logger.info("returning null");
		return null;

	}
}
