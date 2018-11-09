package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.*;

public class ColObstaculoBarricada implements Colisionador {
	protected ObstaculoBarricada obstaculo;
	
	public ColObstaculoBarricada(ObstaculoBarricada o) {
		obstaculo=o;
	}
	
	public void afectarJugador(Entidad j) {
	}
	public void afectarEnemigo(Entidad e) {
		e.golpearObstaculoBarricada(obstaculo);
	}
	public void afectarPowerUp(Entidad p) {
	}
	public void afectarObstaculoBarricada(Entidad o) {
	}
	public void afectarObstaculoDestruible(Entidad o) {
	}
	public void afectarDisparoJugador(Entidad d) {	
		d.golpearObstaculoBarricada(obstaculo);
	}
	public void afectarDisparoEnemigo(Entidad d) {
		d.golpearObstaculoBarricada(obstaculo);
	}
}
