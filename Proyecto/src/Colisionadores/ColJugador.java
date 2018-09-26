package Colisionadores;

import Personajes.*;

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

	public void afectarObstaculo(Obstaculo o) {
	}
	
	public void afectarDisparo(Disparo d) {
		d.golpearJugador(jugador);
	}
}
