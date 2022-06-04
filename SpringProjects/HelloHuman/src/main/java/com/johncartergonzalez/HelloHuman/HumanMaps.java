package com.johncartergonzalez.HelloHuman;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController



public class HumanMaps {
    @RequestMapping("/")
    public String index(@RequestParam(value="name",required=false) String name, @RequestParam(value="last_name",required=false) String last_name) {
        if (name == null) {
            return "Hello Human!";
        } else if (last_name == null) {
        	return "You searched for: " + name;
        } else {
            return "You searched for: " + name + " " + last_name;
        }
        
    }


}
