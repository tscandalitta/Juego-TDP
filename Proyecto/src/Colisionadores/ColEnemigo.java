package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.Obstaculo;

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
	
	public void afectarDisparo(Disparo d) {	
		enemigo.golpearDisparo(d);
	}

	public void afectarObstaculoBarricada(Obstaculo o) {
		enemigo.golpearObstaculoBarricada(o);
	}

	public void afectarObstaculoDestruible(Obstaculo o) {
		enemigo.golpearObstaculoDestruible(o);
	}
}
