package Personajes;

import Colisionadores.Colisionador;
import Inteligencias.InteligenciaDisparo;

public abstract class Disparo extends Entidad {
	protected int damage;
	protected InteligenciaDisparo inteligencia;
	protected Disparo(int x, int y) {
		super(x,y);
		vida=1;
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
