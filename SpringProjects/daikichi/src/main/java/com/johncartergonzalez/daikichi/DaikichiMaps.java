package com.johncartergonzalez.daikichi;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/travel/{location}")
    public String travel(@PathVariable("location") String location) {
        return "Congratulations, you will soon be traveling to " + location;
    }

    @RequestMapping("/lotto/{number}")
    public String lotto(@PathVariable("number") int number) {
        if (number % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }
}
