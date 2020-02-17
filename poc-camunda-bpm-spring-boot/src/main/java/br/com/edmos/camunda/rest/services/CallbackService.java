package br.com.edmos.camunda.rest.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallbackService {
	
	@GetMapping("/callbackStart")
	public String callbackStart() {
		return "Callback started";
	}
}
