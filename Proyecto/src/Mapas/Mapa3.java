package Mapas;

import java.util.LinkedList;

import Juego.Juego;
import Personajes.Enemigo;
import Personajes.Entidad;
import Personajes.Jugador;
import Personajes.Kamikaze;
import Personajes.Obstaculo;

public class Mapa3 extends Mapa {

	public Mapa3() {
		cantEnemigos=15;
		cantObstaculos=3;
	}
	
	
	public LinkedList<Entidad> crearEntidades() {
		entidades= new LinkedList<Entidad>();
		for(int i=1; i<cantKamikazes+1; i++) {
			entidades.add(new Kamikaze(1200, i*720/(cantKamikazes+1)));
		}
		for(int i=1; i<cantEnemigos+1; i++) {
			entidades.add(new Enemigo(1100, i*720/(cantEnemigos+1)));
		}
		for(int i=1; i<cantObstaculos; i++) {
			entidades.add(new Obstaculo(600+100*i,(i*720/(cantObstaculos+1)),300));
		}
		return entidades;
	}
	
	public Jugador crearJugador() {
		return new Jugador(20,300);
	}

	public void mapaSiguiente(Juego juego) {
		juego.setMapa(new Mapa3());
		
	}

}
