package br.com.edmos.camunda.main;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ProcessApplication {

	@Autowired
	private RuntimeService runtimeService;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ProcessApplication.class, args);
	}
	
	@EventListener
	private void processPostDeploy(PostDeployEvent event) {
		runtimeService.startProcessInstanceByKey("myProcess");
	}
}
