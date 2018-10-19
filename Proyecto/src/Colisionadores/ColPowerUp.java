package Colisionadores;

import Personajes.Disparo;
import Personajes.Enemigo;
import Personajes.Jugador;
import Personajes.Obstaculos.Obstaculo;
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
	
	public void afectarDisparoJugador(Disparo d) {
		power.golpearDisparoJugador(d);
	}
	
	public void afectarDisparoEnemigo(Disparo d) {
	}
	
	public void afectarObstaculoBarricada(Obstaculo o) {
	}

	public void afectarObstaculoDestruible(Obstaculo o) {
	}
	
}
