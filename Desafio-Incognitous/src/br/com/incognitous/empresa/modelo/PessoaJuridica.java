package br.com.incognitous.empresa.modelo;

import java.time.LocalDate;

public class PessoaJuridica extends Funcionario{

	private String cnpj;
	
	public PessoaJuridica(String endereco, String nome, String cpf, String email, String setor, LocalDate dataAdmissao, String cnpj) {
		super(endereco, nome, cpf, email, setor, dataAdmissao);
		this.cnpj = cnpj;
	}
}
