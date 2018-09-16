package Colisionadores;

import Personajes.*;

public class ColDisparoJugador extends Colisionador{

	public ColDisparoJugador(Entidad ent) {
		super(ent);
	}

	public void afectarJugador(Jugador j) {
	}

	public void afectarEnemigo(Enemigo e) {
		miEntidad.golpearEnemigo(e);
	}

}