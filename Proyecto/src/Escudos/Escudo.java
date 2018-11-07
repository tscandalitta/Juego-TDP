package Escudos;

import Personajes.Entidad;

public abstract class Escudo {
	protected Entidad jugador;
	
	protected Escudo(Entidad j) {
		jugador=j;
	}
	
	public abstract void golpearEnemigo(Entidad e);
}
