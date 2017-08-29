package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}

	// @RequestMapping(value ="/custom")
	// public ModelAndView showCustomMessage(@RequestParam(value="param1",
	// required=false)String paramValue,
	// @RequestParam(value="param2", required=false)String paramValue2) {
	// if(paramValue == null){
	// paramValue = "No value specified ...";
	// }
	// ModelAndView mv = new ModelAndView("page3");
	// mv.addObject("cMsg", paramValue+paramValue2);
	// return mv;
	// }
	//
	// @RequestMapping(value ="/pvar/{param}")
	// public ModelAndView showPathMessage(@PathVariable("param") String
	// paramValue) {
	// if(paramValue == null){
	// paramValue = "No value specified ...";
	// }
	// ModelAndView mv = new ModelAndView("page3");
	// mv.addObject("cMsg", paramValue);
	// return mv;
	// }

}
