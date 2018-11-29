package Escudos;

import Personajes.Entidad;

public class SinEscudo extends Escudo{

	public SinEscudo(Entidad j) {
		jugador=j;
	}

	public void golpearEnemigo(Entidad enemigo) {
		enemigo.golpearJugador(jugador);
	}
}
