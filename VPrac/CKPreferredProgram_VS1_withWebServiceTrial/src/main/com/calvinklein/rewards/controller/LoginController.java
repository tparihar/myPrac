package com.calvinklein.rewards.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calvinklein.rewards.dao.LoginDao;
import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.model.User;
import com.calvinklein.rewards.service.Login;

/**
 * This servlet process the data entered by user and forwards the request to
 * corresponding service class.
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = new User();
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));

		Login login = new Login();
		boolean loginStatus = login.validateUser(user);
		LoginDao lDao = new LoginDao();
		User user1 = null;

		user1 = lDao.getLoginInfo(request.getParameter("email"));
		if (loginStatus) {
			Member member = login.getMemberDetails(Integer.parseInt(user1.getMemberId()));
			request.setAttribute("member", member);
			RequestDispatcher rd = request.getRequestDispatcher("loginSuccess.jsp");
			rd.forward(request, response);

		} else {
			request.setAttribute("failed", "Invalid UserName or Password");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

}
