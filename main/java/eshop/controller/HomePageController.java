package eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

	// Default request mapping
	@RequestMapping
	public String sveikiAtvyke(Model model) {
		// Į modelį dedamas atributas ir jo reikšmė
		model.addAttribute("message", "Welcome to Low Swallow nest ");
		model.addAttribute("message1", ":)");
		return "hello";
	}

//	@RequestMapping("/welcome")
//	public ModelAndView allProducts() {
//		// Inkapsuliuotas modelis
//		ModelAndView modelAndView = new ModelAndView();
//
//		modelAndView.addObject("pasisveikinimas", "Kitoks pasisveikinimas");
//		modelAndView.addObject("sloganas", "Inkapsuliuotas sloganas");
//		modelAndView.setViewName("SveikiAtvyke");
//		return modelAndView;
//	}

}
