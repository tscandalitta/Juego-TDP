package Colisionadores;

import Personajes.*;

public interface Colisionador {
	
	public abstract void afectarJugador(Jugador j);
	public abstract void afectarEnemigo(Enemigo e);
	public abstract void afectarPowerUp(PowerUp p);
	public abstract void afectarObstaculo(Obstaculo o);
	public abstract void afectarDisparo(Disparo d);
}
