package Armas;

import Personajes.DisparoJugador;
import Personajes.Entidad;

public class ArmaRapida extends Arma {

	public ArmaRapida(Entidad j) {
		super(j, 5, 20);
	}
	
	protected void crearDisparo(int damage) {
		DisparoJugador disparo= new DisparoJugador(damage, pos.x+40, pos.y+25);
		disparo.setSpriteRapido();
		juego.agregarEntidad(disparo);
	}

}
