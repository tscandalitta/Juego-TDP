package Colisionadores;

import Personajes.Disparo;
import Personajes.Enemigo;
import Personajes.Jugador;
import Personajes.PowerUp;
import Personajes.Obstaculos.Obstaculo;
import Personajes.Obstaculos.ObstaculoBarricada;

public class ColObstaculoBarricada implements Colisionador {
	protected ObstaculoBarricada obstaculo;
	
	public ColObstaculoBarricada(ObstaculoBarricada o) {
		obstaculo=o;
	}
	
	public void afectarJugador(Jugador j) {
	}

	
	public void afectarEnemigo(Enemigo e) {
		e.golpearObstaculoBarricada(obstaculo);
	}

	
	public void afectarPowerUp(PowerUp p) {
		p.golpearObstaculoBarricada(obstaculo);
	}

	public void afectarObstaculoBarricada(Obstaculo o) {
	}

	
	public void afectarObstaculoDestruible(Obstaculo o) {
	}

	
	public void afectarDisparo(Disparo d) {
		d.golpearObstaculoBarricada(obstaculo);
	}

}
