package Colisionadores;

import Personajes.*;

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
	
	public void afectarObstaculo(Obstaculo o) {		
	}
	
	public void afectarDisparo(Disparo d) {		
	}

}
