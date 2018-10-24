package Mapas;

import java.util.LinkedList;

import Juego.Juego;
import Personajes.Enemigo;
import Personajes.Entidad;
import Personajes.Kamikaze;
import Personajes.Obstaculos.*;

public class Mapa3 extends Mapa {

	public Mapa3(Juego j) {
		super(j);
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
			entidades.add(new ObstaculoBarricada(750,(i*600/(cantObstaculos)),500));
		}
		entidades.add(new ObstaculoDestruible(550,300,500));
		return entidades;
	}

	public Mapa mapaSiguiente() {
		return new Mapa4(juego);
		
	}

}
