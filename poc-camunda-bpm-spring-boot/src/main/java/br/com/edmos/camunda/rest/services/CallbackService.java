package br.com.edmos.camunda.rest.services;

import java.util.Date;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	public CallbackResponse callbackStart(@RequestParam(name = "businessKey")String businessKey) {
		ProcessInstance pi = runtimeService.startProcessInstanceByKey("CallbackProcess", businessKey);
		CallbackResponse response = new CallbackResponse();
		
		Log.info("BusinessKey: " + pi.getBusinessKey());
		
		MessageCorrelationResult result = runtimeService.createMessageCorrelation("callback")
				.processInstanceBusinessKey(pi.getBusinessKey())
				.setVariable("callbackStatus", "Callback started")
				.correlateWithResult();
		
		response.setCorrelationId(result.toString());
		
		return response;
	}
	
	@PostMapping("/start")
	public StartProcessResponse mainProcessStart(@RequestParam(name = "businessKey")String businessKey) {
		ProcessInstance pi = runtimeService.startProcessInstanceByKey("MainProcess", businessKey);
		String processId = pi.getProcessInstanceId();
		StartProcessResponse response = new StartProcessResponse(processId, businessKey);
		
		runtimeService.setVariableLocal(processId, "correlation", processId);
		
		return response;
	}
}
