package Mapas;

import java.util.LinkedList;

import Juego.Juego;
import Personajes.Entidad;

public abstract class Mapa {
	protected LinkedList<Entidad> entidades;
	protected int cantEnemigos, cantObstaculos, cantKamikazes;
	protected Juego juego;
	
	protected Mapa(Juego j) {
		juego=j;
	}
	
	public abstract LinkedList<Entidad> crearEntidades();
	
	public abstract Mapa mapaSiguiente();
}
