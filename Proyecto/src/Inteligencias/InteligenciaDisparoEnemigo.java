package Inteligencias;

import Personajes.DisparoEnemigo;

public class InteligenciaDisparoEnemigo extends InteligenciaDisparo {

	public InteligenciaDisparoEnemigo(DisparoEnemigo d) {
		super(d);
	}
	
	public int mover() {
		pos.setLocation(pos.x - velocidad, pos.y);
		if(pos.x<0)
			disparo.golpearDisparo(disparo);
		return 0;
	}
}
