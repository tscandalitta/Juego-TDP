package Escudos;

import Personajes.Entidad;

public class EscudoSimple extends Escudo {
	
	public EscudoSimple(Entidad j) {
		jugador=j;
	}

	public void golpearEnemigo(Entidad enemigo) {
		jugador.setEscudo(new SinEscudo(jugador));
		enemigo.setVida(0);
	}
}
