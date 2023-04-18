package com.hassen.counter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class Counter {
	
	@RequestMapping("/your_server/counter")
	public String index (HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			}
			else {
			int count = (int) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
			}
			return "index.jsp";
		}	
	

	@RequestMapping("/your_server")
	public String index1 (HttpSession session) {
//		String count = (String) session.getAttribute("count");
		return "other.jsp";	
	}
	
}
