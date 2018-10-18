package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.ColJugador;
import Colisionadores.Colisionador;
import Inteligencias.InteligenciaJugador;
import Juego.Juego;
import Memento.Memento;

public class Jugador extends Entidad {
	protected InteligenciaJugador inteligencia;
	private int oportunidades;
	
	public Jugador(int x, int y) {
		super(x,y);
		oportunidades=1;
		vida=100;
		width=40;
		height=70;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/homer.png"));
		col=new ColJugador(this);
		inteligencia= new InteligenciaJugador(this);
	}
	
	public Memento crearMemento() {
		return new Memento(vida,pos.x,pos.y);
	}
	
	public void reestablecer(Memento m) {
		vida=m.getVida();
		pos.setLocation(m.getPos());
	}
	
	public void serColisionado(Colisionador col) {
		col.afectarJugador(this);
	}
 
	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
	}
	public InteligenciaJugador getInteligencia() {
		return inteligencia;
	}
	
	protected void disminuirVida(int damage) {
		vida-=damage;
		if(vida<=0) {
			vida=0;
			oportunidades--;
		}
	}
	
	public int getOportunidades() {
		return oportunidades;
	}
	public void setJuego(Juego j) {
		inteligencia.setJuego(j);
	}
	
	public void golpearPowerUp(Entidad e) {
	}
	public void golpearObstaculoDestruible(Entidad o) {
	}
	public void golpearEnemigo(Entidad e) {
	}
	public void golpearJugador(Entidad j) {
	}
	public void golpearDisparo(Entidad e) {
	}
	public void golpearObstaculoBarricada(Entidad o) {
	}
}
