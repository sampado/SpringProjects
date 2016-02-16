package com.sampa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	private static final String WELCOME_VIEW = "welcome";

	@RequestMapping("/welcome")
	public ModelAndView viewWelcome(Model model) {
		final String message = "<b>Welcome to my first web application! :)<b>";
		return new ModelAndView(WELCOME_VIEW, "message", message);
	}

}
