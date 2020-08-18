package br.com.voar.modelo;

public class SuperHomem implements Voador {
	
	private int experiencia;
	
	@Override
	public void voar() {
		this.experiencia += 3;
		System.out.printf("Estou voando como um campeão e tenho %d pontos de experiência ! %n", this.experiencia);
	}

}
