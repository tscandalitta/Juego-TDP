package Inteligencias;

import Personajes.DisparoJugador;

public class InteligenciaDisparoJugador extends InteligenciaDisparo {
	
	public InteligenciaDisparoJugador(DisparoJugador d) {
		super(d);
	}
	
	public int mover() {
		pos.setLocation(pos.x + velocidad, pos.y);
		if(pos.x>1280)
			disparo.golpearDisparo(disparo);
		return 0;
	}
}
