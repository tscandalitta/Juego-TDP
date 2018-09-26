package Personajes;

import Colisionadores.Colisionador;

public abstract class Disparo extends Entidad {
	protected int damage;
	
	protected Disparo(int velocidad, int damage, int x, int y) {
		super(velocidad,1000,x,y);
		this.damage=damage;
	}

	public void mover(int dir) {
		switch(dir) {
		case 0 : //Derecha
			pos.setLocation(pos.x - velocidad, pos.y);
			break;
		case 1 : //Izquierda
			pos.setLocation(pos.x + velocidad, pos.y);
			break;
		}
		super.cambiarGrafico(dir);
	}


	public void serColisionado(Colisionador col) {
		col.afectarDisparo(this);
	}

	public abstract void golpearJugador(Entidad e);
	public abstract void golpearEnemigo(Entidad e);
	public abstract void golpearObstaculo(Entidad e);
	public abstract void golpearPowerUp(Entidad e);
}
