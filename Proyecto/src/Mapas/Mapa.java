package Mapas;

import java.util.LinkedList;

import Juego.Juego;
import Personajes.Entidad;
import Personajes.Jugador;
public abstract class Mapa {
	Jugador jugador;
	LinkedList<Entidad> entidades;
	int cantEnemigos, cantObstaculos, cantKamikazes;
	
	public abstract LinkedList<Entidad> crearEntidades();
	
	public abstract Jugador crearJugador();
	
	public abstract void mapaSiguiente(Juego juego);
}
