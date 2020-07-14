package br.com.edmos.camunda.pessoafisica.delegate;

import java.util.List;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

import br.com.edmos.camunda.delegate.AbstractDelegate;
import br.com.edmos.camunda.pessoafisica.pojo.Pessoa;
import br.com.edmos.camunda.pessoafisica.pojo.Pessoas;
import lombok.Getter;
import lombok.Setter;

@Component("getOnePessoaDelegate")
@Getter
@Setter
public class GetOnePessoaDelegate extends AbstractDelegate {
	
	private int currentIndex = 0;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		super.execute(execution);
		
		List<Pessoa> pessoas = (List<Pessoa>) execution.getVariable("pessoas");
		
		execution.setVariable("currentPessoa", Integer.valueOf(this.currentIndex));
		
		if (this.currentIndex < pessoas.size()) {
			execution.setVariable("pessoa", pessoas.get(this.currentIndex));
		}
		
	}

}
