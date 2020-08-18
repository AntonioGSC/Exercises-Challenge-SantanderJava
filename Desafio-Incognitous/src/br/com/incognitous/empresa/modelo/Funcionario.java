package br.com.incognitous.empresa.modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Funcionario {
	private String endereco;
	private String nome;
	private String cpf;
	private String email;
	private String setor;
	private LocalDate dataAdmissao;
	private LocalDate dataDemissao;
	private LocalDate dataUltimaFerias;
	protected double salario;
	
	public Funcionario(String endereco, String nome, String cpf, String email, String setor, LocalDate dataAdmissao) {
		this.endereco = endereco;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.setor = setor;
		this.dataAdmissao = dataAdmissao;
		this.dataUltimaFerias = dataAdmissao;
	}

	public void consultarContraCheque() {
		System.out.printf("Seu salário é de: R$ %.2f", salario);
	}
	
	public void tirarFeriar() {
		long mesesAdmissao = ChronoUnit.MONTHS.between(dataAdmissao, LocalDate.now());
		long mesesUltimaFerias = ChronoUnit.MONTHS.between(dataUltimaFerias, LocalDate.now());
		if(mesesAdmissao >= 11 && mesesUltimaFerias >= 4) {
			System.out.println("Você pode tirar férias");
			dataUltimaFerias = LocalDate.now();
		}
		else {
			System.out.println("Você ainda não pode tirar férias");
		}
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public LocalDate getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(LocalDate dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public LocalDate getDataUltimaFerias() {
		return dataUltimaFerias;
	}
	
	public void setDataUltimaFerias(LocalDate dataUltimaFerias) {
		this.dataUltimaFerias = dataUltimaFerias;
	}
}
