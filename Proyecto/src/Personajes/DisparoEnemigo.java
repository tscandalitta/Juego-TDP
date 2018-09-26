package Personajes;

import Colisionadores.ColDisparoEnemigo;

public class DisparoEnemigo extends Disparo{
	
	public DisparoEnemigo(int velocidad, int damage, int x, int y) {
		super(velocidad, damage, x, y);
		col= new ColDisparoEnemigo(this);
	}

	public void golpearJugador(Entidad e) {
		e.disminuirVida(damage);
		this.vida=0;
	}
	public void golpearEnemigo(Entidad e) {
		e.disminuirVida(damage);
		this.vida=0;	
	}
	public void golpearObstaculo(Entidad e) {
		e.disminuirVida(damage);
		this.vida=0;
	}
	public void golpearPowerUp(Entidad e) {
		e.disminuirVida(damage);
		this.vida=0;
	}
	public void golpearDisparo(Entidad e) {
	}
}
