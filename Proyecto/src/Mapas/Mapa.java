package Mapas;

import java.util.LinkedList;
import Personajes.Entidad;

public abstract class Mapa {
	LinkedList<Entidad> entidades;
	int cantEnemigos, cantObstaculos, cantKamikazes;
	
	public abstract LinkedList<Entidad> crearEntidades();
	
	public abstract Mapa mapaSiguiente();
}
