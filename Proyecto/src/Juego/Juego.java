package Juego;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import GUI.GUI;
import Personajes.*;

public class Juego {
	private Jugador jugador;
	private ArrayList<Entidad> enemigos;
	private ArrayList<Entidad> coleccionObstaculos;
	private ArrayList<Entidad> coleccionPremios;
	
	
	public Juego(GUI gui) {
		jugador = new Jugador(20, 100, 20, 100);
		gui.add(jugador.getGrafico());
	}
	
	public void mover(int dir){		
		int direccion=-1;
		
		switch (dir){
			case KeyEvent.VK_UP : //Arriba
				direccion = 0;
				break;
			case KeyEvent.VK_DOWN : //Abajo
				direccion = 1;
				break;
		}
		if(direccion!=-1)  //Si se apreta una tecla que no sea flecha, no realiza ninguna accion
			jugador.mover(direccion);
	}
	
	/**
	 * retorna true si dos entidades colisionan
	 */
	//public boolean entidadesColisionan(Point p) {}
	
	/**
	 * retorna true si el juego termino
	 */
	//public boolean consultarEstadoJuego() {}
}
