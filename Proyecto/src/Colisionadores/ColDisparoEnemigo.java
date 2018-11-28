package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.*;
import Personajes.PowerUps.PowerUp;

public class ColDisparoEnemigo implements Colisionador{
	protected Disparo disparo;
	
	public ColDisparoEnemigo(Disparo d) {
		disparo=d;
	}
	
	public void afectarJugador(Jugador j) {
		disparo.golpearJugador(j);
	}
	public void afectarEnemigo(Enemigo e) {
	}
	public void afectarPowerUp(PowerUp p) {	
		disparo.golpearPowerUp(p);
	}
	public void afectarDisparoJugador(DisparoJugador d) {
		disparo.golpearDisparoJugador(d);
	}
	public void afectarDisparoEnemigo(DisparoEnemigo d) {
	}
	public void afectarObstaculoBarricada(ObstaculoBarricada o) {
	}
	public void afectarObstaculoDestruible(ObstaculoDestruible o) {
		disparo.golpearObstaculoDestruible(o);
	}
}
