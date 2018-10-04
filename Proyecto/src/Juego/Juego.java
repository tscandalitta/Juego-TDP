package Juego;

import java.awt.Rectangle;
import java.util.LinkedList;
import GUI.GUI;
import GUI.HiloTiempo;
import Personajes.*;

public class Juego {
	private Jugador jugador;
	private LinkedList<Entidad> entidades;
	private LinkedList<Entidad> entidadesAEliminar;
	private LinkedList<Entidad> disparosPendientes;
	private GUI gui;
	private int puntaje=0;
	private int kills=0;
	private HiloTiempo tiempo;
	
	
	public Juego(GUI gui) {
		entidades= new LinkedList<Entidad>();
		entidadesAEliminar= new LinkedList<Entidad>();
		disparosPendientes= new LinkedList<Entidad>();
		this.gui=gui;
		jugador = new Jugador(20, 100, this);
		gui.add(jugador.getGrafico());
		for(int i=1; i<9; i++) {
			entidades.add(new Enemigo(1000, 90*i,"/Sprites/enemigo2.png"));
			gui.add(entidades.getLast().getGrafico());
			entidades.add(new Enemigo(1150, 90*i+33,"/Sprites/enemigo1.gif"));
			gui.add(entidades.getLast().getGrafico());
		}   
	}
	
	public void setHilo(HiloTiempo tiempo) {
		this.tiempo=tiempo;
	}
	
	public void crearDisparo() {
		disparosPendientes.add(new DisparoJugador(jugador.getPos().x +50 ,jugador.getPos().y + 35));
	}
	
	public void agregarDisparos() {
		for(Entidad e: disparosPendientes) {
			entidades.add(e);
			gui.add(e.getGrafico());   
			disparosPendientes.remove(e);
		}
	}
	public void mover() {
		
		for(Entidad e: entidades) {
			e.mover();
		}
	}
	
	public void eliminarEntidades() {
		if(jugador.getVida()==0) {
			gui.remove(jugador.getGrafico());
			//System.exit(0);  //TEMPORAL
			tiempo.finalizar();
		}
		for(Entidad e: entidades) {     
			if(e.getVida()==0) {
				entidadesAEliminar.add(e);
			}
		}
		eliminarAux();
	}
	
	private void eliminarAux() {
		for(Entidad e: entidadesAEliminar) {
			gui.remove(e.getGrafico());
			entidades.remove(e);
			aumentarPuntaje(100);
			kills++;
		}
		entidadesAEliminar.clear();
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
	
	public Jugador getJugador() {
		return jugador;
	}
	
	public void colisionar() {
		for(int i=0; i<entidades.size();i++) {
			Entidad e1= entidades.get(i);
			verificarColision(e1,jugador);
			for(int j=i+1;j<entidades.size();j++) {
				Entidad e2=entidades.get(j);
				verificarColision(e1,e2);
			}
		}
	}
	
	private void verificarColision(Entidad e1, Entidad e2) {
		Rectangle r1= new Rectangle((int)e1.getPos().getX(),(int)e1.getPos().getY(),e1.getWidth(),e1.getHeight());
		Rectangle r2= new Rectangle((int)e2.getPos().getX(),(int)e2.getPos().getY(),e2.getWidth(),e2.getHeight());
		if(r1.intersects(r2)) {
			e1.colisionar(e2);
			gui.actualizarPuntajes();
		}
	}
	
	public int getVidaJugador() {
		return jugador.getVida();
	}
}
