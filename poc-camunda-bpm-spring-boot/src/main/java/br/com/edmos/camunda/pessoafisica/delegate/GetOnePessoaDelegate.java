package br.com.edmos.camunda.pessoafisica.delegate;

import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

import br.com.edmos.camunda.delegate.AbstractDelegate;

@Component("getOnePessoaDelegate")
public class GetOnePessoaDelegate extends AbstractDelegate {
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		super.execute(execution);
		
		Map<String, Object> pessoas = (Map<String, Object>) execution.getVariable("pessoas");
		
		Log.info(pessoas.get("enderecos").toString());
	}
}
