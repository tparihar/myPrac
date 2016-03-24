package com.calvinklein.rewards.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import com.calvinklein.rewards.dao.MemberDao;
import com.calvinklein.rewards.model.Address;
import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.model.User;

/**
 * 
 * This class brings the data from database using another DAO class and displays
 * it on Screen
 *
 */
public class DataHandler {

	@Autowired
	private MemberDao memDao;

	/**
	 * This method validates email
	 * 
	 * @return boolean
	 */
	public boolean validateEmail(String email) {
		boolean isvalid = memDao.getEmail(email);
		return isvalid;
	}

	/**
	 * This methods generates an unique Member Ship Id for the member
	 * 
	 * @return int
	 */
	public int memshipNumberGenerator() {
		Random random = new Random();
		int memberShipNum = random.nextInt(10000000);
		return memberShipNum;

	}

	/**
	 * This methods process the member details received from user
	 * 
	 * @return boolean
	 * 
	 */
	public boolean registerMember(Member member) {

		DataHandler dataHandler = new DataHandler();
		int memberShipNum = dataHandler.memshipNumberGenerator();
		member.setMemshipNumber(memberShipNum);

		User user = new User();
		user.setEmail(member.getUser().getEmail());
		user.setPassword(member.getUser().getPassword());

		Address address = new Address();
		address.setAddress1(member.getAdr().getAddress1());
		address.setAddress2(member.getAdr().getAddress2());
		address.setCity(member.getAdr().getCity());
		address.setCountry(member.getAdr().getCountry());
		address.setState(member.getAdr().getState());
		address.setZip(member.getAdr().getZip());

		boolean isSuccess = memDao.registerMember(member, address, user);

		return isSuccess;
	}

}
