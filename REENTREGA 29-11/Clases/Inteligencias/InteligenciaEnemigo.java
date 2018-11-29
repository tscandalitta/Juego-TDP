package Inteligencias;

import java.util.Random;
import Personajes.DisparoEnemigo;
import Personajes.Enemigo;

public class InteligenciaEnemigo extends Inteligencia {
	protected Enemigo enemigo;
	protected int direccionX, cambioInteligencia;
	
	public InteligenciaEnemigo(Enemigo e) {
		enemigo=e;
		pos=e.getPos();
		velocidad=3;
		direccionX=1;
		Random r= new Random();
		cambioInteligencia =r.nextInt(3);
	}
	
	/**
	 * Si direccionX es positivo, el enemigo se mueve hacia la izquierda, caso contrario se mueve a la derecha
	 */
	public void mover() {
		pos.setLocation(pos.x -direccionX*velocidad/2, pos.y -velocidad);
		if(pos.y<-65)
			pos.y=660;
		if(pos.x<900)
			direccionX=-1;
		if(pos.x>1100)
			direccionX=1;
		disparar();
		
	}
	
	public void verificarInteligencia() {
		if(enemigo.getVida()<=25) {
			if(cambioInteligencia==2) {
				Inteligencia inteligencia= new InteligenciaKamikazeEnemigoComun(enemigo);
				inteligencia.setJuego(juego);
				enemigo.setInteligencia(inteligencia);
			}
		}
	}
	
	private void disparar() {
		Random r= new Random();
		int n= r.nextInt(150);
		if(n==5) {
			DisparoEnemigo disparo= new DisparoEnemigo(10,pos.x-5,pos.y+30);
			juego.agregarEntidad(disparo);
		}
	}
}
