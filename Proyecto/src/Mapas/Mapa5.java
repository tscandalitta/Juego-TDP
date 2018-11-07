package Mapas;

import java.util.LinkedList;

import Juego.Juego;
import Personajes.Entidad;

public class Mapa5 extends Mapa {
	
	public Mapa5(Juego j) {
		super(j);
	}
	
	public LinkedList<Entidad> crearEntidades() {
		return new LinkedList<Entidad>();
	}

	public Mapa mapaSiguiente() {
		return new Mapa5(juego);
	}
}
