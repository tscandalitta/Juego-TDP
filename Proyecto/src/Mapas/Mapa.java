package Mapas;

import java.util.LinkedList;
import Juego.Juego;
import Personajes.Entidad;
<<<<<<< HEAD
import Personajes.Jugador;
import Personajes.Memento;
public abstract class Mapa {
	Jugador jugador;
	Memento m;
=======

public abstract class Mapa {
>>>>>>> b93e9e96a3c1ba9cb1772fe7bbe369fd1b23c3bf
	LinkedList<Entidad> entidades;
	int cantEnemigos, cantObstaculos, cantKamikazes;
	
	public abstract LinkedList<Entidad> crearEntidades();
	
	public abstract void mapaSiguiente(Juego juego);
}
