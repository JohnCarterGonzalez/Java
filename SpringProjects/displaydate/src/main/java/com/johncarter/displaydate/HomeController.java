package com.johncarter.displaydate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
// New import needed!
import org.springframework.ui.Model;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date") {
		public String date(Model model) {
			Date date = new Date();
			
			SimpleDateFormat dayName = new SimpleDateFormat("EEEE");
			SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
			SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
			SimpleDateFormat yearFormat = new SimpleDateFormat("Y");
			
			String dayNameStr = dayName.format(date);
			String dayStr = dayFormat.format(date);
			String monthStr = monthFormat.format(date);
			String yearStr = yearFormat.format(date);
			
			String dateStr = dayNameStr + ", " + "the" + dayStr + "of " + monthStr + ", " + yearStr;
			
			model.addAttribute("dateStr", dateStr);
      return "date.jsp";
		}
	

	@RequestMapping
  public String time(Model model){
    SimpleDateFormat format = new SimpleDateFormat("h:mm a");

    Date date = new Date();

    String tString = format.format(date);

    model.addAttribute("tString", tString);

    return "time.jsp";
  }
}


