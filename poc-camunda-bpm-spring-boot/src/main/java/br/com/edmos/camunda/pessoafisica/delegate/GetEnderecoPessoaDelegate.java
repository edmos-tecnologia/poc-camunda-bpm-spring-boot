package br.com.edmos.camunda.pessoafisica.delegate;

import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

import br.com.edmos.camunda.delegate.AbstractDelegate;

@Component("getEnderecoPessoaDelegate")
public class GetEnderecoPessoaDelegate extends AbstractDelegate {
	
	private int currentIndex = 0;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		super.execute(execution);
		
		Map pessoa = (Map) execution.getVariable("currentPessoa");
		Map endereco = (Map) pessoa.get("enderecos");
		execution.setVariable("currentIndex", Integer.valueOf(this.currentIndex));
		execution.setVariable("endereco", endereco);
		
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}
}
