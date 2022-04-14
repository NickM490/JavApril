package com.codingdojo.fullcrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	
	
	// Route to show all candies
	// Needs: Model model, 
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard.jsp";
	}

	// Routes to Make a Candy
	
	// Render the new Candy Form
	@GetMapping("/newCandy")
	public String newCandyForm() {
		return "newCandy.jsp";
	}
	
	// Process the Post to create Candy
	
	
	// Route to show One Candy
	@GetMapping("/oneCandy")
	public String oneCandy() {
		return "oneCandy.jsp";
	}
	
	// Route to Delete a Candy
	@GetMapping("/delete{id}")
	public String delete() {
		return "redirect:/dashboard";
	}
	
	
	
	// Routes to Update a Candy
	
	// Render the update Candy Form
	// DONT FORGET TO  ADD ID
	
	@GetMapping("/updateCandy")
	public String updateCandyForm() {
		return "updateCandy.jsp";
	}
	
	// Process the Post to update Candy
	
	
	
	
}
