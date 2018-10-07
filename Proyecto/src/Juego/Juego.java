package Juego;

import java.awt.Rectangle;
import java.util.LinkedList;
import GUI.GUI;
import GUI.HiloTiempo;
import Mapas.Mapa;
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
	
	
	public Juego(GUI gui, Mapa mapa) {
		jugador=mapa.crearJugador();
		jugador.setJuego(this);
		entidades=mapa.crearEntidades();
		entidadesAEliminar= new LinkedList<Entidad>();
		disparosPendientes= new LinkedList<Entidad>();
		this.gui=gui;
		
		iniciarGraficos();
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
		Rectangle r1= new Rectangle((int)e1.getPos().getX()+2,(int)e1.getPos().getY()+2,e1.getWidth()-2,e1.getHeight()-2);
		Rectangle r2= new Rectangle((int)e2.getPos().getX()+2,(int)e2.getPos().getY()+2,e2.getWidth()-2,e2.getHeight()-2);
		if(r1.intersects(r2)) {
			e1.colisionar(e2);
			System.out.println("e1 y e2 colisionan");
			gui.actualizarPuntajes();
		}
	}
	
	public int getVidaJugador() {
		return jugador.getVida();
	}
	
	private void iniciarGraficos() {
		gui.add(jugador.getGrafico());
		for(Entidad e: entidades)
			gui.add(e.getGrafico());
	}
}
