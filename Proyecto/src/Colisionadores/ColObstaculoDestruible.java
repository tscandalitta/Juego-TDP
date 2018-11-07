package Colisionadores;

import Personajes.Entidad;
import Personajes.Obstaculos.ObstaculoDestruible;


public class ColObstaculoDestruible implements Colisionador {
	protected ObstaculoDestruible obstaculo;
	
	public ColObstaculoDestruible(ObstaculoDestruible o) {
		obstaculo=o;
	}

	public void afectarJugador(Entidad j) {
	}

	public void afectarEnemigo(Entidad e) {
		e.golpearObstaculoDestruible(obstaculo);
	}

	public void afectarPowerUp(Entidad p) {
	}

	public void afectarObstaculoBarricada(Entidad o) {
	}

	public void afectarObstaculoDestruible(Entidad o) {
	}

	public void afectarDisparoJugador(Entidad d) {	
		d.golpearObstaculoDestruible(obstaculo);
	}
	public void afectarDisparoEnemigo(Entidad d) {
		d.golpearObstaculoDestruible(obstaculo);
	}
}
