package com.indexial;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ValidationController {
	static {
		System.out.println("Controller Loaded");
	}

	@RequestMapping(value = "go", method = RequestMethod.GET)
	public String go(Model m) {
		m.addAttribute("user", new User());
		return "login";
	}
	/*
	 * @RequestMapping(value = "/login" ,method = RequestMethod.POST) public String
	 * checkValidation(Model m , @ModelAttribute("user") User u) { User user = new
	 * User(); m.addAttribute("user",user);
	 * 
	 * return "display"; }
	 */
	/*
	 * @RequestMapping(value = "signin/{userName}/{password}", method =
	 * RequestMethod.GET) public ModelAndView
	 * checkValidation(@PathVariable("userName") String
	 * userName,@PathVariable("password") String password ) {
	 * System.out.println(userName); System.out.println(password); HashMap<String,
	 * Object> hm = new HashMap<String, Object>(); hm.put("user", new User());
	 * 
	 * 
	 * return new ModelAndView("display", hm);
	 * 
	 * }
	 */

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public ModelAndView checkValidation(@RequestParam("u") String userName, @RequestParam("p") String password) {
		System.out.println(userName);

		System.out.println(password);
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("user", new User());

		return new ModelAndView("display", hm);

	}
}
