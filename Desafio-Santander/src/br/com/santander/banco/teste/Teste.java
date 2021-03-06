package br.com.santander.banco.teste;

import br.com.santander.banco.modelo.Cheque;
import br.com.santander.banco.modelo.Cliente;
import br.com.santander.banco.modelo.Conta;
import br.com.santander.banco.modelo.ContaCorrente;
import br.com.santander.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		//Declarando Clientes e Contas
		Cliente cliente = new Cliente("Antonio Gabriel", "392012832-5", "12952789-5");
		Cliente cliente2 = new Cliente("Antonio Carvalho", "392012832-5", "12952789-5");
		ContaCorrente contaCorrente = new ContaCorrente(123, 12345);
		ContaPoupanca contaPoupanca = new ContaPoupanca(321, 54321);
		
		
		//Atribuindo Cliente a conta
		contaCorrente.setTitular(cliente);
		contaPoupanca.setTitular(cliente2);
		System.out.println(contaCorrente.getTitular().getNumero());
		System.out.println(contaPoupanca.getTitular().getNumero());
		
		
		//Depositando nas contas
		contaCorrente.deposita(300.12);
		contaPoupanca.deposita(1100);
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaPoupanca.getSaldo());
		
		
		//Testando saque com conta poupan�a
		contaPoupanca.saca(100);
		System.out.println(contaPoupanca.getSaldo());
		
		
		//Testando recolher juros
		contaPoupanca.setTaxaJuros();
		System.out.println(contaPoupanca.getTaxaJuros());
		System.out.println(contaPoupanca.getSaldo());
		contaPoupanca.recolherJuros();
		System.out.println(contaPoupanca.getTaxaJuros());
		System.out.println(contaPoupanca.getSaldo());
		
		
		//Testando Saque com conta corrente
		contaCorrente.saca(100);
		System.out.println(contaCorrente.getSaldo());
		
		
		//Criando Cheque e testando saque e deposito
		Cheque cheque = new Cheque(1000, 1234, "12-10-2020");
		contaCorrente.sacaCheque(200, cheque);
		contaCorrente.depositarCheque(cheque);
		System.out.println(contaCorrente.getSaldo());
	}
}
