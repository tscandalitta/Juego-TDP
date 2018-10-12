package Mapas;

import java.util.LinkedList;

import Juego.Juego;
import Personajes.Enemigo;
import Personajes.Entidad;
import Personajes.Kamikaze;
import Personajes.Obstaculo;

public class Mapa1 extends Mapa {
	
	public Mapa1() {
		cantEnemigos=4;
		cantKamikazes=3;
		cantObstaculos=0;
	}
	
	public LinkedList<Entidad> crearEntidades() {
		entidades= new LinkedList<Entidad>();
		for(int i=1; i<cantKamikazes+1; i++) {
			entidades.add(new Kamikaze(1200, i*720/(cantKamikazes+1)));
		}
		for(int i=1; i<cantEnemigos+1; i++) {
			entidades.add(new Enemigo(1100, i*720/(cantEnemigos+1)));
		}
		for(int i=1; i<cantObstaculos+1; i++) {
			entidades.add(new Obstaculo(600+100*i,(i*720/(cantObstaculos+1)),300));
		}
		return entidades;
	}

	public void mapaSiguiente(Juego juego) {
		juego.setMapa(new Mapa2());
	}

}
