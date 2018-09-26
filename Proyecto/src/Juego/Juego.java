package Juego;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import GUI.GUI;
import Personajes.*;

public class Juego {
	private Jugador jugador;
	private LinkedList<Entidad> entidades;
	private LinkedList<Entidad> entidadesAEliminar;
	private GUI gui;
	private int puntaje=0;
	private int kills=0;
	
	
	public Juego(GUI gui) {
		entidades= new LinkedList<Entidad>();
		entidadesAEliminar= new LinkedList<Entidad>();
		this.gui=gui;
		jugador = new Jugador(10, 100, 20, 100);
		gui.add(jugador.getGrafico());
		for(int i=1; i<7; i++) {
			entidades.add(new Enemigo(5, 100, 1000, 90*i));
			gui.add(entidades.getLast().getGrafico());
		}
	}
	
	public void mover() {
		Random r=new Random();
		int dir=r.nextInt(2);
		for(Entidad e: entidades) 
			e.mover(dir);
	}
	
	public void mover(int dir){		
		int direccion=0;
		
		switch (dir){
			case KeyEvent.VK_UP : //Arriba
				direccion = 1;
				break;
			case KeyEvent.VK_DOWN : //Abajo
				direccion = 2;
				break;
		}
		if(direccion!=0)   //Si se apreta una tecla que no sea flecha, no realiza ninguna accion
			jugador.mover(direccion);
	}
	
	public void eliminarEntidades() {
		for(Entidad e: entidades) {
			if(e.getVida()==0) {
				entidadesAEliminar.add(e);
				gui.remove(e.getGrafico());
			}
		}
		eliminarAux();
	}
	private void eliminarAux() {
		for(Entidad e: entidadesAEliminar) {
		//	gui.remove(e.getGrafico());
			entidades.remove(e);
			entidadesAEliminar.remove(e);
			aumentarPuntaje(100);
			kills++;
		}
		gui.actualizarPuntajes();
	}
	
	public LinkedList<Entidad> getEntidades(){
		return entidades;
	}
	
	public LinkedList<Entidad> getEntidadesAEliminar(){
		return entidadesAEliminar;
	}
	
	public void aumentarPuntaje(int p) {
		puntaje+=p;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public int getKills() {
		return kills;
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
