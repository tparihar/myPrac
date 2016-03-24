package com.ck.reward.service;

import java.sql.SQLException;
import java.util.Random;

import com.ck.reward.dao.AccountDao;
import com.ck.reward.dao.MemberDao;
import com.ck.reward.entities.Account;
import com.ck.reward.entities.Member;
import com.ck.reward.exception.RegistrationException;
/**
 * 
 * @author Bootcamp User 03
 * This contains method to handle member registration functionality
 */
public class RegistrationService {
  
	AccountDao accountDao=new AccountDao();
	MemberDao memberDao=new MemberDao();
	
	public void setDaos(AccountDao accountDao,MemberDao memberDao){
		this.accountDao=accountDao;
		this.memberDao=memberDao;
	}
	

	
	/**
	 * 
	 * @param account
	 * @param member
	 * @return
	 * @throws RegistrationException
	 * 
	 *  Registers and saves member information. Return true if registration passes
	 *  or else return registration false
	 */
	public boolean register(Account account,Member member) throws RegistrationException{
		if(member==null || account ==null || account.getUserId()==""|| account.getPassword()==""){
			return false;
		}
		
		/* 
		 * If username exist throw registration exception 
		 */
		try{
		if(checkUsernameExist(account.getUserId())){
			throw new RegistrationException("Username Exist");
		}
		
		//create user account
		
		Account registeredAccount=accountDao.createAccount(account);
		
		//Assign newly created account id in the member object
		member.setAccountId(registeredAccount.getId());		
		//Generates and sets unique member id.
		member.setId("AB"+String.valueOf(new Random().nextInt(999)+1000));
		
		//Save memeber information, addres ,profile and email preference
		memberDao.createMember(member);
		memberDao.saveAddress(member.getAddress(),member.getAccountId());		
		memberDao.saveProfile(member.getProfile(), member.getAccountId());		
		memberDao.saveEmailPreference(member.getProfile().getEmailPreferences(), member.getAccountId());

		return true;
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
		
		
		
		
		
		
	}
	
	public boolean checkUsernameExist(String username) throws SQLException{
		try {
			return accountDao.checkUsernameExist(username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SQLException("Database problem while  checking usernames from the table");
		}
	}
}
