package br.com.edmos.camunda.pessoafisica.delegate;

import java.util.List;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

import br.com.edmos.camunda.delegate.AbstractDelegate;

@Component("getOnePessoaDelegate")
public class GetOnePessoaDelegate extends AbstractDelegate {
	
	private int currentIndex = 0;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		super.execute(execution);
		
		List<Map<String, Object>> pessoas = (List<Map<String, Object>>) execution.getVariable("pessoas");
		
		execution.setVariable("currentPessoa", Integer.valueOf(this.currentIndex));
		
		if (this.currentIndex < pessoas.size()) {
			execution.setVariable("pessoa", pessoas.get(this.currentIndex));
		}
		
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}
	
}
