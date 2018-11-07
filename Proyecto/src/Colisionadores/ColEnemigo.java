package Colisionadores;

import Personajes.*;

public class ColEnemigo implements Colisionador{
	protected Enemigo enemigo;
	
	public ColEnemigo(Enemigo e) {
		enemigo=e;
	}

	public void afectarJugador(Entidad j) {	
		j.golpearEnemigo(enemigo);
	}

	public void afectarEnemigo(Entidad e) {
	}

	public void afectarPowerUp(Entidad p) {
	}
	
	public void afectarDisparoJugador(Entidad d) {	
		enemigo.golpearDisparoJugador(d);
	}
	public void afectarDisparoEnemigo(Entidad d) {
	}
	
	public void afectarObstaculoBarricada(Entidad o) {
	}

	public void afectarObstaculoDestruible(Entidad o) {
		enemigo.golpearObstaculoDestruible(o);
	}
}
