package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.Obstaculo;
import Personajes.PowerUps.PowerUp;


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

	public void afectarDisparoJugador(Disparo d) {
	}
	
	public void afectarDisparoEnemigo(Disparo d) {
		disparo.golpearDisparoEnemigo(d);
	}

	public void afectarObstaculoBarricada(Obstaculo o) {
		disparo.golpearObstaculoBarricada(o);
	}

	public void afectarObstaculoDestruible(Obstaculo o) {
		disparo.golpearObstaculoDestruible(o);
	}

}