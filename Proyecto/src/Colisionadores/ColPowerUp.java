package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.ObstaculoBarricada;
import Personajes.Obstaculos.ObstaculoDestruible;
import Personajes.PowerUps.PowerUp;

public class ColPowerUp implements Colisionador{
	protected PowerUp power;
	
	public ColPowerUp(PowerUp p) {
		power=p;
	}
	
	public void afectarJugador(Jugador j) {
		power.golpearJugador(j);
	}
	public void afectarEnemigo(Enemigo e) {
	}
	public void afectarPowerUp(PowerUp p) {
	}
	public void afectarDisparoJugador(DisparoJugador d) {
		power.golpearDisparoJugador(d);
	}
	public void afectarDisparoEnemigo(DisparoEnemigo d) {
	}
	public void afectarObstaculoBarricada(ObstaculoBarricada o) {
	}
	public void afectarObstaculoDestruible(ObstaculoDestruible o) {
	}
}
