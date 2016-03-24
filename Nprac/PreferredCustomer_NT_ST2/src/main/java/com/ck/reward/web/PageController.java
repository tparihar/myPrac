package com.ck.reward.web;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ck.reward.entities.Account;
import com.ck.reward.entities.Member;


/**
 * @author Bootcamp User 03 
 * UI controller that renders various page on the site.
 */
@Controller
@RequestMapping("page")
public class PageController {
	

	private static final Logger logger=LogManager.getLogger(PageController.class);
	
	/**
	 * Renders getstarted page.
	 */
	@RequestMapping(value = "/getstarted", method = RequestMethod.GET)
	public String getStartPage(@ModelAttribute("loginDetail") Account account, Model model) {
		
		logger.info("getting getstarted page");
		
		model.addAttribute("page", "pages/getstarted.jsp");
		return "index";
		
	}
	
	
	/**
	 * Renders about page.
	 */
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String getAboutPage(@ModelAttribute("loginDetail") Account account, Model model) {
		
		logger.info("getting about page");
		
		model.addAttribute("page", "pages/about.jsp");
		return "index";
		
	}
	
	
	/**
	 * Renders main page if user is logged in else redirects to login page.
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String getUserPage(Model model, HttpSession session) {
		
		logger.info("getting main page");
		
		if (session.getAttribute("logged") != null && session.getAttribute("logged").equals("true")) {			
			
			Member member = (Member) session.getAttribute("member");
			model.addAttribute("member", member);			
			model.addAttribute("page", "pages/main.jsp");	
			
		} else {			
			return "redirect:/login/form";			
		}
		

		return "index";

	}

	
	/** 
	 * Performs logout process. Removes session Redirects to getstarted page.
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(@ModelAttribute("loginDetail") Account account, Model model, HttpSession session) {
		
		logger.info("loggin out and gettign getstarted page");
		
		session.invalidate();
		return "redirect:/page/getstarted";

	}

	
}
