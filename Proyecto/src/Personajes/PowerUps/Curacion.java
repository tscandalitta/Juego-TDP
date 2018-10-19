package Personajes.PowerUps;

import javax.swing.ImageIcon;

import Colisionadores.ColPowerUp;
import Colisionadores.Colisionador;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public class Curacion extends PowerUp {
	
	public Curacion(int x, int y) {
		super(x,y);
		width=30;
		height=49;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/focusyn2.png"));
		col= new ColPowerUp(this);
		inteligencia= new InteligenciaPowerUp(this);
	}

	public void golpearPowerUp(Entidad e) {
	}

	public void golpearJugador(Entidad j) {
		this.realizarAccion(j);
		this.vida=0;
	}

	public void golpearEnemigo(Entidad e) {
	}

	public void golpearObstaculoDestruible(Entidad o) {
	}

	public void golpearDisparoJugador(Entidad d) {
	}

	public void golpearDisparoEnemigo(Entidad e) {
		
	}
	
	public void golpearObstaculoBarricada(Entidad o) {
	}

	public void serColisionado(Colisionador col) {
		col.afectarPowerUp(this);
	}

	public void realizarAccion(Entidad e) {
		e.aumentarVida(100);
	}
}
