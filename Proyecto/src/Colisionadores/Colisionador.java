package Colisionadores;

import Personajes.*;

public abstract class Colisionador {
	protected Entidad miEntidad;
	
	protected Colisionador(Entidad ent) {
		miEntidad=ent;
	}
	
	public abstract void afectarJugador(Jugador j);
	public abstract void afectarEnemigo(Enemigo e);
	
}
