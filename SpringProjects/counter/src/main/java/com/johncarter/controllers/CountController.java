package com.johncarter.controllers;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;j

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountController {
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		
		if (session.getAttribute(("count") == null)){
			session.setAttribute("count", 0);
		} else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount ++;
			session.setAttribute("count", currentCount);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model, HttpServletRequest request) {
		Integer currentCount = 0;
		
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			currentCount = (Integer) session.getAttribute("count");
		}
		
		String homeURL = request.getRequestURL().toString();
		model.addAttribute("count", currentCount);
		model.addAttribute("page", homeURL.substring(0,homeURL.length()-9));
		return "count.jps";
	}
	
	/*
	 * Assuming that for the +2 coding you change the "currentCount" to +=2 instead of ++
	 */
	
	
	@RequestMapping("/reset")
	public String resetCount(HttpSession session, Model model, HttpServletRequest request) {
		session.setAttribute("count", 0);
		return "redirect:/counter";
	}
}
