package br.com.edmos.camunda.delegate.java;

import javax.inject.Named;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named("doService")
public class DoServiceDelegate implements JavaDelegate {

	private static Logger LOGGER = LoggerFactory.getLogger(DoServiceDelegate.class);
	
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Doing Java Delegate Execution!");
	}

}
