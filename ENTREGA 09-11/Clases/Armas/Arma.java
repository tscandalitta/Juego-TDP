package Armas;

import java.awt.Point;
import Personajes.DisparoJugador;

public abstract class Arma {
	
	public abstract DisparoJugador crearDisparo(Point pos);
	
	public abstract int getCadencia();
}

