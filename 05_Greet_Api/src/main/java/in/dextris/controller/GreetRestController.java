package in.dextris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.dextris.clint.WelcomeFeignClint;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeFeignClint welcomeClint;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String welcomeMsg = welcomeClint.getWelcomeMsg();
		
		String greetMsg="Good Morning , ";
		
		return greetMsg+welcomeMsg;
	}
	

}
