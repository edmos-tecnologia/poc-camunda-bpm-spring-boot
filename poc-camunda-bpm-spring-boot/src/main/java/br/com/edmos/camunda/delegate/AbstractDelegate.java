package br.com.edmos.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

public class AbstractDelegate implements JavaDelegate {
	
	protected static Logger Log = LoggerFactory.getLogger(AbstractDelegate.class);
	
	/**
	 * @param DelegateExecution
	 * @author Eduardo Ramos
	 */
	public void execute(DelegateExecution execution) throws Exception {
		Log.info("Executing " + getClass().getName() + ".");
	}

}
