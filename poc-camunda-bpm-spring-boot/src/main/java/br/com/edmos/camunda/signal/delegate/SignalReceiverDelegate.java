package br.com.edmos.camunda.signal.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

import br.com.edmos.camunda.delegate.AbstractDelegate;

@Component("signalReceiverDelegate")
public class SignalReceiverDelegate extends AbstractDelegate {
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		super.execute(execution);
		Log.info("###### Signal Received ######");
	}
}