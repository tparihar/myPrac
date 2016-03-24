package com.calvinklein.rewards.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calvinklein.rewards.dao.MemberDao;
import com.calvinklein.rewards.model.Address;
import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.model.User;
import com.calvinklein.rewards.service.DataHandler;

/**
 * This servlet process the data entered by user and and forwards the request to
 * corresponding service class.
 */
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * String country = request.getParameter("country"); String state =
		 * request.getParameter("state");
		 */
		String storeId = request.getParameter("homestore");
		String username = request.getParameter("email");
		String password = request.getParameter("password");
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String memcountry = request.getParameter("country1");
		String memState = request.getParameter("state1");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		String city = request.getParameter("city");
		String zip = (request.getParameter("zip"));
		String emailid = request.getParameter("emailid");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String maritalStatus = request.getParameter("mstatus");
		String DOB = request.getParameter("dob");
		String houseHoldIncome = request.getParameter("income");

		DataHandler dataHandler = new DataHandler();
		int membershipNumber = dataHandler.memshipNumberGenerator();

		Address adr = new Address();
		adr.setAddress1(addr1);
		adr.setAddress2(addr2);
		adr.setCity(city);
		adr.setZip(zip);
		adr.setState(memState);
		adr.setCountry(memcountry);

		User user = new User();
		user.setEmail(username.trim());
		user.setPassword(password.trim());

		Member member = new Member();
		member.setAdr(adr);
		member.setMld(user);
		member.setFirstName(firstName);
		member.setLastName(lastName);
		member.setDOB(DOB);
		member.setMaritalStatus(maritalStatus);
		member.setGender(gender);
		member.setMemshipNumber(membershipNumber);
		member.setEmailID(emailid);
		member.setIncome(houseHoldIncome);
		member.setStoreId(storeId);
		member.setPhone(phone);

		MemberDao memDao = new MemberDao();

		int memberId = 0;
		try {
			memberId = memDao.registerLoginDetails(member);
			dataHandler.registerMember(member, memberId);
		} catch (Exception e) {
			request.setAttribute("invalid", "Email ID already taken / Invalid email");
			RequestDispatcher rd = request.getRequestDispatcher("join.jsp");
			rd.forward(request, response);
		}

		RequestDispatcher rd = request.getRequestDispatcher("registrationSuccess.jsp");
		rd.forward(request, response);
	}

}
