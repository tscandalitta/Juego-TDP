package Colisionadores;

import Personajes.*;

public class ColDisparoJugador implements Colisionador{
	protected Disparo disparo;
	
	public ColDisparoJugador(Disparo d) {
		disparo=d;
	}

	public void afectarJugador(Jugador j) {
	}

	public void afectarEnemigo(Enemigo e) {
		disparo.golpearEnemigo(e);
	}

	public void afectarPowerUp(PowerUp p) {
	}

	public void afectarObstaculo(Obstaculo o) {
		disparo.golpearObstaculo(o);
	}

	public void afectarDisparo(Disparo d) {
	}

}