package Personajes;

import Colisionadores.ColDisparoEnemigo;

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
	
	public void golpearDisparo(Entidad d) {
	}

	public void golpearObstaculoBarricada(Entidad o) {
	}
}
