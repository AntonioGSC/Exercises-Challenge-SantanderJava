package br.com.santander.banco.teste;

import br.com.santander.banco.modelo.Cliente;
import br.com.santander.banco.modelo.Conta;
import br.com.santander.banco.modelo.ContaCorrente;
import br.com.santander.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente("Antonio Gabriel", "392012832-5", "12952789-5");
		Cliente cliente2 = new Cliente("Antonio Carvalho", "392012832-5", "12952789-5");
		ContaCorrente contaCorrente = new ContaCorrente(123, 12345);
		ContaPoupanca contaPoupanca = new ContaPoupanca(321, 54321);
		
		contaCorrente.setTitular(cliente);
		contaPoupanca.setTitular(cliente2);
		System.out.println(contaCorrente.getTitular().getNumero());
		System.out.println(contaPoupanca.getTitular().getNumero());
		
		contaCorrente.deposita(300.12);
		contaPoupanca.deposita(1000);
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaPoupanca.getSaldo());
	}

}
