package br.com.edmos.camunda.pojos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StartProcessResponse implements Serializable {
	
	private String processId;
	
	private String businessKey;
	
}
