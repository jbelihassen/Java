package com.hassen.travel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.hassen.travel.models.Travel;
import com.hassen.travel.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {

	
	@Autowired
	private TravelService travelService;
	
	
	// Get ALL Travel and form Travel 
	
	
	@GetMapping("/expenses")
	public String index(Model model) {
		List <Travel> allTravels = travelService.allTravels();
    
		model.addAttribute("allTravels",allTravels);
		Travel newTravel = new Travel();
	    model.addAttribute("travel",newTravel);
		return "index.jsp";
	}
	
	
	
	
	// ==== ACTION ROUTE == Create   == REDIRECT =====
	 
	 
		@PostMapping("/travels")
	     public String create(@Valid @ModelAttribute("travel") Travel travel,
	    					BindingResult result) {
	        if (result.hasErrors()) {
	            return "index.jsp";
	        } else {
	            travelService.createTravel(travel);
	            return "redirect:/expenses";
	        }
	    }
		
	
		// ============ EDIT PAGE ================
		
		// ========  DISPLAY ROUT  ===========
		
		
			@GetMapping("/expenses/edit/{id}")
			public String update(@PathVariable("id") Long id, Model model) {
				Travel travel = travelService.findTravel(id);
				model.addAttribute("travel",travel);
				return "edit.jsp";
			}
			
			
			
		// === ACTION ROUTE ===
			
			@PutMapping("/travels/{id}")
			public String updateTravel(@Valid @ModelAttribute("travel") Travel travel,
									BindingResult result) {
				if(result.hasErrors()) {
					return "edit.jsp";
				} else {
					travelService.updateTravel(travel);
					return "redirect:/expenses";
				}
			}
		
	   // DELETE
			
			@DeleteMapping("/travels/{id}")
			public String destroy(@PathVariable("id") Long id) {
				travelService.deleteTravel(id);
				return "redirect:/expenses";
			}
			
			
	// SHOW ONE
			@GetMapping("/expenses/{id}")
			public String showOne(@PathVariable("id") Long id, Model model) {
				Travel thisTravel = travelService.findTravel(id);
				model.addAttribute("travel", thisTravel);
				return "show.jsp";
			}
			
	
}
