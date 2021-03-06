package br.com.santander.banco.modelo;

public abstract class Conta {
	private int agencia;
	private int numero;
	private Cliente titular;
	protected double saldo;
	
	public Conta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta Criada");
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Deposito efetuado com sucesso !");
	}
	
	public abstract void saca(double valor);

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int conta) {
		this.numero = conta;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
}
