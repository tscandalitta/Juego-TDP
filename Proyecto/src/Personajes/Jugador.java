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
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Sprites/homer.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Sprites/homerAbajo.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Sprites/homer.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Sprites/homer.png"));
		col=new ColJugador(this);
		inteligencia= new InteligenciaJugador(this);
	}
	/**
	public void mover(int dir) {
		inteligencia.mover(dir);
		cambiarGrafico(dir);
	}*/
	
	public void serColisionado(Colisionador col) {
		col.afectarJugador(this);
	}
	public void golpearPowerUp(Entidad e) {
	}
	
	public void golpearObstaculo(Obstaculo o) {
		
	}
	
	public void golpearEnemigo(Entidad e) {
	}

	public void mover() {
		inteligencia.mover();
	}
	
	public InteligenciaJugador getInteligencia() {
		return inteligencia;
	}
	
	public void setJuego(Juego j) {
		inteligencia.setJuego(j);
	}
}
