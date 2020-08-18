package br.com.voar.modelo;

public class Aviao implements Voador {

	private int horasVoo;
	
	@Override
	public void voar() {
		this.horasVoo += 13;
		System.out.printf("Estou voando como um avião e tenho %d horas de voo !%n", this.horasVoo);
	}

}
