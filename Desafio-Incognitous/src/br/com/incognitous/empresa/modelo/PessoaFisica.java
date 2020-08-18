package br.com.incognitous.empresa.modelo;

import java.time.LocalDate;

public class PessoaFisica extends Funcionario{

	private String nit;
	private String cargo;
	private double bonificacao;
	
	public PessoaFisica(String endereco, String nome, String cpf, String email, String setor, LocalDate dataAdmissao, String nit) {
		super(endereco, nome, cpf, email, setor, dataAdmissao);
		this.nit = nit;
	}
	
	@Override
	public void consultarContraCheque() {
		System.out.printf("Seu salário é de: R$ %.2f. Benefícios no valor de: %.2f por cento %nTotalizando: %.2f %n", salario, bonificacao, salario*bonificacao + salario);
	}
	
	public void demitir(Funcionario funcionario) {
		
	}
	
	public double getBonificacao() {
		return bonificacao;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		if(cargo.equalsIgnoreCase("GERENTE")) {
			this.bonificacao = 0.12;
		}
		else if(cargo.equalsIgnoreCase("SUPERVISOR")) {
			this.bonificacao = 0.08;
		}
		else {
			this.bonificacao = 0;
		}
		this.cargo = cargo;
	}
}
