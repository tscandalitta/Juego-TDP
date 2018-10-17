package Mapas;

import java.util.LinkedList;

import Juego.Juego;
import Personajes.Enemigo;
import Personajes.Entidad;
import Personajes.Kamikaze;
import Personajes.Obstaculos.*;

public class Mapa3 extends Mapa {

	public Mapa3() {
		cantEnemigos=15;
		cantObstaculos=3;
		cantKamikazes=8;
	}
	
	
	public LinkedList<Entidad> crearEntidades() {
		entidades= new LinkedList<Entidad>();
		for(int i=1; i<cantKamikazes+1; i++) {
			entidades.add(new Kamikaze(1200, i*720/(cantKamikazes+1)));
		}
		for(int i=1; i<(cantEnemigos+1)/2; i++) {
			entidades.add(new Enemigo(1000, i*720/(cantEnemigos/2+1)));
		}
		for(int i=1; i<(cantEnemigos+1)/2; i++) {
			entidades.add(new Enemigo(1100, i*720/(cantEnemigos/2+1)));
		}
		for(int i=1; i<cantObstaculos; i++) {
			entidades.add(new ObstaculoDestruible(550+100*i,(i*600/(cantObstaculos)),300));
		}
		entidades.add(new ObstaculoBarricada(750,300,300));
		return entidades;
	}

	public void mapaSiguiente(Juego juego) {
		juego.setMapa(new Mapa3());
		
	}

}
