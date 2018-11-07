package Escudos;

import Personajes.Entidad;
import Personajes.Jugador;

public abstract class Escudo {
	protected Entidad jugador;
	
	protected Escudo(Entidad j) {
		jugador=j;
	}
	
	public abstract void golpearEnemigo(Entidad e);
}
