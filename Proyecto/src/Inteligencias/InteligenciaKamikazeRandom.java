package Inteligencias;

import Personajes.Enemigo;

public class InteligenciaKamikazeRandom extends InteligenciaKamikaze{
	protected int direccionY=1;
	protected int limiteSuperior, limiteInferior;
	
	public InteligenciaKamikazeRandom(Enemigo k) {
		super(k);
		//formula para generar un numero aleatorio dentro de un intervalo
		limiteSuperior = (int) Math.floor(Math.random()*(200-0+1)+0);
		limiteInferior = (int) Math.floor(Math.random()*(650-500+1)+500);
	}
	
	protected void moverAux() {
		pos.setLocation(pos.x -velocidad, pos.y - direccionY*velocidad);
		if(pos.y<limiteSuperior)
			direccionY=-direccionY;
		if(pos.y>limiteInferior)
			direccionY=-direccionY;
	}

}
