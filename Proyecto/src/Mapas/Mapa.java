package Mapas;

import java.util.LinkedList;

import Personajes.Entidad;
import Personajes.Jugador;
public abstract class Mapa {
	Jugador jugador;
	LinkedList<Entidad> entidades;
	int cantEnemigos, cantObstaculos;
	
	public abstract LinkedList<Entidad> crearEntidades();
	
	public abstract Jugador crearJugador();
	
}
