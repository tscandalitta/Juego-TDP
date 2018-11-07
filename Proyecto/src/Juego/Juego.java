package Juego;

import java.awt.Rectangle;
import java.util.LinkedList;
import GUI.GUI;
import GUI.HiloTiempo;
import Mapas.*;
import Memento.Memento;
import Personajes.*;

public class Juego {
	private Jugador jugador;
	private LinkedList<Entidad> entidades;
	private LinkedList<Entidad> entidadesAEliminar;
	private LinkedList<Entidad> entidadesPendientes;
	private GUI gui;
	private int puntaje=0;
	private int kills=0;
	private HiloTiempo tiempo;
	private Mapa mapa;
	private Memento estadoInicialJugador;
	
	public Juego(GUI gui) {
		jugador=new Jugador(50,300);
		jugador.setJuego(this);
		estadoInicialJugador= jugador.crearMemento();
		this.mapa=new Mapa1(this);
		this.gui=gui;
		iniciarEntidades();
	}
	
	public void iniciarEntidades() {
		entidades= this.mapa.crearEntidades();
		entidadesAEliminar= new LinkedList<Entidad>();
		entidadesPendientes= new LinkedList<Entidad>();
		gui.add(jugador.getGrafico());
		if(entidades.size()==0) {
			jugador.disminuirVida(100);
			gui.remove(jugador.getGrafico());
			gui.ganar();
			tiempo.finalizar();
		}
		else
			for(Entidad e: entidades) {
				gui.add(e.getGrafico());
				e.setJuego(this);
			}
	}
	
	public void setHilo(HiloTiempo tiempo) {
		this.tiempo=tiempo;
	}
	
	public void agregarEntidad(Entidad e) {
			entidadesPendientes.add(e);
	}
	
	public void agregarEntidades() {
			for(Entidad e: entidadesPendientes) {
				entidades.add(e);
				gui.add(e.getGrafico());
			}
			entidadesPendientes.clear();
	}
	
	public void mover() {
		for(Entidad e: entidades) {
			e.mover();
		}
	}
	
	public void eliminarEntidades() {
		if(jugador.getVida()==0) {
			if(jugador.getOportunidades()!=0)
				jugador.reestablecer(estadoInicialJugador);
			else {
				gui.gameOver();
				gui.remove(jugador.getGrafico());
				tiempo.finalizar();
			}
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
			gui.repaint();
			entidades.remove(e);
			if(e.getPuntos()!=0) {
				aumentarPuntaje(e.getPuntos());
				kills++;
			}
		}
		entidadesAEliminar.clear();
		gui.actualizarPuntajes();
	}
	
	public void verificarMapa() {
		if(entidades.size()==0) {
			mapa= mapa.mapaSiguiente();
			iniciarEntidades();
		}
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
		Rectangle r1= new Rectangle(e1.getPos().x+2, e1.getPos().y+2, e1.getWidth()-2, e1.getHeight()-2);
		Rectangle r2= new Rectangle(e2.getPos().x+2, e2.getPos().y+2, e2.getWidth()-2, e2.getHeight()-2);
		if(r1.intersects(r2)) {
			e1.colisionar(e2);
			gui.actualizarPuntajes();
		}
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
	public LinkedList<Entidad> getEntidades(){
		return entidades;
	}
	public LinkedList<Entidad> getEntidadesAEliminar(){
		return entidadesAEliminar;
	}
}
