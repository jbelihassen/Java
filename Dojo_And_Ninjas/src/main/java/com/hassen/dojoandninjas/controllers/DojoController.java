package com.hassen.dojoandninjas.controllers;

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

import com.hassen.dojoandninjas.models.Dojo;
import com.hassen.dojoandninjas.services.DojoService;

import jakarta.validation.Valid;

@Controller
public class DojoController {
	
	@Autowired
	private DojoService dojoService;
	
	//Home ===Display route Home ===
	
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	// Diplay Route Get ALL dojos
	
	@GetMapping("/dojos")
	public String dojos(Model model) {
		List<Dojo> allDojos = dojoService.allDojos();
		model.addAttribute("allDojos", allDojos);
		return "alldojos.jsp";
	  }


	//   Create dojo === Display Route ===
		@GetMapping("/dojos/new")
		public String dojos(Model model ,@ModelAttribute("dojo") Dojo dojo) {
			List<Dojo> allDadojos = dojoService.allDojos();
			model.addAttribute("alldojos",allDadojos);
			return "dojo.jsp";
		}
		
	//  Create dojo   === Action Route === 
		
		@PostMapping("/dojos/new")
		public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo,
								BindingResult result,
								Model model) {
			if(result.hasErrors()) {
				List<Dojo> allDadojos = dojoService.allDojos();
				model.addAttribute("allDojos",allDadojos);
				return "dojo.jsp";
			}else{
				dojoService.createDojo(dojo);
				return "redirect:/dojos/new";
			}
		}	
		
		// === Display Route   Get One dojo  ===
		
		@GetMapping("/dojos/{id}")
		public String getDojo(@PathVariable("id") Long id,
								Model model) {
			Dojo thisDojo = dojoService.findDojo(id);
			model.addAttribute("dojo",thisDojo);
			return "oneDojo.jsp";
		}
		
		
		// DELETE
		
		
		
		@DeleteMapping("/dojos/{id}")
		public String destroy(@PathVariable("id") Long id) {
			dojoService.deleteDojo(id);
			return "redirect:/dojos";
		}	
		
		
		// EDIT PAGE == DISPLAY ROUTE
				@GetMapping("/dojos/edit/{id}")
				public String update(@PathVariable("id") Long id, Model model) {
					Dojo dojo = dojoService.findDojo(id);
					model.addAttribute("dojo", dojo);
					return "editdojo.jsp";
				}

				// === ACTION ROUTE ===
				@PutMapping("/dojos/{id}")
				public String updateDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
					if (result.hasErrors()) {
						return "editdojo.jsp";
					} else {
						dojoService.updateDojo(dojo);
						return "redirect:/dojos";
					}
				}
		

		
}
