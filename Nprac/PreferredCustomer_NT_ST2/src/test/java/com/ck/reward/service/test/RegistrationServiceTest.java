package com.ck.reward.service.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.spy;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ck.reward.dao.MemberDao;
import com.ck.reward.entities.Account;
import com.ck.reward.entities.Member;
import com.ck.reward.exception.RegistrationException;
import com.ck.reward.service.RegistrationService;


@RunWith(MockitoJUnitRunner.class)
public class RegistrationServiceTest {
	
	@Mock 
	private MemberDao memberDao;
	
	private RegistrationService registrationService;
	
	Member member=new Member();
	Account account= new Account();
	
	
	public RegistrationServiceTest(){
		member.setAccount(account);
	}
	
	@After
	public void resetData(){
		
		member.getAccount().setUsername("");
	}
	
	@Test(expected = RegistrationException.class)
	public void testRegisterWithExistingUsername() throws Exception{
		
		//given
		registrationService = spy(new RegistrationService());
		doReturn(true).when(registrationService).checkUsernameExist(anyString());
		member.getAccount().setUsername("john");
		
	
		//when		
		registrationService.setMemberDao(memberDao);
		
		
		//when
		 registrationService.register(member);
	}
	
	
	@Test
	public void testRegisterWithNewUsername() throws Exception{
		
		//given
		registrationService = spy(new RegistrationService());	
		doReturn(false).when(registrationService).checkUsernameExist(anyString());
		doNothing().when(memberDao).save(any(Member.class));
		
		//when(memberDao.findUserId(any(String.class))).thenReturn(false);
		member.getAccount().setUsername("john1");
		
		//when
		registrationService.setMemberDao(memberDao);		
		 
		 //when 
		//then
		 assertTrue(registrationService.register(member));
		 
		
	}

	

}
