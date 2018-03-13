package com.dw.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/blog")
@Controller
public class BlogController {
	
	@GetMapping()
	public String blog(){
		return "blog/index/main";	
	}
}
