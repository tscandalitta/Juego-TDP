package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.ObstaculoBarricada;
import Personajes.Obstaculos.ObstaculoDestruible;
import Personajes.PowerUps.PowerUp;

public class ColEnemigo implements Colisionador{
	protected Enemigo enemigo;
	
	public ColEnemigo(Enemigo e) {
		enemigo=e;
	}

	public void afectarJugador(Jugador j) {	
		j.golpearEnemigo(enemigo);
	}
	public void afectarEnemigo(Enemigo e) {
	}
	public void afectarPowerUp(PowerUp p) {
	}	
	public void afectarDisparoJugador(DisparoJugador d) {	
		enemigo.golpearDisparoJugador(d);
	}
	public void afectarDisparoEnemigo(DisparoEnemigo d) {
	}
	public void afectarObstaculoBarricada(ObstaculoBarricada o) {
	}
	public void afectarObstaculoDestruible(ObstaculoDestruible o) {
		enemigo.golpearObstaculoDestruible(o);
	}
}
