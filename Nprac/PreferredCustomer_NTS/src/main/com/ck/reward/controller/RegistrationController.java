package com.ck.reward.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ck.reward.entities.Account;
import com.ck.reward.entities.Address;
import com.ck.reward.entities.Member;
import com.ck.reward.entities.Profile;
import com.ck.reward.entities.Store;
import com.ck.reward.exception.RegistrationException;
import com.ck.reward.service.RegistrationService;

/**
 * 
 * @author Bootcamp User 03
 *  Controller handles registration request
 */
public class RegistrationController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	RegistrationService registrationHandler;

	public RegistrationController() {
		super();
		registrationHandler = new RegistrationService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		HttpSession sessionObj=req.getSession(false);
		
		if(sessionObj.getAttribute("loggedIn")!=null && sessionObj.getAttribute("loggedIn").equals("true")){
			
			resp.sendRedirect(req.getContextPath() + "/jsp/account.jsp");
		}else{
		req.getRequestDispatcher("jsp/signup.jsp").forward(req, resp);
		}
		
	}

	/**
	 * Receives registration details and calls registration service to register.
	 * In case of successful registration user is directed to login page else it
	 * is redirected to sign up page.
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		

		// New account details
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		// Store details
		String storeCountryId = request.getParameter("store_country");
		String storeId = request.getParameter("store_address");
		String storeStateId = request.getParameter("store_state");

		// New member Details
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		String maritalStatus = request.getParameter("martial_status");
		String birthMonth = request.getParameter("birth_month");
		String birthDay = request.getParameter("birth_day");
		String income = request.getParameter("income_range");
		String phone = request.getParameter("phone");

		String[] emailPreference = request.getParameterValues("emailpref");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String city = request.getParameter("city");
		String memberCountryId = request.getParameter("member_country");
		String memberStateId = request.getParameter("member_state");
		String zip = request.getParameter("zip");

		Account account = new Account();
		account.setUserId(username);
		account.setPassword(password);

		Store store = new Store();
		store.setId(storeId);
		store.setStateId(storeStateId);
		store.setCountryId(storeCountryId);

		Address address = new Address();
		address.setAddress1(address1);
		address.setAddress2(address2);
		address.setCity(city);
		address.setZip(zip);
		address.setStateId(memberStateId);
		address.setCountryId(memberCountryId);

		Profile profile = new Profile();
		profile.setGender(gender);
		profile.setMaritalStatus(maritalStatus);
		profile.setBirthDay(birthDay);
		profile.setBirthMonth(birthMonth);
		profile.setIncomeRange(income);
		profile.setPhone(phone);
		profile.setEmailPreferences(emailPreference);

		Member member = new Member();
		member.setFirstName(firstName);
		member.setLastName(lastName);
		member.setPhone(phone);
		member.setEmail(email);
		member.setAddress(address);
		member.setProfile(profile);
		member.setStore(store);

		try {
			if (registrationHandler.register(account, member)) {

				response.sendRedirect("login");
			} else {
				request.setAttribute("username_message", "please try again");
				request.getRequestDispatcher("/jsp/signup.jsp").forward(request, response);

			}
		} catch (RegistrationException e) {

			System.out.println(e.getMessage());
			request.setAttribute("username_message", "please choose another username");
			request.getRequestDispatcher("/jsp/signup.jsp").forward(request, response);

		}

	}

}
