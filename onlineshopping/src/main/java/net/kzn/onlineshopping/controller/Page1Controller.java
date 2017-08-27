package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Page1Controller {

	@RequestMapping(value = {"/home1", "/index1" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page1");
		mv.addObject("greeting", "Welcome to page1 controller!");
		return mv;

	}

//	@RequestMapping(value ="/custom")
//	public ModelAndView showCustomMessage(@RequestParam(value="param1", required=false)String paramValue,
//			@RequestParam(value="param2", required=false)String paramValue2) {
//		if(paramValue == null){
//			paramValue = "No value specified ...";
//		}
//		ModelAndView mv = new ModelAndView("page3");
//		mv.addObject("cMsg", paramValue+paramValue2);
//		return mv;
//	}
//	
//	@RequestMapping(value ="/pvar/{param}")
//	public ModelAndView showPathMessage(@PathVariable("param") String paramValue) {
//		if(paramValue == null){
//			paramValue = "No value specified ...";
//		}
//		ModelAndView mv = new ModelAndView("page3");
//		mv.addObject("cMsg", paramValue);
//		return mv;
//	}

}
