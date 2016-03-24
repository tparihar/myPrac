package com.ck.reward.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ck.reward.entities.Account;
import com.ck.reward.entities.Member;
import com.ck.reward.service.LoginService;
import com.ck.reward.service.MemberService;

/**
 * 
 * @author Bootcamp User 03 
 * This controller handles login functionality
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginService loginHandler;
	MemberService memberInfoHandler;

	public LoginController() {

		loginHandler = new LoginService();
		memberInfoHandler = new MemberService();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sessionObj=request.getSession(false);
		
		if(sessionObj.getAttribute("loggedIn")!=null && sessionObj.getAttribute("loggedIn").equals("true")){
			
			response.sendRedirect(request.getContextPath() + "/jsp/account.jsp");
		}else{
		
		request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
		}

	}

	/**
	 * It takes user credentials and calls login and creates session if user
	 * successfully logins and redirects to account page or else redirects to
	 * login page.
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		Account account = new Account();
		account.setUserId(username);
		account.setPassword(password);

		try {
			if (!loginHandler.login(account)) {
				request.setAttribute("message", "Please try again");
				request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
			} else {
				HttpSession session = request.getSession(true);
				session.setAttribute("loggedIn", "true");
              System.out.println("account id:"+account.getId());
              
				Member member = memberInfoHandler.getMemberDetail(account.getId());
				System.out.println("memberinof"+member.getId());
				session.setAttribute("member", member);
				response.sendRedirect(request.getContextPath() + "/jsp/account.jsp");
			}
		} catch (Exception e) {

			e.printStackTrace();
			request.setAttribute("message", "Please try again later");
			request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
		}

	}

}
