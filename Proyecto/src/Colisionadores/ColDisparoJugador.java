package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.Obstaculo;

public class ColDisparoJugador implements Colisionador{
	protected Disparo disparo;
	
	public ColDisparoJugador(Disparo d) {
		disparo=d;
	}

	public void afectarJugador(Jugador j) {
		disparo.golpearJugador(j);
	}

	public void afectarEnemigo(Enemigo e) {
		disparo.golpearEnemigo(e);
	}

	public void afectarPowerUp(PowerUp p) {
	}

	public void afectarDisparo(Disparo d) {
		disparo.golpearDisparo(d);
	}

	public void afectarObstaculoBarricada(Obstaculo o) {
	}

	public void afectarObstaculoDestruible(Obstaculo o) {
	}

}