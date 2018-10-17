package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.Obstaculo;

public class ColJugador implements Colisionador{
	protected Jugador jugador;
	
	public ColJugador(Jugador j) {
		jugador=j;
	}

	public void afectarJugador(Jugador j) {
	}

	public void afectarEnemigo(Enemigo e) {
		e.golpearJugador(jugador);
	}

	public void afectarPowerUp(PowerUp p) {
	}
	
	public void afectarDisparo(Disparo d) {
		d.golpearJugador(jugador);
	}

	public void afectarObstaculoBarricada(Obstaculo o) {
	}

	public void afectarObstaculoDestruible(Obstaculo o) {
	}
}
