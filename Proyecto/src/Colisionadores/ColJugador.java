package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.ObstaculoBarricada;
import Personajes.Obstaculos.ObstaculoDestruible;
import Personajes.PowerUps.PowerUp;

public class ColJugador implements Colisionador{
	protected Jugador jugador;
	
	public ColJugador(Jugador j) {
		jugador=j;
	}

	public void afectarJugador(Jugador j) {
	}
	public void afectarEnemigo(Enemigo e) {
		jugador.golpearEnemigo(e);
	}
	public void afectarPowerUp(PowerUp p) {
	}
	public void afectarDisparoJugador(DisparoJugador d) {	
		jugador.golpearDisparoJugador(d);
	}
	public void afectarDisparoEnemigo(DisparoEnemigo d) {
		jugador.golpearDisparoEnemigo(d);
	}
	public void afectarObstaculoBarricada(ObstaculoBarricada o) {
	}
	public void afectarObstaculoDestruible(ObstaculoDestruible o) {
	}
}
