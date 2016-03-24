package com.ck.reward.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.ck.reward.dao.MemberDao;
import com.ck.reward.entities.Account;
import com.ck.reward.entities.Member;

@WebService
public interface LoginService {
	
	@WebMethod(operationName="MemberLogin")
	public Member login(@WebParam(name="loginDetails") Account account) throws Exception;
	
	
	public void setMemberDao(MemberDao memberDao);

}
