package br.com.voar.modelo;

public class SuperHomem implements Voador {
	
	private int experiencia;
	
	@Override
	public void voar() {
		this.experiencia += 3;
		System.out.printf("Estou voando como um campe�o e tenho %d pontos de experi�ncia ! %n", this.experiencia);
	}

}
