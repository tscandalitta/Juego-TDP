package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.Obstaculo;
import Personajes.PowerUps.PowerUp;

public class ColEnemigo implements Colisionador{
	protected Enemigo enemigo;
	
	public ColEnemigo(Enemigo e) {
		enemigo=e;
	}

	public void afectarJugador(Jugador j) {	
		enemigo.golpearJugador(j);
	}

	public void afectarEnemigo(Enemigo e) {
	}

	public void afectarPowerUp(PowerUp p) {
	}
	
	public void afectarDisparoJugador(Disparo d) {	
		enemigo.golpearDisparoJugador(d);
	}
	public void afectarDisparoEnemigo(Disparo d) {
	}
	
	public void afectarObstaculoBarricada(Obstaculo o) {
	}

	public void afectarObstaculoDestruible(Obstaculo o) {
		enemigo.golpearObstaculoDestruible(o);
	}
}
