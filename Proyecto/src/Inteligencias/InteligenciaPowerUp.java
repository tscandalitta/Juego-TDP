package Inteligencias;

import Juego.Juego;
import Personajes.PowerUps.PowerUp;

public class InteligenciaPowerUp extends Inteligencia {
	protected PowerUp power;
	protected int limiteSup, limiteInf;
	protected int dir=1;
	
	public InteligenciaPowerUp(PowerUp p) {
		power=p;
		pos=p.getPos();
		velocidad=4;
		limiteSup=pos.y-30;
		limiteInf=pos.y+30;
	}
	public void mover() {
		pos.setLocation(pos.x - velocidad, pos.y+ dir*velocidad/2);
		if(pos.y<limiteSup)
			dir=1;
		if(pos.y>limiteInf)
			dir=-1;
	}
}
