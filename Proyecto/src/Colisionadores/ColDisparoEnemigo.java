package Colisionadores;

import Personajes.*;

public class ColDisparoEnemigo extends Colisionador{
	
	public ColDisparoEnemigo(Entidad ent) {
		super(ent);
	}
	public void afectarJugador(Jugador j) {
		miEntidad.golpearJugador(j);
	}
	
	public void afectarEnemigo(Enemigo e) {
		miEntidad.golpearEnemigo(e);
	}

}
