package br.com.santander.banco.modelo;

public class ContaPoupanca extends Conta {

	private double taxaJuros;
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) {
		if(valor <= super.saldo) {
			super.saldo -= valor;
			System.out.println("Saque efetuado com sucesso !");
		}
		else {
			System.out.println("Saldo Insuficiente");
		}
	}
	
	public void recolherJuros() {
		System.out.println("Recolhendo Juros...");
		super.saldo -= this.taxaJuros;
		this.taxaJuros = 0;
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros() {
		System.out.println("Juros gerado, para simular um m�s");
		this.taxaJuros = super.saldo * 0.01;
		super.saldo += this.taxaJuros;
	}
}
