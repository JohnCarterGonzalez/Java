package com.johncarter.controllers;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountController {
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		
		if (session.getAttribute(("count") == null) {
			session.setAttribute("count", 0);
		} else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount ++;
			session.setAttribute("count", currentCount);
		}
		return "index.jsp";
	}
	
	@RequestMappping("/counter")
	public String counter(HttpSession session, Model model, HttpServetRequest request) {
		
	}
}
