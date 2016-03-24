package com.calvinklein.rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.model.User;
import com.calvinklein.rewards.service.Login;

/**
 * This class accepts the incoming URL and forwards them to respective page or
 * service layer
 * 
 * @author Boot Camp User 011
 *
 */
@Controller
public class LoginController {

	@Autowired
	private Login login;

	/**
	 * This method forwards the GET request to the login page
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "login";
	}

	/**
	 * This method forwards the POST request to the Service layer
	 * 
	 * @param User
	 * @return
	 */
	@RequestMapping(value = "/processlogin", method = RequestMethod.POST)
	public String validateLogin(@ModelAttribute("user") User user, Model model) {

		int memberId = login.validateUser(user);
		if (memberId != 0) {
			Member member = login.getMemberDetails(memberId);
			model.addAttribute("member", member);
			return "loginSuccess";
		} else {
			model.addAttribute("message", "Invalid UserName or Password");
			return "login";
		}
	}

}
