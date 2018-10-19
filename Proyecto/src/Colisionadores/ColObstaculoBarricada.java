package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.*;
import Personajes.PowerUps.*;

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
	}

	public void afectarObstaculoBarricada(Obstaculo o) {
	}

	
	public void afectarObstaculoDestruible(Obstaculo o) {
	}

	
	public void afectarDisparoJugador(Disparo d) {	
		d.golpearObstaculoBarricada(obstaculo);
	}
	public void afectarDisparoEnemigo(Disparo d) {
		d.golpearObstaculoBarricada(obstaculo);
	}

}
