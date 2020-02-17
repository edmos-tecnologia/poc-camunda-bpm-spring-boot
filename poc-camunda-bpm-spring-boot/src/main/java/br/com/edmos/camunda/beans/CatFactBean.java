package br.com.edmos.camunda.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("catFactBean")
public class CatFactBean {
	private static Logger Log = LoggerFactory.getLogger(CatFactBean.class);
	
	public void catVerified(String fact) {
		logFact(fact);
		Log.info("Cat Fact is verified!");
	}
	
	public void catIsNotVerified(String fact) {
		logFact(fact);
		Log.info("Cat Fact isn't verified!");
	}
	
	private void logFact(String fact) {
		Log.info(fact);
	}
}
