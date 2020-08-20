package br.com.incognitous.empresa.modelo;

import java.time.LocalDate;

public class PessoaJuridica extends Funcionario{

	private String cnpj;
	
	public PessoaJuridica(String endereco, String nome, String cpf, String email, String setor, LocalDate dataAdmissao, double salario, String cnpj) {
		super(endereco, nome, cpf, email, setor, dataAdmissao, salario);
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("          Contra-Cheque \n\n");
		string.append("    Funcionário: " + super.getNome() + "\n");
		string.append("            CPF: " + super.getCpf() + "\n");
		string.append("           CNPJ: " + this.cnpj + "\n");
		string.append("          Email: " + super.getEmail() + "\n");
		string.append("          Setor: " + super.getSetor() + "\n");
		string.append("       Endereço: " + super.getEndereco() + "\n");
		string.append("  Data Admissão: " + super.getDataAdmissao() + "\n");
		string.append("  Data Demissão: " + super.getDataDemissao() + "\n");
		string.append("        Salário: " + this.salario + "\n");
		string.append("    Data Férias: " + super.getDataUltimaFerias() + "\n");
		string.append("Data Fim Férias: " + super.getDataFimUltimaFerias() + "\n");
		return string.toString();
	}
}
