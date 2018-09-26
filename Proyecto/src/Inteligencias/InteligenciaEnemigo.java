package Inteligencias;

import Personajes.Enemigo;

public class InteligenciaEnemigo extends Inteligencia {
	
	public InteligenciaEnemigo(Enemigo e) {
		entidad=e;
		pos=e.getPos();
		velocidad=5;
	}
	
	public void mover(int dir) {
		switch(dir) {
		case 0 : //Arriba
			pos.setLocation(pos.x, pos.y - velocidad);
			break;
		case 1 : //Abajo
			pos.setLocation(pos.x, pos.y + velocidad);
			break;
		}
	}
}
