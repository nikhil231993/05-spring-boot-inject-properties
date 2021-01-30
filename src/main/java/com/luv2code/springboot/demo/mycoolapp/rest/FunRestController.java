package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
		
	// expose "/" that return "Hello World"
	@Value("${foo.name}")
	private String coach;
	
	@Value("${foo.email}")
	private String email;
	
	@GetMapping("/teaminfo")
	public String teamInfo()
	{
		return "coach :"+coach+" email :"+email;
	}
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is Nikhil Thulaseedharan " + LocalDateTime.now();
	}
	
	
	@GetMapping("/workout")
	public String dailyworkout() {
		return "run 5k";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortuen()
	{
		return "you  lucky day";
	}

	
}












