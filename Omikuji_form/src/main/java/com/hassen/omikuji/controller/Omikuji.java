package com.hassen.omikuji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class Omikuji {
	
	
        // ==== Display Route ==== 
	
		@RequestMapping("/omikuji")
		public String form() {
			return "index.jsp";
		}
		
        // ==== Action Route ====
		@RequestMapping(value= "/form",  method = RequestMethod.POST)
		public String process (@RequestParam("year") String year,
			                   @RequestParam("city") String city,
			                   @RequestParam("name") String name,
			                   @RequestParam("hobby") String hobby,
			                   @RequestParam("type") String type,
				               @RequestParam("description") String description,
				               HttpSession s) {
			
			s.setAttribute("year", year);
			s.setAttribute("city", city);
			s.setAttribute("name", name);
			s.setAttribute("hobby", hobby);
			s.setAttribute("type", type);
			s.setAttribute("description", description);
			
			 return "redirect:/omikuji/show";
		}
		
				
		// ==== Display Route ====
		
		@RequestMapping("/omikuji/show")
		public String show() {
			return "show.jsp";
		}		
				
				
}
