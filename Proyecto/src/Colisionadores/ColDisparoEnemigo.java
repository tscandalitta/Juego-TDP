package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.Obstaculo;

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
	}
	
	public void afectarDisparo(Disparo d) {		
	}

	public void afectarObstaculoBarricada(Obstaculo o) {
	}

	public void afectarObstaculoDestruible(Obstaculo o) {
	}

}
