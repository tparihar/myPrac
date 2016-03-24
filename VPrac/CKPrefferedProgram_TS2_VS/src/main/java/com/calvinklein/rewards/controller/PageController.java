package com.calvinklein.rewards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This class accepts the incoming URL and forwards them to respective pages
 * 
 * @author Boot Camp User 011
 *
 */
@Controller
public class PageController {

	/**
	 * This method forwards the GET request to the about page
	 * 
	 * @param User
	 * @return
	 */
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String showAboutPage() {
		return "about";
	}

	/**
	 * This method forwards the GET request to the get Started page
	 * 
	 * @param User
	 * @return
	 */
	@RequestMapping(value = "/getStarted", method = RequestMethod.GET)
	public String showGetStartedPage() {
		return "getStarted";
	}
}
