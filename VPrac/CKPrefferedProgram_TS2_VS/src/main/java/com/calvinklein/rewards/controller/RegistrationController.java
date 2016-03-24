package com.calvinklein.rewards.controller;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.commons.collections.iterators.EntrySetMapIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.calvinklein.rewards.model.Member;
import com.calvinklein.rewards.service.DataHandler;
import com.calvinklein.rewards.service.StoreService;
import com.google.gson.Gson;

/**
 * This class accepts the incoming URL and forwards them to respective pages or
 * service classes
 * 
 * @author Boot Camp User 011
 *
 */
@Controller
public class RegistrationController {

	@Autowired
	DataHandler dataHandler;

	@Autowired
	StoreService storeService;

	/**
	 * This method forwards the GET request to the join page page with
	 * countryList attribute
	 * 
	 * @param Model
	 * @return
	 */
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String showLoginPage(Model model) {

		HashMap<String, String> countries = storeService.processCountries();
		model.addAttribute("countries", countries);
		return "join";
	}

	/**
	 * This method forwards the POST request to Service class attribute
	 * 
	 * @param Model
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerMember(@ModelAttribute("member") Member member, Model model) {

		boolean isSuccess = dataHandler.registerMember(member);
		if (isSuccess) {
			return "registrationSuccess";
		} else {
			model.addAttribute("message", "Invalid entry, Try Again");
			return "join";
		}
	}

	/**
	 * This method responds to the Ajax call and forwards request to join page
	 * with stateList
	 * 
	 * @param Model
	 * @return
	 */
	@RequestMapping("stateList")
	@ResponseBody
	public String fetchStates(@ModelAttribute(value = "country") String countryId) {

		HashMap<String, String> states = storeService.processStates(countryId);
		String states1 = new Gson().toJson(states);
		return states1;
	}

	/**
	 * This method responds to the Ajax call and forwards request to join page
	 * with storeList
	 * 
	 * @param Model
	 * @return
	 */
	@RequestMapping("storeList")
	@ResponseBody
	public String fetchStores(@ModelAttribute(value = "state") String stateId) {

		HashMap<String, String> stores = storeService.processStores(stateId);
		String stores1 = new Gson().toJson(stores);
		return stores1;
	}

	/**
	 * This method responds to the Ajax call and forwards request to join page
	 * with boolean value for emailID
	 * 
	 * @param Model
	 * @return
	 */
	@RequestMapping("/email")
	@ResponseBody
	public String processEmail(@ModelAttribute(value = "email") String email) {

		boolean isValid1 = dataHandler.validateEmail(email);
		String isValid = new Gson().toJson(isValid1);
		return isValid;
	}

}
