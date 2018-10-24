package Inteligencias;

import Juego.Juego;
import Personajes.DisparoJugador;

public class InteligenciaDisparoJugador extends InteligenciaDisparo {
	
	public InteligenciaDisparoJugador(DisparoJugador d) {
		super(d);
		velocidad=20;   
	}
	
	public void mover() {
		pos.setLocation(pos.x + velocidad, pos.y);
	}
}
