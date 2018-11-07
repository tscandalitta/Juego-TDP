package Escudos;

import Personajes.Entidad;

public class EscudoSimple extends Escudo {
	
	public EscudoSimple(Entidad j) {
		super(j);
	}

	public void golpearEnemigo(Entidad e) {
		jugador.setEscudo(new SinEscudo(jugador));
		e.setVida(0);
	}

}
