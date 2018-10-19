package Colisionadores;

import Personajes.Disparo;
import Personajes.Enemigo;
import Personajes.Jugador;
import Personajes.Obstaculos.Obstaculo;
import Personajes.Obstaculos.ObstaculoDestruible;
import Personajes.PowerUps.*;


public class ColObstaculoDestruible implements Colisionador {
	protected ObstaculoDestruible obstaculo;
	
	public ColObstaculoDestruible(ObstaculoDestruible o) {
		obstaculo=o;
	}

	public void afectarJugador(Jugador j) {
	}

	public void afectarEnemigo(Enemigo e) {
		e.golpearObstaculoDestruible(obstaculo);
	}

	public void afectarPowerUp(PowerUp p) {
	}

	public void afectarObstaculoBarricada(Obstaculo o) {
	}

	public void afectarObstaculoDestruible(Obstaculo o) {
	}

	public void afectarDisparoJugador(Disparo d) {	
		d.golpearObstaculoDestruible(obstaculo);
	}
	public void afectarDisparoEnemigo(Disparo d) {
		d.golpearObstaculoDestruible(obstaculo);
	}
}
