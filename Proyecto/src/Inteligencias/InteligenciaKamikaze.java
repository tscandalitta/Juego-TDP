package Inteligencias;

import java.util.Random;

import Personajes.Enemigo;

public class InteligenciaKamikaze extends Inteligencia {
	protected Enemigo kamikaze;
	protected boolean enMovimiento=false;
	
	public InteligenciaKamikaze(Enemigo k) {
		kamikaze=k;
		velocidad=25;
		pos=k.getPos();
	}

	public void mover() {
		Random r= new Random();
		int n= r.nextInt(200);
		if(n==12||enMovimiento) {
			pos.setLocation(pos.x-velocidad, pos.y);
			enMovimiento=true;
		}
		
	}

}
