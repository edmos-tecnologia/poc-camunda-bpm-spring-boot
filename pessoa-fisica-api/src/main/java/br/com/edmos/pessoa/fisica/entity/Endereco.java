package br.com.edmos.pessoa.fisica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "enderecos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Endereco extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "endereco_sequence")
	private Integer id;
	
	@Column
	private String logradouro;
	
	@Column
	private String cep;
	
	@Column
	private String tipoLogradouro;
	
	@Column
	private String bairro;
	
	@Column
	private String pais;
	
	@Column
	private String cidade;
	
	@Column
	private String uf;
	
	@Column
	private boolean isEnderecoPadrao;
}
