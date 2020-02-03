package br.com.edmos.camunda.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.edmos.camunda.delegate.DoServiceDelegate;

//@Configuration
public class CamundaConfig {
	private static Logger Log = LoggerFactory.getLogger(CamundaConfig.class);
	
	private DoServiceDelegate doService;
	
//	@Bean(name = "doServiceDelegate")
//	public DoServiceDelegate getDoService() {
//		Log.info("Get DoServiceDelegate Bean");
//		return doService;
//	}
}
