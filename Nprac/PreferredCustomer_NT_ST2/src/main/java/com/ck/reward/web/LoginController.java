package com.ck.reward.web;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ck.reward.entities.Account;
import com.ck.reward.entities.Member;
import com.ck.reward.service.LoginService;
import com.ck.reward.service.LoginServiceImpl;

/**
 * @author Bootcamp User 03 
 * UI Controller that renders the login-form.
 */
@Controller
@RequestMapping("login")
public class LoginController {
	
	private static final Logger logger=LogManager.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;
	


	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		StringTrimmerEditor stringtrimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, stringtrimmer);
	}
	

	/**
	 * Renders login form
	 */
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String geLoginPage(@ModelAttribute("loginDetail") Account account, Model model) {
		logger.info("getting login page");
		model.addAttribute("page", "pages/login.jsp");
		return "index";
	}

	
	/**
	 * Process login form.
	 * Delegates to ${link {@link LoginServiceImpl} to complete the login process. 
	 * Redirects to main page on successful login.
	 */
	@RequestMapping(value = "/do", method = RequestMethod.POST)
	public String login(@ModelAttribute("loginDetail") @Valid Account account, BindingResult bindingResult, Model model,
					    HttpSession session) throws Exception {
		logger.info("receiving signup form details");
		if (!bindingResult.hasErrors()) {

			Member member = loginService.login(account);
			if (member != null) {
				session.setAttribute("logged", "true");
				session.setAttribute("member", member);
				return "redirect:/page/main";
			}

			bindingResult.rejectValue("username", "account.error", "Please try again");
			bindingResult.rejectValue("password", "account.error", "Please try again");
		}
		
		model.addAttribute("page", "pages/login.jsp");
		
		return "index";
	}
	

	
}
