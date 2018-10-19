package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.Obstaculo;
import Personajes.PowerUps.PowerUp;

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
	
	public void afectarDisparoJugador(Disparo d) {	
		jugador.golpearDisparoJugador(d);
	}
	public void afectarDisparoEnemigo(Disparo d) {
		jugador.golpearDisparoEnemigo(d);
	}

	public void afectarObstaculoBarricada(Obstaculo o) {
	}

	public void afectarObstaculoDestruible(Obstaculo o) {
	}

}
