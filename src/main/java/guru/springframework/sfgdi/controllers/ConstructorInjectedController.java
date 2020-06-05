package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.*;

@Controller
public class ConstructorInjectedController {

	// @Autowired  Not mandatory for constructor based 
	
	private final GreetingService greetingServiceImpl;

	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingServiceImpl) {
		super();
		this.greetingServiceImpl = greetingServiceImpl;
	}
	 public String getGreeting() {
		 return greetingServiceImpl.sayGreeting();
	 }
	

}
