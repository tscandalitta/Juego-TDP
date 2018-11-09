package Colisionadores;

import Personajes.Entidad;
import Personajes.PowerUps.PowerUp;

public class ColPowerUp implements Colisionador{
	protected PowerUp power;
	
	public ColPowerUp(PowerUp p) {
		power=p;
	}
	
	public void afectarJugador(Entidad j) {
		power.golpearJugador(j);
	}
	public void afectarEnemigo(Entidad e) {
	}
	public void afectarPowerUp(Entidad p) {
	}
	public void afectarDisparoJugador(Entidad d) {
		power.golpearDisparoJugador(d);
	}
	public void afectarDisparoEnemigo(Entidad d) {
	}
	public void afectarObstaculoBarricada(Entidad o) {
	}
	public void afectarObstaculoDestruible(Entidad o) {
	}
}
