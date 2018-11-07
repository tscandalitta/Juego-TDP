package Escudos;

import Personajes.Entidad;

public abstract class Escudo {
	protected Entidad jugador;
	
	public abstract void golpearEnemigo(Entidad e);
}
