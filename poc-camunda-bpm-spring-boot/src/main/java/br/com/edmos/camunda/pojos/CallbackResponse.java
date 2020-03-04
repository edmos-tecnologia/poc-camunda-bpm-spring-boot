package br.com.edmos.camunda.pojos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CallbackResponse implements Serializable {

	private String correlationId;
	private String businessId;
	
}
