package br.com.incognitous.empresa.modelo;

import java.time.LocalDate;

public class PessoaFisica extends Funcionario{

	private String nit;
	private String cargo = "Funcionario";
	private double bonificacao;
	
	public PessoaFisica(String endereco, String nome, String cpf, String email, String setor, LocalDate dataAdmissao, double salario, String nit) {
		super(endereco, nome, cpf, email, setor, dataAdmissao, salario);
		this.nit = nit;
	}
	
	@Override
	public void consultarContraCheque() {
		System.out.printf("Seu salário é de: R$ %.2f. Benefícios no valor de: %.2f por cento %nTotalizando: %.2f %n", salario, bonificacao, salario*bonificacao + salario);
	}
	
	public void demitir(PessoaFisica funcionario) {
		if(!this.cargo.equalsIgnoreCase("GERENTE") && !this.cargo.equalsIgnoreCase("SUPERVISOR")) {
			System.out.println("Você não tem permissão para isso, apenas Gerentes e Supervisores podem demitir");
		}
		else if((this.cargo.equalsIgnoreCase("GERENTE") && funcionario.cargo.equalsIgnoreCase("Gerente"))
				||(this.cargo.equalsIgnoreCase("SUPERVISOR") && (funcionario.cargo.equalsIgnoreCase("SUPERVISOR") || funcionario.cargo.equalsIgnoreCase("Gerente")))){
			System.out.println("Você não tem permissão para demitir esse funcionario");
		}
		else {
			System.out.println("Inserindo data de demissão do funcionário...");
			funcionario.setDataDemissao(LocalDate.now());
			System.out.println("Data de demissão: " + funcionario.getDataDemissao());
		}
	}
	
	public void reajuste(PessoaFisica funcionario, double salario) {
		if(!this.cargo.equalsIgnoreCase("GERENTE")) {
			System.out.println("Você não tem permissão para isso ! Apenas Gerentes podem reajustar salários");
		}
		else if(this.cargo.equalsIgnoreCase("GERENTE") && funcionario.cargo.equalsIgnoreCase("Gerente")) {
			System.out.println("Você não tem permissão para isso !");
		}
		else if(salario < funcionario.getSalario()){
			System.out.println("Você não pode diminuir o salário do funcionário !");
		}
		else {
			funcionario.setSalario(salario);
			System.out.println("Salario reajustado para: " + funcionario.getSalario());
		}
	}
	
	public double getBonificacao() {
		return bonificacao;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		if(cargo.equalsIgnoreCase("GERENTE")) {
			this.bonificacao = 0.12;
			this.setSalario(super.salario * this.bonificacao + super.salario);
		}
		else if(cargo.equalsIgnoreCase("SUPERVISOR")) {
			this.bonificacao = 0.08;
			this.setSalario(super.salario * this.bonificacao + super.salario);
		}
		else {
			this.bonificacao = 0;
		}
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("          Contra-Cheque \n\n");
		string.append("    Funcionário: " + super.getNome() + "\n");
		string.append("            CPF: " + super.getCpf() + "\n");
		string.append("            NIT: " + this.nit + "\n");
		string.append("          Email: " + super.getEmail() + "\n");
		string.append("          Setor: " + super.getSetor() + "\n");
		string.append("          Cargo: " + this.cargo + "\n");
		string.append("       Endereço: " + super.getEndereco() + "\n");
		string.append("  Data Admissão: " + super.getDataAdmissao() + "\n");
		string.append("  Data Demissão: " + super.getDataDemissao() + "\n");
		string.append("        Salário: " + this.salario + "\n");
		string.append("    Bonificação: " + this.bonificacao + "\n");
		string.append("    Data Férias: " + super.getDataUltimaFerias() + "\n");
		string.append("Data Fim Férias: " + super.getDataFimUltimaFerias() + "\n");
		return string.toString();
	}
}
