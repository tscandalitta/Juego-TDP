package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.Obstaculo;
import Personajes.PowerUps.PowerUp;


public interface Colisionador {
	
	public abstract void afectarJugador(Jugador j);
	public abstract void afectarEnemigo(Enemigo e);
	public abstract void afectarPowerUp(PowerUp p);
	public abstract void afectarObstaculoBarricada(Obstaculo o);
	public abstract void afectarObstaculoDestruible(Obstaculo o);
	public abstract void afectarDisparoJugador(Disparo d);
	public abstract void afectarDisparoEnemigo(Disparo d);
}
