package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.ColJugador;
import Colisionadores.Colisionador;
import Inteligencias.InteligenciaJugador;
import Juego.Juego;

public class Jugador extends Entidad {
	protected InteligenciaJugador inteligencia;
	
	public Jugador(int x, int y) {
		super(x,y);
		vida=100;
		width=40;
		height=70;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/homer.png"));
		col=new ColJugador(this);
		inteligencia= new InteligenciaJugador(this);
	}
	
	public void serColisionado(Colisionador col) {
		col.afectarJugador(this);
	}
	
	public void golpearPowerUp(Entidad e) {
	}
	
	public void golpearObstaculoDestruible(Entidad o) {
	}
	
	public void golpearEnemigo(Entidad e) {
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


	public void golpearObstaculoBarricada(Entidad o) {
	}
}
