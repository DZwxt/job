package com.dw.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	
	@GetMapping("/")
	public String index(Model model){
		model.addAttribute("host", "wxt");
		return "index";
	}
	
	@GetMapping("/login")
	public String showLogin(Model model,String returnUrl){
		System.out.println(returnUrl);
		model.addAttribute("returnUrl", returnUrl);
		return "login";
	}
	
	@PostMapping(value="/user/login")
	public void login(){
		
	}
}
