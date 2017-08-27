package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Page2Controller {

	@RequestMapping(value = {"/","/home2","/index2"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page2");
		mv.addObject("greeting", "Welcome to page2 controller!");
		return mv;
	}
	
}
