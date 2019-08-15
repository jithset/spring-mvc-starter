package com.jitihn.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloFormController {

	@RequestMapping("/showForm")
	public String displayForm() {
		return "hello-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "hellouser";
	}
	
	@RequestMapping("/processform2")
	public String processForm2(@RequestParam("username") String username, HttpServletRequest request, Model model) {
		username = username.toUpperCase();
		String msg = "Yo Another ! "+ username;
		
		model.addAttribute("message", msg);
		return "hellouser";
	}
}
