package VVA.demo;

//File imports
import VVA.demo.Repository;

//Spring boot imports
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

public class DemoApplication {
	//Initializing the connections
	Repository r = new Repository();
	Connection c = r.getConnection();

	//Prepared statements to access the database
	String insert_kid = "INSERT INTO public.KID(id, name, age, gender, family_background, ambition) VALUES (?, ?, ?, ?, ?, ?)";
	String insert_volunteer = "INSERT INTO public.VOLUNTEER(id, name, age, gender, interest, major, username, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/home")
	public String home(){
		//Render the login page html here
		return "Hello World!"; // This is just a place holder. Remove when the html pages are ready
	} 

	@PostMapping("/submit")
	public void create_user(){
		/*
		 * NOTE: This is a rough sketch, the order will have to be changed
		 * we might not do both inserting the kid and the volunteer at the same time
		 */
		try{
			PreparedStatement kid_statement = c.prepareStatement(insert_kid); //inserting the kid
			PreparedStatement volunteer_statement = c.prepareStatement(insert_volunteer); // inserting the volunteer

			//setting the params of the insert kid query 
			kid_statement.setString(2, ""); //name
			kid_statement.setInt(3, 4); //set the age, 4 is just a placeholder
			kid_statement.setString(4, ""); //gender
			kid_statement.setString(5, ""); //family background 
			kid_statement.setString(6, ""); //ambition

			//setting the params of the insert volunteer query 
			volunteer_statement.setString(2, ""); //name
			volunteer_statement.setInt(3, 4); //set the age, 4 is just a placeholder
			volunteer_statement.setString(4, ""); //gender
			volunteer_statement.setString(5, ""); //interest  
			volunteer_statement.setString(6, ""); //major
			volunteer_statement.setString(7, ""); //username
			volunteer_statement.setString(8, ""); //password
		}
		catch(SQLException e){}
		
	}


}
