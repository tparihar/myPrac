package com.ck.reward.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ck.reward.dao.MemberDao;
import com.ck.reward.entities.Income;

/**
 * @author Bootcamp User 03
 * This contains method to get Member related information.
 */

@Service
public class MemberService {
	
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
	 * @return
	 * @throws Exception
	 * Retrieves all available income ranges
	 */
	@Transactional(readOnly = true)
	public List<Income> getIncomeRange() throws Exception {
		
		try {
			return memberDao.getIncomeRange();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Income range failed to load");
		}
		
	}
	
	/**
	 * 
	 * @return
	 * Return default gender list  map
	 */
	public Map<String, String> getAvailableGender() {
		
		Map<String, String> genders = new HashMap<String, String>();
		genders.put("m", "male");
		genders.put("f", "female");
		
		return genders;

	}


}
