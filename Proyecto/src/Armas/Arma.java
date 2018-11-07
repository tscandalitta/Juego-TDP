package Armas;

import java.awt.Point;

import Juego.Juego;
import Personajes.DisparoJugador;
import Personajes.Entidad;

public abstract class Arma {
	protected Juego juego;
	protected int contador, contadorDisparar, damage;
	protected Point pos;
	
	protected Arma(Entidad j, int cont, int dam) {
		contador=0;
		contadorDisparar=cont;
		damage=dam;
		pos=j.getPos();
	}
	public void setJuego(Juego j) {
		juego=j;
	}
	
	public void disparar(boolean disparar) {
		contador++;
		if(contador>=contadorDisparar && disparar) {
			crearDisparo(damage);
			contador=0;
		}
	}
	
	protected void crearDisparo(int damage) {
		DisparoJugador disparo= new DisparoJugador(damage, pos.x+40, pos.y+25);
		juego.agregarEntidad(disparo);
	}
}

