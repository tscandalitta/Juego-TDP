package Personajes;

import Colisionadores.ColDisparoEnemigo;
import Colisionadores.Colisionador;
import Inteligencias.Inteligencia;

public class DisparoEnemigo extends Disparo{
	
	public DisparoEnemigo(int damage, int x, int y) {
		super(damage, x, y);
		col= new ColDisparoEnemigo(this);
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

	@Override
	public Inteligencia getInteligencia() {
		// TODO Auto-generated method stub
		return null;
	}
}
