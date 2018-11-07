package Armas;

import Personajes.DisparoJugador;
import Personajes.Entidad;

public class ArmaHiperPotente extends Arma {

	public ArmaHiperPotente(Entidad j) {
		super(j, 60, 1000);
	}

	protected void crearDisparo(int damage) {
		DisparoJugador disparo= new DisparoJugador(damage, pos.x+40, pos.y+25);
		disparo.setSpriteHiperPoderoso();
		juego.agregarEntidad(disparo);
	}
}
