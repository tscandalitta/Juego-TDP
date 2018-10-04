package Inteligencias;

import Personajes.PowerUp;

public class InteligenciaPowerUp extends Inteligencia {
	protected PowerUp power;
	
	public InteligenciaPowerUp(PowerUp p) {
		power=p;
		pos=p.getPos();
		velocidad=5;
	}
	public int mover() {
		pos.setLocation(pos.x - velocidad, pos.y);
		if(pos.x<0)
			power.golpearPowerUp(power);
		return 0;
	}

}
