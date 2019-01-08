/*
 * Developed by Kamal
 * Controller class 
 * All incoming rest request
 */

package com.journaldev.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.journaldev.spring.model.User;
import com.journaldev.spring.model.UserDetails;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();

		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);
		DateFormat dateFormat1 = DateFormat.getDateInstance();
		System.out.println("Home Page Requested, locale = "
				+ dateFormat1.format(date));
		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate + " Customize Date: "
				+ dateFormat1.format(date));

		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		return "user";
	}

	@ModelAttribute
	public void addMethodMsg(Model mv) {
		mv.addAttribute("message", "Welcome to FullStack Developer World...!");
	}

	@RequestMapping(value = "/userDetail", method = RequestMethod.POST)
	public ModelAndView userDetail(
			@ModelAttribute("userlogin") UserDetails userlogin) {
		ModelAndView mv = new ModelAndView("userDescription");
		return mv;
	}

	@RequestMapping(value = "/userDetailShow", method = RequestMethod.POST)
	public ModelAndView userDetailShow(
			@ModelAttribute("userDetail") UserDetails userDetail,
			BindingResult result) {
		ModelAndView mv;
		if (result.hasErrors()) {
			mv = new ModelAndView("userDescription");
			List<FieldError> errorMsg = result.getFieldErrors();
			mv.addObject("errormsg", errorMsg.get(0).getDefaultMessage()
					.substring(0, 114));

		} else
			mv = new ModelAndView("userDetailShow");
		return mv;
	}

}
