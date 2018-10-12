package Mapas;

import java.util.LinkedList;
import Juego.Juego;
import Personajes.Entidad;

public abstract class Mapa {
	LinkedList<Entidad> entidades;
	int cantEnemigos, cantObstaculos, cantKamikazes;
	
	public abstract LinkedList<Entidad> crearEntidades();
	
	public abstract void mapaSiguiente(Juego juego);
}
