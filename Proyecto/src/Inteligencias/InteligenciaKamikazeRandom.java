package Inteligencias;

import Personajes.Enemigo;

public class InteligenciaKamikazeRandom extends InteligenciaKamikaze{
	protected int dy=1;
	protected int limiteSuperior, limiteInferior;
	public InteligenciaKamikazeRandom(Enemigo k) {
		super(k);
		limiteSuperior = (int) Math.floor(Math.random()*(200-0+1)+0);
		limiteInferior = (int) Math.floor(Math.random()*(650-500+1)+500);
	}
	
	protected void moverAux() {
		pos.setLocation(pos.x -velocidad, pos.y - dy*velocidad);
		if(pos.y<limiteSuperior)
			dy=-dy;
		if(pos.y>limiteInferior)
			dy=-dy;
	}

}
