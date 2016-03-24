package com.ck.reward.service;

import java.sql.SQLException;
import java.util.List;

import com.ck.reward.dao.MemberDao;
import com.ck.reward.entities.Income;
import com.ck.reward.entities.Member;

/**
 * 
 * @author Bootcamp User 03
 * This contains method to get Member related information
 */
public class MemberService {
	MemberDao memberDao=new MemberDao();
	
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao=memberDao;
		
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 * Retrieves all available income ranges 
	 */
	  public List<Income> getIncomeRange() throws Exception{
		  try {
			return memberDao.getIncomeRange();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Income range failed to load");
		}
	  }
	  
	  /**
	   * 
	   * @param accountId
	   * @return
	   * @throws Exception
	   * 
	   * Retrieves member information based on his account id
	   */
	  public Member getMemberDetail(String accountId) throws Exception{
		  try {
			return memberDao.getMember(accountId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("failed to load member");
		}
	  }

	
  
}
