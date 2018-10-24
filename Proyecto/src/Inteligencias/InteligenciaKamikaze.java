package Inteligencias;

import java.util.Random;

import Juego.Juego;
import Personajes.Enemigo;

public class InteligenciaKamikaze extends Inteligencia {
	protected Enemigo kamikaze;
	protected boolean enMovimiento=false;
	
	public InteligenciaKamikaze(Enemigo k) {
		kamikaze=k;
		velocidad=15;
		pos=k.getPos();
	}
	public void setJuego(Juego j) {
	}

	public void mover() {
		Random r= new Random();
		int n= r.nextInt(300);
		if(n==12||enMovimiento) {
			pos.setLocation(pos.x-velocidad, pos.y);
			enMovimiento=true;
		}
		
	}

}
