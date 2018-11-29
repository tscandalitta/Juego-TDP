package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.*;
import Personajes.PowerUps.PowerUp;


public class ColDisparoJugador implements Colisionador{
	protected Disparo disparo;
	
	public ColDisparoJugador(Disparo d) {
		disparo=d;
	}

	public void afectarJugador(Jugador j) {
	}
	public void afectarEnemigo(Enemigo e) {
		disparo.golpearEnemigo(e);
	}
	public void afectarPowerUp(PowerUp p) {
	}
	public void afectarDisparoJugador(DisparoJugador d) {
	}
	public void afectarDisparoEnemigo(DisparoEnemigo d) {
		disparo.golpearDisparoEnemigo(d);
	}
	public void afectarObstaculoBarricada(ObstaculoBarricada o) {
		disparo.golpearObstaculoBarricada(o);
	}
	public void afectarObstaculoDestruible(ObstaculoDestruible o) {
		disparo.golpearObstaculoDestruible(o);
	}
}