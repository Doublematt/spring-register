package com.dm.springRegister.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("user", new User());
		
		return "register-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("user") User user) {
		
		return "register-confirmation";
	}

}
