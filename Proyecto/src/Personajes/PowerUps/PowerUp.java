package Personajes.PowerUps;

import Colisionadores.Colisionador;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public abstract class PowerUp extends Entidad{
	protected InteligenciaPowerUp inteligencia;
	
	protected PowerUp(int x, int y) {
		super(x,y);
		vida=50;
	}
	
	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
		if(pos.x<-10)
			vida=0;
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
	
	public abstract void realizarAccion(Entidad e);
}