package com.okayjava.html.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.okayjava.html.model.Kids;

@Controller
public class LoginController_kids {

	@GetMapping("/login/kids")
	public String login() {

		return "login";
	}

	@GetMapping("/kids/registration")
	public String userRegistration() {
		return "success";
	}   
}
