package com.okayjava.html.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.okayjava.html.model.Volunteer;

import com.okayjava.html.Repository;

@Controller
public class LoginController_volunteer {
    Repository r = new Repository();
	Connection c = r.getConnection();

    //String insert_kid = "INSERT INTO public.KID(id, name, age, gender, family_background, ambition) VALUES (?, ?, ?, ?, ?, ?)";
	String insert_volunteer = "INSERT INTO public.VOLUNTEER(id, name, age, gender, interest, major, username, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

	@GetMapping("/login/volunteer")
	public String login() {

		return "volunteer_registration";
	}

	@GetMapping("/volunteer/registration")
	public String userRegistration() {
        return "success";
    }   
}
