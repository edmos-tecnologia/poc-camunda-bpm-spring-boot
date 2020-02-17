package br.com.edmos.camunda.rest.services;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.edmos.camunda.pojos.CallbackResponse;
import br.com.edmos.camunda.pojos.StartProcessResponse;

@RestController
public class CallbackService {
	
	protected static Logger Log = LoggerFactory.getLogger(CallbackService.class);

	@Autowired
	private RuntimeService runtimeService;

	@PostMapping("/callbackStart")
	public ResponseEntity<CallbackResponse> callbackStart(@RequestParam(name = "businessKey")String businessKey) {
		ProcessInstance pi = runtimeService.startProcessInstanceByKey("CallbackProcess", businessKey);
		
		MessageCorrelationResult result = runtimeService.createMessageCorrelation("callback")
				.processInstanceBusinessKey(pi.getBusinessKey())
				.setVariable("callbackStatus", "Callback started")
				.correlateWithResult();
				
		return ResponseEntity.ok(new CallbackResponse(pi.getRootProcessInstanceId(), businessKey));
	}
	
	@PostMapping("/start")
	public ResponseEntity<StartProcessResponse> mainProcessStart(@RequestParam(name = "businessKey")String businessKey) {
		ProcessInstance pi = runtimeService.startProcessInstanceByKey("MainProcess", businessKey);
		String processId = pi.getProcessInstanceId();
		StartProcessResponse response = new StartProcessResponse(processId, businessKey);
		
		runtimeService.setVariable(processId, "correlation", response);
		
		return ResponseEntity.ok(response);
	}
}
