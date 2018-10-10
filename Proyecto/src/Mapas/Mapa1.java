package Mapas;

import java.util.LinkedList;
import Personajes.Enemigo;
import Personajes.Entidad;
import Personajes.Jugador;
import Personajes.Kamikaze;
import Personajes.Obstaculo;

public class Mapa1 extends Mapa {
	
	public Mapa1() {
		cantEnemigos=9;
	}
	
	
	public LinkedList<Entidad> crearEntidades() {
		entidades= new LinkedList<Entidad>();
		for(int i=1; i<cantEnemigos; i++) {
			entidades.add(new Kamikaze(1000, 90*i));
			entidades.add(new Enemigo(1150, 90*i+33));
		}
		entidades.add(new Obstaculo(650,425,600));
		entidades.add(new Obstaculo(550,50,600));
		return entidades;
	}
	public Jugador crearJugador() {
		return new Jugador(20,300);
	}

}
