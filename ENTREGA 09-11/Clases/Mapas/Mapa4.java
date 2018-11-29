package Mapas;

import java.util.LinkedList;

import Juego.Juego;
import Personajes.Boss;
import Personajes.Entidad;

public class Mapa4 extends Mapa {

	public Mapa4(Juego j) {
		super(j);
	}
	
	public LinkedList<Entidad> crearEntidades() {
		entidades= new LinkedList<Entidad>();
		entidades.add(new Boss(900,200));
		return entidades;
	}
	public void mapaSiguiente() {
		juego.finalizar();
	}
}
