package Armas;

import java.awt.Point;

import Personajes.DisparoJugador;

public class ArmaPotente extends Arma {

	public ArmaPotente() {
	}

	public DisparoJugador crearDisparo(Point pos) {
		DisparoJugador disparo= new DisparoJugador(80, pos.x+40, pos.y+25);
		disparo.setSpritePoderoso();
		return disparo;
	}
	public int getCadencia() {
		return 30;
	}
}
