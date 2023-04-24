package com.hassen.burger.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hassen.burger.models.Burger;
import com.hassen.burger.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {

	
	@Autowired
	private BurgerService burgerService;
	
	
	@GetMapping("/")
	public String index(Model model) {
		List <Burger> allBurgers = burgerService.allBurgers();
    //System.out.println(allBurgers);
		model.addAttribute("allBurgers",allBurgers);
		Burger newBurger = new Burger();
	    model.addAttribute("burger",newBurger);
		return "index.jsp";
	}


	// ==== DISPLAY ROUTE ====
	
	
	
     //	@GetMapping("/create")
   //	public String create(Model model) {
      //		// Create Book Object
       //		Book newBook = new Book();
      //		model.addAttribute("book",newBook);
       //		return "create.jsp";
          //	}
	
//	 @GetMapping("/")
//	 public String create(@ModelAttribute("burger") Burger b) {
//		return "index.jsp";
//     	}
//	 
	 
	 
	// ==== ACTION ROUTE ==== REDIRECT
	 
	 
	@PostMapping("/burgers")
     public String create(@Valid @ModelAttribute("burger") Burger burger,
    					BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
            burgerService.createBurger(burger);
            return "redirect:/";
        }
    }
	
	
}
