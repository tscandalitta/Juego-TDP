package Escudos;

import Personajes.Entidad;

public class SinEscudo extends Escudo{

	public SinEscudo(Entidad j) {
		super(j);
	}

	public void golpearEnemigo(Entidad e) {
		e.golpearJugador(jugador);
	}
	
}
