package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {

		@Autowired
		private  GreetingService greetingService;

		public GreetingService getGreetingService() {
			return greetingService;
		}

		public void setGreetingService(GreetingService greetingService) {
			this.greetingService = greetingService;
		}
		
		
}
