package Colisionadores;

import Personajes.Disparo;
import Personajes.Enemigo;
import Personajes.Jugador;
import Personajes.Obstaculos.Obstaculo;
import Personajes.Obstaculos.ObstaculoDestruible;
import Personajes.PowerUp;

public class ColObstaculoDestruible implements Colisionador {
	protected ObstaculoDestruible obstaculo;
	
	public ColObstaculoDestruible(ObstaculoDestruible o) {
		obstaculo=o;
	}

	public void afectarJugador(Jugador j) {
		obstaculo.golpearJugador(j);
		
	}

	public void afectarEnemigo(Enemigo e) {
		obstaculo.golpearEnemigo(e);
		
	}

	public void afectarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}

	public void afectarObstaculo(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

	public void afectarDisparo(Disparo d) {
		obstaculo.golpearDisparo(d);
		
	}

	@Override
	public void afectarObstaculoBarricada(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectarObstaculoDestruible(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}
}
