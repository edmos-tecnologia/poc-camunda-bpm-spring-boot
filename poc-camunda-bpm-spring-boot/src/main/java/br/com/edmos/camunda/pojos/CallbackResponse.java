package br.com.edmos.camunda.pojos;

import java.io.Serializable;

public class CallbackResponse implements Serializable {
	
	private String correlationId;

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
}
