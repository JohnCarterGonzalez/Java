package com.johncartergonzalez.controllerpractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {
    @RequestMapping("/")
	public String index() {
		return "Hello World!";
	}

	@RequestMapping("/world")
    public String world() {
        return "Class level annotations are cool too!";
    }
	}

