package br.com.edmos.pessoa.fisica.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Telefone extends BasePojo {
	private String codigoPais;
	
	private String codigoUf;
		
	private String numero;
	
	private String ramal;
	
	private boolean isTelefonePadrao;
}
