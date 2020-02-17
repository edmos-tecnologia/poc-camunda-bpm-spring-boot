package br.com.edmos.camunda.delegate;

import java.util.HashMap;

import javax.inject.Named;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Named("doService")
public class DoServiceDelegate extends AbstractDelegate {
	
	RestTemplate client = new RestTemplate();
	
	public DoServiceDelegate() {
		Log.info("Creating DoServiceDelegate....");
	}
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		super.execute(execution);
		HashMap<String, Object> response = client.getForObject("https://cat-fact.herokuapp.com/facts/random", HashMap.class);
		execution.setVariables(response);
		Log.info(response.toString());
	}
}
