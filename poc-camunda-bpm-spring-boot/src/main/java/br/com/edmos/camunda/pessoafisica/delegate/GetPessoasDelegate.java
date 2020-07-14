package br.com.edmos.camunda.pessoafisica.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.edmos.camunda.delegate.AbstractDelegate;
import br.com.edmos.camunda.pessoafisica.pojo.Pessoas;

@Component("getPessoasDelegate")
public class GetPessoasDelegate extends AbstractDelegate {
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		super.execute(execution);
		
		RestTemplate client = new RestTemplate();
		ResponseEntity<Pessoas> responseEntity = client.getForEntity("https://my-json-server.typicode.com/edmos-tecnologia/my-json-server/db", Pessoas.class);
		execution.setVariable("pessoas", responseEntity.getBody().getPessoas());
		
	}
}