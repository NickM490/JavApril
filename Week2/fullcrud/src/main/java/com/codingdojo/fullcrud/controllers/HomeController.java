package com.codingdojo.fullcrud.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.fullcrud.models.Candy;
import com.codingdojo.fullcrud.models.LoginUser;
import com.codingdojo.fullcrud.models.Owner;
import com.codingdojo.fullcrud.models.User;
import com.codingdojo.fullcrud.services.CandyService;
import com.codingdojo.fullcrud.services.OwnerService;
import com.codingdojo.fullcrud.services.UserService;

@Controller
public class HomeController {

	// Injecting out CandyService
	private final CandyService candyServ;
	private final OwnerService ownerServ;
	private final UserService userServ;

	public HomeController(CandyService candyServ, OwnerService ownerServ, UserService userServ) {
		super();
		this.candyServ = candyServ;
		this.ownerServ = ownerServ;
		this.userServ = userServ;
	}

	@GetMapping("/")
	public String index(Model model) {

		// Bind empty User and LoginUser objects to the JSP
		// to capture the form input
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser,
			BindingResult result, Model model, HttpSession session) {

		// TO-DO Later -- call a register method in the service
		// to do some extra validations and create a new user!

		userServ.register(newUser, result);

		if (result.hasErrors()) {
			// Be sure to send in the empty LoginUser before
			// re-rendering the page.
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}

		// No errors!
		// TO-DO Later: Store their ID from the DB in session,
		// in other words, log them in.
		session.setAttribute("user_id", newUser.getId());
		return "redirect:/dashboard";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
			BindingResult result, Model model, HttpSession session) {

		// Add once service is implemented:
		// User user = userServ.login(newLogin, result);
		User user = userServ.login(newLogin, result);
		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}

		// No errors!
		// TO-DO Later: Store their ID from the DB in session,
		// in other words, log them in.
		session.setAttribute("user_id", user.getId());
		return "redirect:/dashboard";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	// Route to show all candies
	// Needs: Model model
	/*****************************************************
	 *************** DASHBOARD *********************
	 ******************************************************
	 **/
	@GetMapping("/dashboard")
	public String dashboard(Model model) {

		// Send our Candies to the JSP using Model model
		model.addAttribute("allCands", candyServ.allCandys());

		return "dashboard.jsp";
	}

	// Routes to Make a Candy

	// Render the new Candy Form
	@GetMapping("/newCandy")
	public String newCandyForm(@ModelAttribute("candy") Candy candy, Model model) {

		model.addAttribute("allOwners", ownerServ.allOwners());
		return "newCandy.jsp";
	}

	// Route to Render Owner Form
	@GetMapping("/newOwner")
	public String newOwnerForm(@ModelAttribute("owner") Owner owner) {
		return "newOwner.jsp";
	}

	// Process the Post to create Candy
	@PostMapping("/processCandy")
	public String postingCandy(@Valid @ModelAttribute("candy") Candy candy, BindingResult result, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("allOwners", ownerServ.allOwners());
			return "newCandy.jsp";

		} else {

			candyServ.createCandy(candy);
			return "redirect:/dashboard";
		}

	}

	// Process The Post to create Owner
	@PostMapping("/processOwner")
	public String postingOwner(@Valid @ModelAttribute("owner") Owner owner, BindingResult result) {
		if (result.hasErrors()) {
			return "newOwner.jsp";
		} else {
			ownerServ.createOwner(owner);
			return "redirect:/dashboard";
		}
	}

	// Route to show One Candy
	@GetMapping("/oneCandy/{id}")
	public String oneCandy(@PathVariable("id") Long id, Model model) {

		model.addAttribute("candy", candyServ.findCandy(id));

		return "oneCandy.jsp";
	}

	// Route to Delete a Candy
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {

		candyServ.candyMan(id);

		return "redirect:/dashboard";
	}

	// Routes to Update a Candy

	// Render the update Candy Form
	// DONT FORGET TO ADD ID

	@GetMapping("/updateCandy/{id}")
	public String updateCandyForm(@PathVariable("id") Long id, @ModelAttribute("candy") Candy candy, Model model) {

		model.addAttribute("candy", candyServ.findCandy(id));

		return "updateCandy.jsp";
	}

	// Process the Post to update Candy
	@RequestMapping(value = "/updatingCandy/{id}", method = RequestMethod.PUT)
	public String updatingCandy(@Valid @ModelAttribute("candy") Candy candy, BindingResult result) {

		if (result.hasErrors()) {
			return "updateCandy.jsp";

		} else {

			candyServ.updateCandy(candy);
			return "redirect:/dashboard";

		}

	}

}
