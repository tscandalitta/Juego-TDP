package Armas;

import java.awt.Point;

import Personajes.DisparoJugador;

public class ArmaHiperPotente extends Arma {

	public ArmaHiperPotente() {
	}

	public DisparoJugador crearDisparo(Point pos) {
		DisparoJugador disparo= new DisparoJugador(1000, pos.x+40, pos.y+25);
		disparo.setSpriteHiperPoderoso();
		return disparo;
	}
	
	public int getCadencia() {
		return 40;
	}
}
