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
		enemigo.golpearPowerUp(p);
	}
	
	public void afectarObstaculo(Obstaculo o) {	
		enemigo.golpearObstaculo(o);
	}
	
	public void afectarDisparo(Disparo d) {	
		d.golpearEnemigo(enemigo); //FRIENDLY FIRE
	}
}
