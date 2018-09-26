package Personajes;

import Colisionadores.Colisionador;

public class PowerUp extends Entidad{
	
	public PowerUp(int vida, int velocidad, int x, int y) {
		super(vida,velocidad,x,y);
	}

	public void serColisionado(Colisionador col) {
		col.afectarPowerUp(this);
		
	}

	public void mover(int dir) {
	}

}
