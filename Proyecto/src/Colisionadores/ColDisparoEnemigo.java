package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.Obstaculo;
import Personajes.PowerUps.PowerUp;


public class ColDisparoEnemigo implements Colisionador{
	protected Disparo disparo;
	
	public ColDisparoEnemigo(Disparo d) {
		disparo=d;
	}
	public void afectarJugador(Entidad j) {
		disparo.golpearJugador(j);
	}
	
	public void afectarEnemigo(Entidad e) {
	}
	
	public void afectarPowerUp(Entidad p) {	
		disparo.golpearPowerUp(p);
	}
	
	public void afectarDisparoJugador(Entidad d) {
		disparo.golpearDisparoJugador(d);
	}
	
	public void afectarDisparoEnemigo(Entidad d) {
	}

	public void afectarObstaculoBarricada(Entidad o) {
	}

	public void afectarObstaculoDestruible(Entidad o) {
		disparo.golpearObstaculoDestruible(o);
	}

}
