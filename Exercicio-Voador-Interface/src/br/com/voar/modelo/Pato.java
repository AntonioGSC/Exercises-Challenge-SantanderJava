package br.com.voar.modelo;

public class Pato implements Voador{
	
	private int energia = 100;
	
	@Override
	public void voar() {
		// TODO Auto-generated method stub
		if(this.energia > 0) {
			this.energia -= 5;
			System.out.printf("Estou voando como um pato e ainda tenho %d pontos de energia ! %n", this.energia);
		}
		else {
			System.out.println("Não tenho energia suficiente para voar");
		}
	}

}
