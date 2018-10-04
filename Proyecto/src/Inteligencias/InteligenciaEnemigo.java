package Inteligencias;

import Personajes.Enemigo;

public class InteligenciaEnemigo extends Inteligencia {
	protected Enemigo enemigo;
	protected int dir=1;
	public InteligenciaEnemigo(Enemigo e) {
		enemigo=e;
		pos=e.getPos();
		velocidad=5;
	}
	public int mover() {
		pos.setLocation(pos.x -dir*velocidad/2, pos.y - velocidad);
		if(pos.y<-65)
			pos.y=660;
		if(pos.x<900)
			dir=-1;
		if(pos.x>1100)
			dir=1;
		return 0; //grafico
	}
}
