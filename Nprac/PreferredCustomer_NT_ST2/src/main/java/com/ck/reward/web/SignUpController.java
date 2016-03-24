package com.ck.reward.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.exception.ConstraintViolationException;
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
import org.springframework.web.bind.annotation.RequestParam;

import com.ck.reward.entities.Country;
import com.ck.reward.entities.Income;
import com.ck.reward.entities.Member;
import com.ck.reward.entities.State;
import com.ck.reward.entities.Store;
import com.ck.reward.entities.StoreEmail;
import com.ck.reward.exception.RegistrationException;
import com.ck.reward.service.MemberService;
import com.ck.reward.service.RegistrationService;
import com.ck.reward.service.StoreService;

/**
 * 
 * @author Bootcamp User 03 UI Controller for signing up new member.
 */

@Controller
@RequestMapping("signup")
public class SignUpController {

	@Autowired
	StoreService storeService;
	@Autowired
	MemberService memberService;
	@Autowired
	RegistrationService registrationService;
	
	private static final Logger logger=LogManager.getLogger(SignUpController.class);
	

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor stringtrimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, stringtrimmer);
	}
	

	/**
	 * 
	 *  Renders registration form
	 */
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String getSignUpForm(Model model, @ModelAttribute("memberDetails") Member member, HttpSession session)
								throws Exception {
		logger.info("getting signup page");
		
		if (session.getAttribute("logged") != null) {
			return "redirect:/page/main";
		}
		
		loadDefaults(model);

		model.addAttribute("page", "pages/signup.jsp");

		return "index";
		
	}
	

	/**
	 *   Process sign up form submission. 
	 *   Delegate to {@link RegistrationService} to complete the registration.
	 *   Redirects the new member to the login page on successful sign-up.
	 */

	@RequestMapping(value = "/do", method = RequestMethod.POST)
	public String registerMember(@ModelAttribute("memberDetails") @Valid Member member, BindingResult bindingResult,
			Model model) throws Exception {
		
		logger.info("processing signup details");
		
		if (!bindingResult.hasErrors()) {

			try {
				
				if (registrationService.register(member)) {
					return "redirect:/login/form";
					
				} else {
					//bindingResult.rejectValue("failure.messages", "error.message", "Try again");

				}
				
			} catch (RegistrationException e) {

				bindingResult.rejectValue("account.username", "error.account", "Username Exists!");

				e.printStackTrace();
			} catch (ConstraintViolationException c) {

				//bindingResult.rejectValue("failure.messages", "error.message", "Try again");

				c.printStackTrace();

			}
			
		}
		
		loadDefaults(model);
		model.addAttribute("page", "pages/signup.jsp");

		return "index";
	}
	

	/**
	 * 
	 * Gets Store list to be populated in the drop down. 
	 * Delegate to {@link StoreService} to retrieve the store list.
	 */
	@RequestMapping(value = "/getStoreList", method = RequestMethod.GET)
	public String getStoreList(Model model, @RequestParam(value = "store_state") int stateId,
			@RequestParam(value = "store_country") int countryId) {
		
		logger.info("getting store list");
		
		List<Store> stores;
		
		try {
			
			stores = storeService.getStores(countryId, stateId);
			model.addAttribute("stores", stores);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "pages/views/stores";

	}
	

	/**
	 * Gets state list to be populated in the drop down. 
	 * Delegates to {@link StoreService} to retrieve the state list.
	 * 
	 */
	@RequestMapping(value = "/getStateList", method = RequestMethod.GET)
	public String getStateList(Model model, @RequestParam(value = "country") int countryId) {

		logger.info("getting statelist");
		
		List<State> states;
		
		try {
			
			states = storeService.getStates(countryId);			
			model.addAttribute("states", states);
			
		} catch (Exception e) {			
			e.printStackTrace();
		}

		return "pages/views/statelist";

	}

	/**
	 * Loads countries,store email and income range list for sign up form.
	 *  Delegates to {@link StoreService} to retrieve the country and store email list. 
	 *  Delegates to {@link MemberService} to retrieve various income range list.
	 */
	public void loadDefaults(Model model) throws Exception {
		
		logger.info("loading countries,store emails ,genders and income range");
		
		List<Country> countries = storeService.getCountries();
		List<StoreEmail> emails = storeService.getEmails();
		List<Income> incomeRanges = memberService.getIncomeRange();
		Map<String, String> genderTypes = memberService.getAvailableGender();
		
		model.addAttribute("genderTypes", genderTypes);
		model.addAttribute("countries", countries);
		model.addAttribute("emails", emails);
		model.addAttribute("incomeRanges", incomeRanges);
		
	}
	

}
