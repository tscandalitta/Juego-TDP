package Inteligencias;

import Personajes.Obstaculo;

public class InteligenciaObstaculo extends Inteligencia {
	protected Obstaculo obstaculo;
	
	public InteligenciaObstaculo(Obstaculo o) {
		obstaculo=o;
		pos=o.getPos();
		velocidad=10;
	}
	
	public void mover() {
		pos.setLocation(pos.x,pos.y-velocidad);
		if(pos.y<25)
			velocidad=-velocidad;
		if(pos.y>500)
			velocidad=-velocidad;
	}

}
