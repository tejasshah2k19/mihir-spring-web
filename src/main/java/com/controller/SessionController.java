package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.AddBean;

 

@Controller
public class SessionController {

	@GetMapping("/login")
	public String loginView() {
		//
		return "Login";
	}
	
	
	@GetMapping("/inputnum")
	public String inputNum() {
		return "InputNum";
	}

	@PostMapping("/add")
	public String add(@Valid AddBean addBean, BindingResult result) {
		System.out.println(result.hasErrors());
		if (result.hasErrors() == true ) {
			return "InputNum";
		} else {
			return "PrintAns";
		}
	}
}
