package Colisionadores;

import Personajes.*;


public interface Colisionador {
	
	public abstract void afectarJugador(Entidad j);
	public abstract void afectarEnemigo(Entidad e);
	public abstract void afectarPowerUp(Entidad p);
	public abstract void afectarObstaculoBarricada(Entidad o);
	public abstract void afectarObstaculoDestruible(Entidad o);
	public abstract void afectarDisparoJugador(Entidad d);
	public abstract void afectarDisparoEnemigo(Entidad d);
}
