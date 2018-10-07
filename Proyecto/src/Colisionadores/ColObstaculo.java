package Colisionadores;

import Personajes.Disparo;
import Personajes.Enemigo;
import Personajes.Jugador;
import Personajes.Obstaculo;
import Personajes.PowerUp;

public class ColObstaculo implements Colisionador {
	protected Obstaculo obstaculo;
	
	public ColObstaculo(Obstaculo o) {
		obstaculo=o;
	}

	@Override
	public void afectarJugador(Jugador j) {
		obstaculo.golpearJugador(j);
		
	}

	@Override
	public void afectarEnemigo(Enemigo e) {
		obstaculo.golpearEnemigo(e);
		
	}

	@Override
	public void afectarPowerUp(PowerUp p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectarObstaculo(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afectarDisparo(Disparo d) {
		obstaculo.golpearDisparo(d);
		
	}
}
