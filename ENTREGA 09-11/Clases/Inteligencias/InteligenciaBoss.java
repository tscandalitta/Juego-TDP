package Inteligencias;

import java.util.Random;

import Personajes.Boss;
import Personajes.DisparoEnemigo;

public class InteligenciaBoss extends Inteligencia {
	protected Boss boss;
	
	public InteligenciaBoss(Boss b) {
		boss=b;
		pos=b.getPos();
		velocidad=5;
	}
	
	public void mover() {
		pos.setLocation(pos.x,pos.y+velocidad);
		if(pos.y<10)
			velocidad=-velocidad;
		if(pos.y>400)
			velocidad=-velocidad;
		disparar();
	}
	
	private void disparar() {
		Random r= new Random();
		int n= r.nextInt(30);
		if(n==5) {
			DisparoEnemigo disparo1= new DisparoEnemigo(10,pos.x-5,pos.y+130);
			juego.agregarEntidad(disparo1);
			DisparoEnemigo disparo2= new DisparoEnemigo(10,pos.x-5,pos.y);
			juego.agregarEntidad(disparo2);
			DisparoEnemigo disparo3= new DisparoEnemigo(10,pos.x-5,pos.y+260);
			juego.agregarEntidad(disparo3);
		}
	}
	public void setInteligenciaDummy(Inteligencia i) {
		boss.setInteligencia(i);
	}
}
