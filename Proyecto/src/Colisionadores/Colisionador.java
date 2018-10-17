package Colisionadores;

import Personajes.*;
import Personajes.Obstaculos.Obstaculo;

public interface Colisionador {
	
	public abstract void afectarJugador(Jugador j);
	public abstract void afectarEnemigo(Enemigo e);
	public abstract void afectarPowerUp(PowerUp p);
	public abstract void afectarObstaculoBarricada(Obstaculo o);
	public abstract void afectarObstaculoDestruible(Obstaculo o);
	public abstract void afectarDisparo(Disparo d);
}
