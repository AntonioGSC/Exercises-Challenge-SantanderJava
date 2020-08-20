package br.com.voar.modelo;

import java.util.List;

public class TorreDeControle {

	List<Voador> voadores; 
	
	public TorreDeControle(List<Voador> voadores) {
		this.voadores = voadores;
	}
	
	public void voemTodos() {
		voadores.forEach(voador -> voador.voar());
	}
}
