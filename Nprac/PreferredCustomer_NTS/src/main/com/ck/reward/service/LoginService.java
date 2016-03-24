package com.ck.reward.service;

import java.sql.SQLException;

import com.ck.reward.dao.AccountDao;
import com.ck.reward.entities.Account;


/**
 * 
 * @author Bootcamp User 03
 * This handles login logic 
 */
public class LoginService {
	
	private AccountDao accountDao=new AccountDao();

 public void setAccountDao(AccountDao accountDao){
	 this.accountDao=accountDao;
 }
 
 /**
  *  
  * @param account
  * @return
  * @throws Exception
  * Returns either true or false based based on whether user credential detail
  * are match or not in the table
  * 
  */
  public boolean login(Account account) throws Exception{
		
	 try {
		return  accountDao.checkAccountExist(account);
	} catch (SQLException e) {
		e.printStackTrace();
		throw new Exception("Login Exception occurred");
	}
	
	 
	  
	  
  }
}
