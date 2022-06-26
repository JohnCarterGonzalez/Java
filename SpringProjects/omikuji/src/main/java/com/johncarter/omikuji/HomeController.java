package com.johncarter.omikuji;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  @GetMapping("/")
  public String index(){
    return "redirect:/omikuji";
  }
  
	@GetMapping("/omikuji")
	public String omi() {
    return "index.jsp";
	}

  @PostMapping("/omikuji/create")
  public String form(HttpSession session,
      @RequestParam("num") int num,
      @RequestParam("city") String city,
      @RequestParam("person") String person,
      @RequestParam("hobby") String hobby,
      @RequestParam("livingThing") String livingThing,
      @RequestParam("niceMessage") String niceMessage
      ) {
    String omiMessage = String.format("In %s years you will live in %s with %s as your roomate, %s." +
        "The next time you see a %s, you will have goodluck. Also, %s", num, city, person, hobby, livingThing, niceMessage);

    session.setAttribute("omiMessage", omiMessage);

    return "redirect:/omikuji/show";
    
  }

  @GetMapping("/omikuji/show") 
  public String show(HttpSession session, Model model, HttpServletRequest request) {
    String result = (String) session.getAttribute("result");
    model.addAttribute("result", result);

    return "omi.jsp";  
    
  }
}
