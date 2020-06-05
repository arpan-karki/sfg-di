package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingServiceImpl;

@Controller
public class ConstructorInjectedController {
	
	@Autowired
	GreetingServiceImpl greetingServiceImpl;

	public ConstructorInjectedController(GreetingServiceImpl greetingServiceImpl) {
		super();
		this.greetingServiceImpl = greetingServiceImpl;
	}
	 public String getGreeting() {
		 return greetingServiceImpl.sayGreeting();
	 }
	

}
