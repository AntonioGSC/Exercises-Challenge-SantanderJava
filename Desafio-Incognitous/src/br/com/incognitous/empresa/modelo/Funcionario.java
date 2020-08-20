package br.com.incognitous.empresa.modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public abstract class Funcionario {
	private String endereco;
	private String nome;
	private String cpf;
	private String email;
	private String setor;
	private LocalDate dataAdmissao;
	private LocalDate dataDemissao;
	private LocalDate dataUltimaFerias;
	private LocalDate dataFimUltimaFerias;
	protected double salario;
	
	public Funcionario(String endereco, String nome, String cpf, String email, String setor, LocalDate dataAdmissao, double salario) {
		this.endereco = endereco;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.setor = setor;
		this.dataAdmissao = dataAdmissao;
		this.dataUltimaFerias = dataAdmissao;
		this.salario = salario;
	}

	public void consultarContraCheque() {
		System.out.printf("Seu sal�rio � de: R$ %.2f", salario);
	}
	
	public void tirarFeriar(LocalDate dataFerias) {
		long mesesAdmissao = ChronoUnit.MONTHS.between(dataAdmissao, dataFerias);
		long mesesUltimaFerias = ChronoUnit.MONTHS.between(dataUltimaFerias, dataFerias);
		if(mesesAdmissao >= 11 && mesesUltimaFerias >= 4) {
			System.out.println("Voc� pode tirar f�rias");
			dataUltimaFerias = dataFerias;
			int dia = dataUltimaFerias.getDayOfMonth();
			int mes = dataUltimaFerias.getMonthValue();
			int ano = dataUltimaFerias.getYear();
			this.dataFimUltimaFerias = LocalDate.of(ano, mes + 1, dia);
		}
		else {
			System.out.println("Voc� ainda n�o pode tirar f�rias");
		}
	}
	
	public void trabalhar() {
		long diasComecoFerias = ChronoUnit.DAYS.between(LocalDate.now(), this.dataFimUltimaFerias);
		if(diasComecoFerias >= 0 && diasComecoFerias <= 31) {
			System.out.println("Voc� n�o pode trabalhar durante as f�rias, v� para casa e descanse");
		}
		else {
			System.out.println("Bem-vindo a mais um dia de trabalho !");
		}
	}
	
	public void aumento() {
		int gerador = new Random().nextInt(10);
		if(gerador <= 4) {
			System.out.println("Desculpe, ainda n�o podemos te dar um aumento");
		}
		else {
			System.out.println("PARAB�NS, voc� receber� um aumento !!");
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
		int dia = dataUltimaFerias.getDayOfMonth();
		int mes = dataUltimaFerias.getMonthValue();
		int ano = dataUltimaFerias.getYear();
		this.dataFimUltimaFerias = LocalDate.of(ano, mes + 1, dia);
	}
	
	public LocalDate getDataFimUltimaFerias() {
		return dataFimUltimaFerias;
	}
}
