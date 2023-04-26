package com.hassen.exam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hassen.exam.models.LoginUser;
import com.hassen.exam.models.User;
import com.hassen.exam.services.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {
       
	@Autowired
	private UserService userServ;
	
	// === Display Route ===
	
		@GetMapping("/")
		public String index(Model model) {

			// Bind empty User and LoginUser objects to the JSP
			// to capture the form input
			
			model.addAttribute("newUser", new User());
			model.addAttribute("newLogin", new LoginUser());
			return "landingpage.jsp";
		}
		
		
		// ==== Action Route ====
		
		@PostMapping("/register")
		public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
				HttpSession session) {

			// 1. Execute the Service method
			
			userServ.register(newUser, result);

			if (result.hasErrors()) {
				// Be sure to send in the empty LoginUser before
				// re-rendering the page.
				model.addAttribute("newLogin", new LoginUser());
				return "landingpage.jsp";
			} else {
				session.setAttribute("userID", newUser.getId());
				return "redirect:/welcome";
			}
		}
		
		///// Display Route
		
		@GetMapping("/welcome")
		public String success(HttpSession s, Model model) {
			Long id = (Long) s.getAttribute("userID");
			if(id == null) {
				return "redirect:/";
			}else {
				
				User loggedinUser = userServ.findOne(id);
				model.addAttribute("user", loggedinUser);
				return "dashbord.jsp";
			}
		}
		
		
		// === Action Route === Login ===
		
		
		@PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        
	        // Add once service is implemented:
	         User user = userServ.login(newLogin, result);
	    
	        if(result.hasErrors()) {
	            model.addAttribute("newUser", new User());
	            return "landingpage.jsp";
	        }else {
	        	session.setAttribute("userID", user.getId());
	        	return "redirect:/welcome";
	        }
	   
	    }  
	   
		//// LOGOUT 
		@PostMapping("/logout")
	    public String logout(HttpSession session) {

	        session.removeAttribute("userID");
	        return "redirect:/";
	     }
		
 }
