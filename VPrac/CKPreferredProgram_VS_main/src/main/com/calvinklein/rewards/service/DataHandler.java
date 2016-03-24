package com.calvinklein.rewards.service;

import java.util.HashMap;
import java.util.Random;

import com.calvinklein.rewards.dao.MemberDao;
import com.calvinklein.rewards.dao.StoreDao;
import com.calvinklein.rewards.model.Member;

/**
 * 
 * This class brings the data from database using another DAO class and displays
 * it on Screen
 *
 */
public class DataHandler {

	/**
	 * This class brings the data from database using another DAO class and
	 * displays it on Screen
	 * 
	 * @return HashMap
	 */
	public HashMap<String, String> retriveStoreDetails() {

		StoreDao storeDao = new StoreDao();
		HashMap<String, String> hm = storeDao.getStoreDetails();
		return hm;
	}

	/**
	 * This methods generates an unique Member Ship Id for the member
	 * 
	 * @return int
	 */
	public int memshipNumberGenerator() {

		Random random = new Random();
		int randomNum = random.nextInt(10000000);
		return randomNum;

	}

	/**
	 * This methods call different methods of DAO classes
	 * 
	 * @return void
	 * @throws Exception
	 */
	public void registerMember(Member member, int memberId) throws Exception {

		MemberDao memDao = new MemberDao();
		memDao.registerMember(member, memberId);
		memDao.registerAddress(member, memberId);

	}

}
