package br.com.edmos.pessoa.fisica.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Telefone extends BaseEntity {
	private String codigoPais;
	
	private String codigoUf;
		
	private String numero;
	
	private String ramal;
	
	private boolean isTelefonePadrao;
}
