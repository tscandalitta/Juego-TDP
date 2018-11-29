package Inteligencias;

import java.util.Random;

import Personajes.Enemigo;

public class InteligenciaKamikaze extends Inteligencia {
	protected Enemigo kamikaze;
	protected boolean enMovimiento=false;
	protected int randomCambioInteligencia;
	
	public InteligenciaKamikaze(Enemigo k) {
		kamikaze=k;
		velocidad=8;
		pos=k.getPos();
		Random r1= new Random();
		randomCambioInteligencia =r1.nextInt(4);
	}
	
	public void mover() {
		Random r2= new Random();
		int n= r2.nextInt(300);
		if(n==12||enMovimiento) {
			moverAux();
			enMovimiento=true;
		}
		
	}

	public void verificarInteligencia() {
		if(kamikaze.getVida()<=50) {
			if(randomCambioInteligencia==3) {
				Inteligencia inteligencia= new InteligenciaKamikazeRandom(kamikaze);
				inteligencia.setJuego(juego);
				kamikaze.setInteligencia(inteligencia);
			}
		}
	}
	
	public void setInteligenciaDummy(Inteligencia i) {
		kamikaze.setInteligencia(i);
	}
	
	protected void moverAux() {
		int posYjugador= juego.getJugador().getPos().y;
		if(pos.y-posYjugador>0)
			pos.setLocation(pos.x-velocidad, pos.y-velocidad/2);
		if(pos.y-posYjugador<0)
			pos.setLocation(pos.x-velocidad, pos.y+velocidad/2);
		if(pos.y-posYjugador==0)
			pos.setLocation(pos.x-velocidad, pos.y);
	}
}
