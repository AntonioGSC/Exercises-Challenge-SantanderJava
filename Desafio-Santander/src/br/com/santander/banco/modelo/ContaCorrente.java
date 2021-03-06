package br.com.santander.banco.modelo;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
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
	
	public void sacaCheque(double valor, Cheque cheque) {
		if(cheque.getValor() > valor) {
			System.out.println("Saque efetuado com sucesso !");
		}
		else {
			System.out.println("Saldo em cheque Insuficiente");
		}
	}
	
	public void depositarCheque(Cheque cheque) {
		super.saldo += cheque.getValor();
		System.out.println("Deposito com cheque efetuado com sucesso !");
	}
}
