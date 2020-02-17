package br.com.edmos.camunda.pojos;

import java.io.Serializable;

public class CallbackResponse implements Serializable {

	private String correlationId;
	private String businessId;

	public CallbackResponse(String correlationId, String businessId) {
		super();
		this.correlationId = correlationId;
		this.businessId = businessId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
}
