package Inteligencias;

import Personajes.Enemigo;

public class InteligenciaEnemigo extends Inteligencia {
	protected Enemigo enemigo;
	protected int dx=1;
	protected int dy=1;
	public InteligenciaEnemigo(Enemigo e) {
		enemigo=e;
		pos=e.getPos();
		velocidad=5;
	}
	public void mover() {
		pos.setLocation(pos.x -dx*velocidad/2, pos.y - dy*velocidad);
		if(pos.y<-65)
			pos.y=660;
		if(pos.x<900)
			dx=-1;
		if(pos.x>1100)
			dx=1;
	}
}
