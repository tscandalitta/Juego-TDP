package Personajes;

import Colisionadores.ColDisparoEnemigo;
import Colisionadores.Colisionador;

public class DisparoEnemigo extends Disparo{
	
	public DisparoEnemigo(int x, int y) {
		super(x, y);
		col= new ColDisparoEnemigo(this);
		damage=10;
	}

	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
		if(pos.x<0)
			this.vida=0;
	}
	
	public void serColisionado(Colisionador col) {
		col.afectarDisparoEnemigo(this);
	}
	
	public void golpearJugador(Entidad e) {
		e.disminuirVida(damage);
		this.vida=0;
	}
	public void golpearEnemigo(Entidad e) {
		e.disminuirVida(damage);
		this.vida=0;	
	}
	public void golpearObstaculoDestruible(Entidad e) {
		e.disminuirVida(damage);
		this.vida=0;
	}
	public void golpearPowerUp(Entidad e) {
		e.disminuirVida(damage);
		this.vida=0;
	}

	public void golpearObstaculoBarricada(Entidad o) {
	}

	public void golpearDisparoJugador(Entidad d) {
	}

	public void golpearDisparoEnemigo(Entidad d) {
	}
}
