package br.com.edmos.camunda.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author db2admin
 *
 */
@Component("myEventListener")
@Slf4j
public class MyEventListener implements ExecutionListener {
	
	public void notify(DelegateExecution execution) throws Exception {
		log.info("Chamando evento MyEventListener");
	}

}
