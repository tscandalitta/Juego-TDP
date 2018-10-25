package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.Obstaculo;
import Personajes.PowerUps.PowerUp;


public class ColDisparoEnemigo implements Colisionador{
	protected Disparo disparo;
	
	public ColDisparoEnemigo(Disparo d) {
		disparo=d;
	}
	public void afectarJugador(Jugador j) {
		disparo.golpearJugador(j);
	}
	
	public void afectarEnemigo(Enemigo e) {
	}
	
	public void afectarPowerUp(PowerUp p) {	
		disparo.golpearPowerUp(p);
	}
	
	public void afectarDisparoJugador(Disparo d) {
		disparo.golpearDisparoJugador(d);
	}
	
	public void afectarDisparoEnemigo(Disparo d) {
	}

	public void afectarObstaculoBarricada(Obstaculo o) {
	}

	public void afectarObstaculoDestruible(Obstaculo o) {
		disparo.golpearObstaculoDestruible(o);
	}

}
