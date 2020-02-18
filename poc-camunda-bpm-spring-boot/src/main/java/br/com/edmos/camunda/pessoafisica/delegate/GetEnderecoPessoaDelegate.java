package br.com.edmos.camunda.pessoafisica.delegate;

import java.util.List;
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
		
		Map pessoa = (Map) execution.getVariable("pessoa");
		List<Map<String, Object>> enderecos = (List<Map<String, Object>>) pessoa.get("enderecos");
		execution.setVariable("currentEndereco", Integer.valueOf(this.currentIndex));
				
		if (this.currentIndex < enderecos.size()) {
			execution.setVariable("endereco", enderecos.get(this.currentIndex));
		}
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}
}
