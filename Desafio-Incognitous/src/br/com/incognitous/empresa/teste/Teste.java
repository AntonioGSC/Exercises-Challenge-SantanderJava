package br.com.incognitous.empresa.teste;

import java.time.LocalDate;

import br.com.incognitous.empresa.modelo.Funcionario;
import br.com.incognitous.empresa.modelo.PessoaFisica;

public class Teste {

	public static void main(String[] args) {
		PessoaFisica funcionario1 = new PessoaFisica("Rua X, n 2", "Antonio", "4939281994-50", "abc@gmail.com", "Manutenção", LocalDate.of(2010, 1, 10), "2312341");
		System.out.println(funcionario1.getDataAdmissao());
		System.out.println(funcionario1.getDataUltimaFerias());
	}
}
