package com.hassen.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@RequestMapping("/daikichi")
	public String index() {
		return "Welcome !!";
	}

	@RequestMapping("/daikichi/today")
	public String index1() {
		return "Today you will find luck in all your endeavors !";
	}

	@RequestMapping("/daikichi/tomorrow")

	public String index2() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}

	// !!!! Add 2 new routes

	@RequestMapping("/{name}")
	public String index3(@PathVariable("name") String name) {

		return " I accept path variables";

	}

	@RequestMapping("/daikichi/{m}")
	public String index4(@PathVariable("m") Integer m) {

		return " I accept path variables";

	}

	// !!!GET request to 'http://localhost:8080/daikichi/travel/kyoto

	@RequestMapping("/daikichi/travel/{city}")
	public String index5(@PathVariable("city") String city) {
		
		return "Congratulations! You will soon travel to " + city;
	}
	
	//!!! GET request to 'http://localhost:8080/daikichi/lotto/8
	
	@RequestMapping("/daikichi/lotto/{count}")
	public String index6(@PathVariable("count") Integer count) {
		
		if (count < 8 ) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
		
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	}
		
}
	
	


