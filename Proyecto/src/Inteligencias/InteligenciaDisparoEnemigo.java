package Inteligencias;

import Personajes.DisparoEnemigo;

public class InteligenciaDisparoEnemigo extends InteligenciaDisparo {

	public InteligenciaDisparoEnemigo(DisparoEnemigo d) {
		super(d);
	}
	
	public void mover() {
		pos.setLocation(pos.x - velocidad, pos.y);
		if(pos.x<0)
			disparo.golpearDisparo(disparo);
	}
}
