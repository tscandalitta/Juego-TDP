package Colisionadores;

import Personajes.Disparo;
import Personajes.Enemigo;
import Personajes.Entidad;
import Personajes.Jugador;
import Personajes.Obstaculos.Obstaculo;
import Personajes.Obstaculos.ObstaculoDestruible;
import Personajes.PowerUps.*;


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
