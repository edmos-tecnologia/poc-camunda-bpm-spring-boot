package br.com.edmos.camunda.pessoafisica.delegate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.edmos.camunda.delegate.AbstractDelegate;

@Component("getPessoasDelegate")
public class GetPessoasDelegate extends AbstractDelegate {
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		super.execute(execution);
		
		RestTemplate client = new RestTemplate();
		List<Map<String, Object>> pessoas = client.getForObject("https://my-json-server.typicode.com/edmos-tecnologia/my-json-server/pessoas", ArrayList.class);
		execution.setVariable("pessoas", pessoas);
		
	}
}