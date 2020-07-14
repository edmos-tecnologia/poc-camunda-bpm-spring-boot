package br.com.edmos.camunda.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("mainPoolListener")
public class MainPoolListener implements ExecutionListener {
	
	private static Logger Log = LoggerFactory.getLogger(MainPoolListener.class);
	
	public void notify(DelegateExecution execution) throws Exception {
		Log.info("Entrando no MainPool");
		execution.setVariable("reprocessar", Boolean.TRUE);
	}
}