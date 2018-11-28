package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.*;
import Personajes.PowerUps.PowerUp;

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
	public void afectarObstaculoBarricada(ObstaculoBarricada o) {
	}
	public void afectarObstaculoDestruible(ObstaculoDestruible o) {
	}
	public void afectarDisparoJugador(DisparoJugador d) {	
		d.golpearObstaculoBarricada(obstaculo);
	}
	public void afectarDisparoEnemigo(DisparoEnemigo d) {
		d.golpearObstaculoBarricada(obstaculo);
	}
}
