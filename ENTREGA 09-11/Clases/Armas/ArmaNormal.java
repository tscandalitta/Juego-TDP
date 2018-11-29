package Armas;

import java.awt.Point;

import Personajes.DisparoJugador;

public class ArmaNormal extends Arma {
	
	public ArmaNormal() {
	}
	
	public DisparoJugador crearDisparo(Point pos ) {
		DisparoJugador disparo= new DisparoJugador(40, pos.x+40, pos.y+25);
		return disparo;
	}
	
	public int getCadencia() {
		return 15;
	}
}
