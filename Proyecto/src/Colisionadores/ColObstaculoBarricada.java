package Colisionadores;

import Personajes.Disparo;
import Personajes.Enemigo;
import Personajes.Jugador;
import Personajes.PowerUp;
import Personajes.Obstaculos.Obstaculo;
import Personajes.Obstaculos.ObstaculoBarricada;

public class ColObstaculoBarricada implements Colisionador {
	protected ObstaculoBarricada obstaculo;
	
	public ColObstaculoBarricada(ObstaculoBarricada o) {
		obstaculo=o;
	}
	@Override
	public void afectarJugador(Jugador j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectarEnemigo(Enemigo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectarObstaculoBarricada(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectarObstaculoDestruible(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectarDisparo(Disparo d) {
		// TODO Auto-generated method stub
		
	}

}
