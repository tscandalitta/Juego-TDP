package Inteligencias;

import Personajes.Obstaculo;

public class InteligenciaObstaculo extends Inteligencia {
	protected Obstaculo obstaculo;
	
	public InteligenciaObstaculo(Obstaculo o) {
		obstaculo=o;
		pos=o.getPos();
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
