package com.calvinklein.rewards.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.model.User;

@WebService
public interface LoginInterface {

	@WebMethod
	public int validateUser(User user);

	@WebMethod
	public Member getMemberDetails(int memberId);
}
