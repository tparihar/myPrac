/**
 * 
 */
package com.bootcamp.webservices.login1;



import com.calvinklein.rewards.service.Ckrewards;
import com.calvinklein.rewards.service.Login;
import com.calvinklein.rewards.service.Member;
import com.calvinklein.rewards.service.User;

/**
 * @author Boot Camp User 011
 *
 */
public class loginservicetest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ckrewards ck = new Ckrewards();
		Login login = ck.getLoginPort();
		User u = new User();
		u.setEmail("weblogic");
		u.setPassword("weblogic4");
		boolean status = login.validateUser(u);
		
		System.out.println(status);

	}

}
