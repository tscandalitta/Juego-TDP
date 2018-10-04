package Inteligencias;

import Personajes.Disparo;

public abstract class InteligenciaDisparo extends Inteligencia {
	protected Disparo disparo;
	
	public InteligenciaDisparo(Disparo d) {
		disparo=d;
		pos=d.getPos();
		velocidad=15;
	}
	public abstract int mover();

}
