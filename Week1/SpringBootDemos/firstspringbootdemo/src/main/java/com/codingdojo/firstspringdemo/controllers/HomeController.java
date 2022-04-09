package com.codingdojo.firstspringdemo.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(String name) {
		
		return "index.jsp";
	}
//	
//	@app.route("/")
//	def index():
//		
//		allUsers = User.get_all_users()
//		return render_template("index.html", thisThing = thisThing)
	
	
	@RequestMapping("/witcher")
	public String witcher(Model model) {
		
		String name = "Geralt";
		String name2 = "Yennifer";
		
		model.addAttribute("name", name2);
		
//		model.addAttribute("allUsers", userService.findAllUsers());
		
		return "witcher.jsp";
	}
	
	
}
