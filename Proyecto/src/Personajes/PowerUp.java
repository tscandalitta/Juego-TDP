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

	@Override
	public void golpearJugador(Entidad j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearEnemigo(Entidad e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearObstaculo(Entidad o) {
		// TODO Auto-generated method stub
		
	}

	
	public void golpearDisparo(Entidad d) {
		// TODO Auto-generated method stub
		
	}
	
}
