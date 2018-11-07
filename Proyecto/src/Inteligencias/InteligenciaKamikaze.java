package Inteligencias;

import java.util.Random;

import Personajes.Enemigo;

public class InteligenciaKamikaze extends Inteligencia {
	protected Enemigo kamikaze;
	protected boolean enMovimiento=false;
	protected int random;
	
	public InteligenciaKamikaze(Enemigo k) {
		kamikaze=k;
		velocidad=10;
		pos=k.getPos();
		Random r= new Random();
		random =r.nextInt(6);
	}
	
	public void mover() {
		Random r= new Random();
		int n= r.nextInt(300);
		if(n==12||enMovimiento) {
			moverAux();
			enMovimiento=true;
		}
		if(kamikaze.getVida()<=50) {
			if(random==3) {
				Inteligencia inteligencia= new InteligenciaKamikazeRandom(kamikaze);
				inteligencia.setJuego(juego);
				kamikaze.setInteligencia(inteligencia);
			}
		}
	}

	protected void moverAux() {
		int y= juego.getJugador().getPos().y;
		if(pos.y-y>0)
			pos.setLocation(pos.x-velocidad, pos.y-velocidad/2);
		if(pos.y-y<0)
			pos.setLocation(pos.x-velocidad, pos.y+velocidad/2);
		if(pos.y-y==0)
			pos.setLocation(pos.x-velocidad, pos.y);
	}
}
