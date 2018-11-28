package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.*;
import Personajes.PowerUps.PowerUp;

public interface Colisionador {
	
	public abstract void afectarJugador(Jugador j);
	public abstract void afectarEnemigo(Enemigo e);
	public abstract void afectarPowerUp(PowerUp p);
	public abstract void afectarObstaculoBarricada(ObstaculoBarricada o);
	public abstract void afectarObstaculoDestruible(ObstaculoDestruible o);
	public abstract void afectarDisparoJugador(DisparoJugador d);
	public abstract void afectarDisparoEnemigo(DisparoEnemigo d);
}
