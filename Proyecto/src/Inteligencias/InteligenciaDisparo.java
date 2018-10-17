package Inteligencias;

import Personajes.Disparo;

public abstract class InteligenciaDisparo extends Inteligencia {
	protected Disparo disparo;
	
	protected InteligenciaDisparo(Disparo d) {
		disparo=d;
		pos=d.getPos();
	}

}
