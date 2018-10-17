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
<<<<<<< HEAD
		if(pos.y>500)
=======
		if(pos.y>510)
>>>>>>> b93e9e96a3c1ba9cb1772fe7bbe369fd1b23c3bf
			velocidad=-velocidad;
	}

}
