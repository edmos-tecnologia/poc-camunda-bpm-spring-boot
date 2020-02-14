package br.com.edmos.camunda.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 
 * @author db2admin
 *
 */
@Component("myEventListener")
public class MyEventListener implements ExecutionListener {
	
	private static Logger Log = LoggerFactory.getLogger(MyEventListener.class);
	
	public void notify(DelegateExecution execution) throws Exception {
		Log.info("Chamando evento MyEventListener");
	}

}
