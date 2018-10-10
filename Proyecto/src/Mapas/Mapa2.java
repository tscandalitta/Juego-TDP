package Mapas;

import java.util.LinkedList;
import Personajes.Enemigo;
import Personajes.Entidad;
import Personajes.Jugador;
import Personajes.Obstaculo;

public class Mapa2 extends Mapa {
	
	public Mapa2() {
		cantEnemigos=15;
		cantObstaculos=1;
	}
	
	
	public LinkedList<Entidad> crearEntidades() {
		entidades= new LinkedList<Entidad>();
		for(int i=1; i<cantEnemigos; i++) {
			entidades.add(new Enemigo(1000, 50*i));
			entidades.add(new Enemigo(1150, 50*i+33));
		}
		for(int i=1; i<=cantObstaculos; i++)
			entidades.add(new Obstaculo(500,720/(2*i),300));
		return entidades;
	}
	public Jugador crearJugador() {
		return new Jugador(20,300);
	}

}
