package com.johncartergonzalez.daikichi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiMaps {
    @RequestMapping("")
    public String index() {
        return "Welcome to the Daikichi Map!";
    }

    @RequestMapping("/today")
    public String today() {
        return "Today you will luck in all your endeavors!";
    }

    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity wll arise, so be sure to be open to new ideas!";
    }
}
