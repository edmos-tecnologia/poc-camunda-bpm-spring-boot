package br.com.edmos.camunda.rest.services;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallbackService {
	
	@Autowired
	private RuntimeService runtimeService;
	
	@GetMapping("/callbackStart")
	public String callbackStart() {
		ProcessInstance pi = runtimeService.startProcessInstanceByKey("CallbackProcess");
		return "Callback started";
	}
}
