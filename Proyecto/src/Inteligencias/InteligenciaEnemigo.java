package Inteligencias;

import java.util.Random;

import Juego.Juego;
import Personajes.DisparoEnemigo;
import Personajes.Enemigo;

public class InteligenciaEnemigo extends Inteligencia {
	protected Enemigo enemigo;
	protected int dx=1;
	protected int dy=1;
	
	public InteligenciaEnemigo(Enemigo e) {
		enemigo=e;
		pos=e.getPos();
		velocidad=3;
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
	}
	private void disparar() {
		Random r= new Random();
		int n= r.nextInt(100);
		if(n==5) {
			DisparoEnemigo disparo= new DisparoEnemigo(10,pos.x-5,pos.y+30);
			juego.agregarEntidad(disparo);
		}
	}
}
