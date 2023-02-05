package com.okayjava.html;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//SQL imports
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
@RestController
public class SpringbootHtmlApplication {

	//Initializing the connections
	

	//Prepared statements to access the database
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHtmlApplication.class, args);
	}

}