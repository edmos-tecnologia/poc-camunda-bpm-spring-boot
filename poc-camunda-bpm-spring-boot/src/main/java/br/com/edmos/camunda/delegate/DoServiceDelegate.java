package br.com.edmos.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DoServiceDelegate implements JavaDelegate {

	private static Logger Log = LoggerFactory.getLogger(DoServiceDelegate.class);
	
	static {
		Log.info("Mah OEEEEEE");
	}
	
	public DoServiceDelegate() {
		Log.info("Creating DoServiceDelegate....");
	}

	public void execute(DelegateExecution execution) throws Exception {
		Log.info("Doing Java Delegate Execution!", execution);
	}

}
