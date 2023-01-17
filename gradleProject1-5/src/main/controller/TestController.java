package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;


@Controller
public class TestController {

	@RequestMapping("/test1")
	public String test1(Model model) {
		
		model.addAttribute("testMsg", "Thymeleaf Test . ");
		
		return "test1";            
	}  
	
	
} 

