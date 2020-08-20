package br.com.voar.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.voar.modelo.Aviao;
import br.com.voar.modelo.Pato;
import br.com.voar.modelo.SuperHomem;
import br.com.voar.modelo.TorreDeControle;
import br.com.voar.modelo.Voador;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pato pato = new Pato();
		Aviao aviao = new Aviao();
		SuperHomem superHomem = new SuperHomem();
		List<Voador> voadores = new ArrayList<Voador>();
		voadores.add(pato);
		voadores.add(aviao);
		voadores.add(superHomem);
		
		TorreDeControle torre = new TorreDeControle(voadores);
		
		torre.voemTodos();
		torre.voemTodos();
		torre.voemTodos();
//		pato.voar();
//		aviao.voar();
//		superHomem.voar();
	}

}
