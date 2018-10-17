package Inteligencias;

import Personajes.Obstaculos.ObstaculoDestruible;

public class InteligenciaObstaculoDestruible extends InteligenciaObstaculo {
	
	public InteligenciaObstaculoDestruible(ObstaculoDestruible o) {
		super(o);
		velocidad=3;
	}
	
	public void mover() {
		pos.setLocation(pos.x,pos.y-velocidad);
		if(pos.y<25)
			velocidad=-velocidad;
		if(pos.y>510)
			velocidad=-velocidad;
	}

}
