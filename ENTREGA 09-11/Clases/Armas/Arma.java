package Armas;

import java.awt.Point;

import Juego.Juego;
import Personajes.DisparoJugador;
import Personajes.Entidad;

public abstract class Arma {
	protected Juego juego;
	protected int contador, limiteDisparo, damage;
	protected Point pos;
	
	protected Arma(Entidad jugador, int limite, int dam) {
		contador=0;
		limiteDisparo=limite;
		damage=dam;
		pos=jugador.getPos();
	}
	public void setJuego(Juego j) {
		juego=j;
	}
	
	public void disparar(boolean disparar) {
		contador++;
		if(contador>=limiteDisparo && disparar) {
			crearDisparo(damage);
			contador=0;
		}
	}
	
	protected void crearDisparo(int damage) {
		DisparoJugador disparo= new DisparoJugador(damage, pos.x+40, pos.y+25);
		juego.agregarEntidad(disparo);
	}
}

