package Personajes;

import Colisionadores.Colisionador;
import Inteligencias.InteligenciaDisparo;

public abstract class Disparo extends Entidad {
	protected int damage;
	protected InteligenciaDisparo inteligencia;
	protected Disparo(int velocidad, int damage, int x, int y) {
		super(velocidad,damage-1,x,y);
		this.damage=damage;
	}

	public void mover() {
		int dir=inteligencia.mover();
		cambiarGrafico(dir);
	}


	public void serColisionado(Colisionador col) {
		col.afectarDisparo(this);
	}

	public abstract void golpearJugador(Entidad e);
	public abstract void golpearEnemigo(Entidad e);
	public abstract void golpearObstaculo(Entidad e);
	public abstract void golpearPowerUp(Entidad e);
	public abstract void golpearDisparo(Entidad e);
}
