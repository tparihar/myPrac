package com.calvinklein.rewards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.calvinklein.rewards.model.Member;

@Controller
public class RegistrationController {

	@RequestMapping("/join")
	public ModelAndView registerMember(@ModelAttribute("member") Member member) {

		ModelAndView mav = new ModelAndView("vishal");

		return mav;
	}
}
