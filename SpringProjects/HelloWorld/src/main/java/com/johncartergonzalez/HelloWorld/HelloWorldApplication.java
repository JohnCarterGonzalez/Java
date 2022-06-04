package com.johncartergonzalez.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "Hello World!";
	}

	@RequestMapping("/test")
	public String test() {
		return "Be ready for the test!";
	}

  @RequestMapping("/name")
  public String name(){
  return "JohnCarter Gonzalez";
  }

}
