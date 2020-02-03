package br.com.edmos.camunda.delegate;

import javax.inject.Named;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Named("doService")
public class DoServiceDelegate implements JavaDelegate {

	private static Logger Log = LoggerFactory.getLogger(DoServiceDelegate.class);
	
	public DoServiceDelegate() {
		Log.info("Creating DoServiceDelegate....");
	}

	public void execute(DelegateExecution execution) throws Exception {
		Log.info("Doing Java Delegate Execution!", execution);
	}

}
