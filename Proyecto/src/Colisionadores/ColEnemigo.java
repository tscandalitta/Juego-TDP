package Colisionadores;

import Personajes.*;

public class ColEnemigo implements Colisionador{
	protected Enemigo enemigo;
	
	public ColEnemigo(Enemigo e) {
		enemigo=e;
	}

	public void afectarJugador(Jugador j) {	
		enemigo.golpearJugador(j);
	}

	public void afectarEnemigo(Enemigo e) {
		enemigo.golpearEnemigo(e);
	}

	public void afectarPowerUp(PowerUp p) {	
	}
	
	public void afectarObstaculo(Obstaculo o) {	
	}
	
	public void afectarDisparo(Disparo d) {	
	}
}
