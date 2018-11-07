package Colisionadores;

import Personajes.*;


public class ColDisparoJugador implements Colisionador{
	protected Disparo disparo;
	
	public ColDisparoJugador(Disparo d) {
		disparo=d;
	}

	public void afectarJugador(Entidad j) {
	}

	public void afectarEnemigo(Entidad e) {
		disparo.golpearEnemigo(e);
	}

	public void afectarPowerUp(Entidad p) {
	}

	public void afectarDisparoJugador(Entidad d) {
	}
	
	public void afectarDisparoEnemigo(Entidad d) {
		disparo.golpearDisparoEnemigo(d);
	}

	public void afectarObstaculoBarricada(Entidad o) {
		disparo.golpearObstaculoBarricada(o);
	}

	public void afectarObstaculoDestruible(Entidad o) {
		disparo.golpearObstaculoDestruible(o);
	}

}