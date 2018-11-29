package Armas;

import java.awt.Point;

import Personajes.DisparoJugador;

public class ArmaRapida extends Arma {

	public ArmaRapida() {
	}
	
	public DisparoJugador crearDisparo(Point pos) {
		DisparoJugador disparo= new DisparoJugador(25, pos.x+40, pos.y+25);
		disparo.setSpriteRapido();
		return disparo;
	}
	public int getCadencia() {
		return 5;
	}
}
