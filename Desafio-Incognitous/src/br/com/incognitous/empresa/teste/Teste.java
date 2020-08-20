package br.com.incognitous.empresa.teste;

import java.time.LocalDate;

import br.com.incognitous.empresa.modelo.PessoaFisica;
import br.com.incognitous.empresa.modelo.PessoaJuridica;

public class Teste {

	public static void main(String[] args) {
		PessoaFisica funcionario1 = new PessoaFisica("Rua da Pedra, n 2", "Antonio Gabriel", "4939281994-50", "abc@gmail.com", "Manutenção", LocalDate.of(2010, 1, 10), 5000.00, "2312341");
		PessoaFisica funcionario2 = new PessoaFisica("Rua da Chuva, n 1", "Pedro Souza", "2341241246-10", "cba@gmail.com", "Limpeza", LocalDate.of(2020, 1, 10), 2500.00, "481920");
		PessoaJuridica funcionario3 = new PessoaJuridica("Rua da Areia, n 3", "Rodrigo Mendes", "13213412441-90", "bac@hotmail.com", "TI", LocalDate.of(2020, 1, 10), 3000.00, "6436341");
		funcionario1.setCargo("Gerente");
		funcionario2.setCargo("Auxiliar");
		System.out.println(funcionario1.getSalario());
		System.out.println(funcionario1.getBonificacao());
		System.out.println(funcionario2.getSalario());
		System.out.println(funcionario3.getSalario());
		funcionario1.tirarFeriar(LocalDate.now());
		funcionario2.tirarFeriar(LocalDate.now());
		funcionario1.reajuste(funcionario2, 10000);
		funcionario1.demitir(funcionario2);
		funcionario1.trabalhar();
		funcionario1.setDataDemissao(LocalDate.of(2020, 10, 10));
		
		System.out.println("\n\n" + funcionario1);
	}
}
