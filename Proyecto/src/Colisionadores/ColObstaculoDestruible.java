package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.ObstaculoBarricada;
import Personajes.Obstaculos.ObstaculoDestruible;
import Personajes.PowerUps.PowerUp;


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
	public void afectarObstaculoBarricada(ObstaculoBarricada o) {
	}
	public void afectarObstaculoDestruible(ObstaculoDestruible o) {
	}
	public void afectarDisparoJugador(DisparoJugador d) {	
		d.golpearObstaculoDestruible(obstaculo);
	}
	public void afectarDisparoEnemigo(DisparoEnemigo d) {
		d.golpearObstaculoDestruible(obstaculo);
	}
}
