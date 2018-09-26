package Inteligencias;

import Personajes.DisparoJugador;

public class InteligenciaDisparoJugador extends Inteligencia {
	
	public InteligenciaDisparoJugador(DisparoJugador d) {
		entidad=d;
		pos=d.getPos();
		velocidad=10;
	}
	
	public void mover(int dir) {
		switch(dir) {
		case 0 : //Arriba
			pos.setLocation(pos.x + velocidad, pos.y);
			break;
		case 1 : //Abajo
			pos.setLocation(pos.x + velocidad, pos.y);
			break;
		}
	}
}
