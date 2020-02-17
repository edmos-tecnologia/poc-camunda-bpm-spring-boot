package br.com.edmos.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

@Component("throwMessageDelegate")
public class ThrowMessageDelegate extends AbstractDelegate {
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		super.execute(execution);
	}
}
