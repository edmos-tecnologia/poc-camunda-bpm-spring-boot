package br.com.edmos.camunda;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;

import br.com.edmos.camunda.delegate.DoServiceDelegate;

@SpringBootApplication
@EnableProcessApplication
public class ProcessApplication {

//	@Autowired
//	private RuntimeService runtimeService;
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ProcessApplication.class, args);
	}
//	
//	@EventListener
//	private void processPostDeploy(PostDeployEvent event) {
//		//runtimeService.startProcessInstanceByKey("myProcessApplication");
//	}
}