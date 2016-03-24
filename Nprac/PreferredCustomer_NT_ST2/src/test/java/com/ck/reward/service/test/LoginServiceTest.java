package com.ck.reward.service.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ck.reward.dao.MemberDao;
import com.ck.reward.entities.Account;
import com.ck.reward.entities.Member;
import com.ck.reward.service.LoginService;
import com.ck.reward.service.LoginServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest {
	
	
	
	@Mock 
	private MemberDao memberDao;
	
	private LoginService loginService= new LoginServiceImpl();
	
	@Test
	public void testLoginWithValidCredential() throws Exception{
		Member member=new Member();
		
		loginService.setMemberDao(memberDao);
		
		 when(memberDao.checkAccountExist(any(Account.class))).thenReturn(true);
		 when(memberDao.getMember(any(Account.class))).thenReturn(member);
		 Account account=new Account();
		 assertNotNull(loginService.login(account));
	}
	
	@Test
	public void testLoginWithWrongCredential() throws Exception{
		
		
		loginService.setMemberDao(memberDao);
		//when(memberDao.getMember(any(Account.class))).thenReturn(value)
		 when(memberDao.checkAccountExist(any(Account.class))).thenReturn(false);
		 Account account=new Account();
		 assertNull(loginService.login(account));
	}
	
	
}
