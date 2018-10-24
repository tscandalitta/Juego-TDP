package Mapas;

import java.util.LinkedList;

import Personajes.Boss;
import Personajes.Entidad;

public class Mapa4 extends Mapa {

	
	public LinkedList<Entidad> crearEntidades() {
		entidades= new LinkedList<Entidad>();
		entidades.add(new Boss(900,200));
		return entidades;
	}

	
	public Mapa mapaSiguiente() {
		return new Mapa4();
	}

}
