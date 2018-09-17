package Juego;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import GUI.GUI;
import Personajes.*;

public class Juego {
	private Jugador jugador;
	private ArrayList<Entidad> entidades;
	
	
	public Juego(GUI gui) {
		entidades= new ArrayList<Entidad>();
		jugador = new Jugador(20, 100, 20, 100);
		gui.add(jugador.getGrafico());
		for(int i=1; i<7; i++) {
			entidades.add(new Enemigo(20, 100, 1000, 90*i));
			gui.add(entidades.get(entidades.size()-1).getGrafico());
		}
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
