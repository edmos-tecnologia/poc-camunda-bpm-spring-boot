package br.com.edmos.pessoa.fisica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "pessoa_fisica")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PessoaFisica extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "pessoa_sequence")
	private @NonNull Integer id;
	
	@Column
	private String primeiroNome;
	
	@Column
	private String nomeDoMeio;
	
	@Column
	private @NonNull String sobreNome;
	
	@Column
	private String cpf;
	
	@ManyToOne
	private Endereco enderecoResidencial;
	
	@ManyToOne
	private Endereco enderecoComercial;
	
}
