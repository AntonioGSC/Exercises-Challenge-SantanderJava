package br.com.voar.modelo;

public class TorreDeControle {

	Voador[] voadores; 
	
	public TorreDeControle(Voador[] voadores) {
		this.voadores = voadores;
	}
	
	public void voemTodos() {
		for(int i = 0; i < this.voadores.length; i++) {
			this.voadores[i].voar();
		}
	}
}
