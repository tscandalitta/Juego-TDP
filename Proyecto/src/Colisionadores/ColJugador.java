package Colisionadores;

import Personajes.*;

public class ColJugador implements Colisionador{
	protected Jugador jugador;
	
	public ColJugador(Jugador j) {
		jugador=j;
	}

	public void afectarJugador(Entidad j) {
	}

	public void afectarEnemigo(Entidad e) {
		jugador.golpearEnemigo(e);
	}

	public void afectarPowerUp(Entidad p) {
	}
	
	public void afectarDisparoJugador(Entidad d) {	
		jugador.golpearDisparoJugador(d);
	}
	public void afectarDisparoEnemigo(Entidad d) {
		jugador.golpearDisparoEnemigo(d);
	}

	public void afectarObstaculoBarricada(Entidad o) {
	}

	public void afectarObstaculoDestruible(Entidad o) {
	}

}
