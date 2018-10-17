package Personajes;

import Colisionadores.Colisionador;

public class PowerUp extends Entidad{
	
	public PowerUp(int vida, int velocidad, int x, int y) {
		super(x,y);
		puntosDeMuerte=0;
	}

	public void serColisionado(Colisionador col) {
		col.afectarPowerUp(this);
	}

	public void mover() {
	}
	public void golpearPowerUp(Entidad e) {
		vida=0;
	}

	public void golpearJugador(Entidad j) {
	}

	public void golpearEnemigo(Entidad e) {
	}

	public void golpearObstaculoDestruible(Entidad o) {
	}

	
	public void golpearDisparo(Entidad d) {
	}

	public void golpearObstaculoBarricada(Entidad o) {
	}
	
}
