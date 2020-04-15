package br.com.edmos.controller.form;

import br.com.edmos.jpa.repository.PessoaFisicaRepository;
import br.com.edmos.pessoa.fisica.entity.PessoaFisica;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PessoaFisicaForm {
	
	private String primeiroNome;
	private String nomeDoMeio;
	private String sobreNome;
	private String cpf;
	
	public PessoaFisica toPessoaFisica() {
		return new PessoaFisica(null, primeiroNome, nomeDoMeio, sobreNome, cpf, null, null);
	}

	public PessoaFisica update(Long id, PessoaFisicaRepository repository) {
		PessoaFisica pessoa = repository.getOne(id);
		
		pessoa.setPrimeiroNome(primeiroNome);
		pessoa.setNomeDoMeio(nomeDoMeio);
		pessoa.setSobreNome(sobreNome);
		pessoa.setCpf(cpf);
		
		return pessoa;
	}
	
}
