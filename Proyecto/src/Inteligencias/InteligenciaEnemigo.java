package Inteligencias;

import java.util.Random;

import Personajes.DisparoEnemigo;
import Personajes.Enemigo;

public class InteligenciaEnemigo extends Inteligencia {
	protected Enemigo enemigo;
	protected int dx, dy, cambioInteligencia;
	
	public InteligenciaEnemigo(Enemigo e) {
		enemigo=e;
		pos=e.getPos();
		velocidad=3;
		dx=1;
		dy=1;
		Random r= new Random();
		cambioInteligencia =r.nextInt(5);
	}
	
	public void mover() {
		pos.setLocation(pos.x -dx*velocidad/2, pos.y - dy*velocidad);
		if(pos.y<-65)
			pos.y=660;
		if(pos.x<900)
			dx=-1;
		if(pos.x>1100)
			dx=1;
		disparar();
		if(enemigo.getVida()<=25) {
			if(cambioInteligencia==3) {
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
