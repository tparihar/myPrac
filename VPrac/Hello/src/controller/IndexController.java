package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("name");
		Map<String, String> map = new HashMap<String, String>();
		map.put("message", "hello " + name);

		ModelAndView mav = new ModelAndView("Success");
		mav.addObject("message", "hello " + name);
		return mav;
	}

}