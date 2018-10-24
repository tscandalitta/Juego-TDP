package Mapas;

import java.util.LinkedList;

import Juego.Juego;
import Personajes.Entidad;

public abstract class Mapa {
	LinkedList<Entidad> entidades;
	int cantEnemigos, cantObstaculos, cantKamikazes;
	protected Juego juego;
	
	protected Mapa(Juego j) {
		juego=j;
	}
	public abstract LinkedList<Entidad> crearEntidades();
	
	public abstract Mapa mapaSiguiente();
}
