package Mapas;

import java.util.LinkedList;
import Personajes.Enemigo;
import Personajes.Entidad;
import Personajes.Jugador;
import Personajes.Obstaculo;

public class Mapa1 extends Mapa {
	
	public Mapa1() {
		cantEnemigos=9;
		cantObstaculos=0;
	}
	
	
	public LinkedList<Entidad> crearEntidades() {
		entidades= new LinkedList<Entidad>();
		for(int i=1; i<cantEnemigos; i++) {
			entidades.add(new Enemigo(1000, 90*i,"/Sprites/enemigo2.png"));
			entidades.add(new Enemigo(1150, 90*i+33,"/Sprites/enemigo1.gif"));
		}
		entidades.add(new Obstaculo(800,720/2,600));
		return entidades;
	}
	public Jugador crearJugador() {
		return new Jugador(20,300);
	}

}
