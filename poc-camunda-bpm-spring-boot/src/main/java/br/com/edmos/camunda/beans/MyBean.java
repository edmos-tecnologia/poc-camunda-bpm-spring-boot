package br.com.edmos.camunda.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBean {
	
	private static Logger Log = LoggerFactory.getLogger(MyBean.class);
	
	public void doSomething () {
		Log.info("Chamando doSomething() de MyBean");
	}
	
	public void doSomethingWithParameter(String param) {
		Log.info("Chamando doSomethingWithParameter(" + param + ") de MyBean");
	}
}
