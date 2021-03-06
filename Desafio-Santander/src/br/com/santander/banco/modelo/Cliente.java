package br.com.santander.banco.modelo;

public class Cliente {
	
	private int numero;
	private String nome;
	private String cpf;
	private String rg;
	private static int contador;
	
	public Cliente(String nome, String cpf, String rg) {
		Cliente.contador++;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.numero = contador;
		System.out.println("Cliente Criado");
	}

	public int getNumero() {
		return numero;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
