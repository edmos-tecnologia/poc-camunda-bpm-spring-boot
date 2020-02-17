package br.com.edmos.camunda.pojos;

import java.io.Serializable;

public class StartProcessResponse implements Serializable {
	private String processId;
	
	private String businessKey;
	
	public StartProcessResponse(String processId, String businessKey) {
		super();
		this.processId = processId;
		this.businessKey = businessKey;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	
}
