package Mapas;

import java.util.LinkedList;

import Personajes.Entidad;
import Personajes.Jugador;
import Personajes.Memento;
public abstract class Mapa {
	Jugador jugador;
	Memento m;
	LinkedList<Entidad> entidades;
	int cantEnemigos, cantObstaculos;
	
	public abstract LinkedList<Entidad> crearEntidades();
	
	public abstract Jugador crearJugador();
	
}
