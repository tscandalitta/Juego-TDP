package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.ColJugador;
import Colisionadores.Colisionador;
import Inteligencias.InteligenciaJugador;
import Juego.Juego;

public class Jugador extends Entidad {
	protected InteligenciaJugador inteligencia;
	
	int corX;
	int corY;
	public Jugador(int x, int y) {
		super(x,y);
		corX=x;
		corY=y;
		vida=100;
		width=40;
		height=70;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/homer.png"));
		col=new ColJugador(this);
		inteligencia= new InteligenciaJugador(this);
		
	}
	public Memento createMemento() {
		return new Memento(vida,corX,corY);	
	}
	public void setStateOfMemento(Memento m) {
		vida=m.getVida();
		pos=m.getPos();
	}
	public void serColisionado(Colisionador col) {
		col.afectarJugador(this);
	}
	public void golpearPowerUp(Entidad e) {
	}
	
	public void golpearObstaculo(Entidad o) {
	}
	
	public void golpearEnemigo(Enemigo e) {
		
	}

	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
	}
	
	public InteligenciaJugador getInteligencia() {
		return inteligencia;
	}
	
	public void setJuego(Juego j) {
		inteligencia.setJuego(j);
	}

	public void golpearJugador(Entidad j) {
	
	}

	public void golpearDisparo(Entidad e) {
	
	}

	@Override
	public void golpearEnemigo(Entidad e) {
		// TODO Auto-generated method stub
		
	}
}
