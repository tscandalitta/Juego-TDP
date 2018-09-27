package Inteligencias;

import Personajes.Jugador;

public class InteligenciaJugador extends Inteligencia {
	
	public InteligenciaJugador(Jugador j) {
		entidad=j;
		pos=j.getPos();
		velocidad=10;
	}
	public void mover(int dir) {
		switch(dir) {
		case 0 :
			pos.setLocation(pos.x, pos.y - velocidad);
			break;
		case 1 : 
			pos.setLocation(pos.x, pos.y + velocidad);
			break;
		case 2 : 
			pos.setLocation(pos.x - velocidad, pos.y);
			break;
		case 3 : 
			pos.setLocation(pos.x + velocidad, pos.y);
			break;
		}
	}
	
}
