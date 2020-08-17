package br.com.santander.banco.modelo;

public class Cheque {
	
	private double valor;
	private int banco;
	private String data;
	
	public Cheque(double valor, int banco, String data) {
		this.valor = valor;
		this.banco = banco;
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
