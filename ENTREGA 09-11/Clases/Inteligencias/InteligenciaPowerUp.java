package Inteligencias;

import Personajes.PowerUps.PowerUp;

public class InteligenciaPowerUp extends Inteligencia {
	protected PowerUp power;
	protected int limiteSup, limiteInf;
	protected int direccionY=1;
	
	public InteligenciaPowerUp(PowerUp p) {
		power=p;
		pos=p.getPos();
		velocidad=8;
		limiteSup=pos.y-30;
		limiteInf=pos.y+30;
	}
	public void mover() {
		pos.setLocation(pos.x - velocidad, pos.y+ direccionY*velocidad/2);
		if(pos.y<limiteSup)
			direccionY=1;
		if(pos.y>limiteInf)
			direccionY=-1;
	}
}
