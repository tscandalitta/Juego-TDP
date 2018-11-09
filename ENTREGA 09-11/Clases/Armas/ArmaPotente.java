package Armas;

import Personajes.DisparoJugador;
import Personajes.Entidad;

public class ArmaPotente extends Arma {

	public ArmaPotente(Entidad j) {
		super(j, 30, 65);
	}

	protected void crearDisparo(int damage) {
		DisparoJugador disparo= new DisparoJugador(damage, pos.x+40, pos.y+25);
		disparo.setSpritePoderoso();
		juego.agregarEntidad(disparo);
	}
}
