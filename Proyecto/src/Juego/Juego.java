package Juego;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

import GUI.GUI;
import Personajes.*;

public class Juego {
	private Jugador jugador;
	private ArrayList<Entidad> entidades;
	
	
	
	public Juego(GUI gui) {
		entidades= new ArrayList<Entidad>();
		jugador = new Jugador(10, 100, 20, 100);
		gui.add(jugador.getGrafico());
		for(int i=1; i<7; i++) {
			entidades.add(new Enemigo(10, 100, 1000, 90*i));
			gui.add(entidades.get(entidades.size()-1).getGrafico());
		}
	}
	
	public void mover() {
		Random r= new Random();
		int dir= r.nextInt(2);
		for(int i=0; i< entidades.size(); i++) {
			entidades.get(i).mover(dir);
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
		if(direccion!=-1)   //Si se apreta una tecla que no sea flecha, no realiza ninguna accion
			jugador.mover(direccion);
	}
	
	public void eliminarEnemigo() {
			entidades.remove(0);
	}
	
	public ArrayList<Entidad> getEntidades(){
		return entidades;
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
