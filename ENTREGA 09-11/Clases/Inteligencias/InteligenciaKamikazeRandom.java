package Inteligencias;

import Personajes.Enemigo;

public class InteligenciaKamikazeRandom extends InteligenciaKamikaze{
	protected int direccionY=1;
	protected int limiteSuperior, limiteInferior;
	protected int x,y,t;
	
	public InteligenciaKamikazeRandom(Enemigo k) {
		super(k);
		//formula para generar un numero aleatorio dentro de un intervalo
		limiteSuperior = (int) Math.floor(Math.random()*(200-0+1)+0);
		limiteInferior = (int) Math.floor(Math.random()*(650-500+1)+500);
	//	x=-t;
		//y=(int) Math.sin(-t);
	}
	
	protected void moverAux() {
		//t=(int) System.currentTimeMillis()/1000;
		//pos.setLocation(x, y);
		pos.setLocation(pos.x -velocidad, pos.y - direccionY*velocidad);
		if(pos.y<limiteSuperior)
			direccionY=-direccionY;
		if(pos.y>limiteInferior)
			direccionY=-direccionY;
	}

}
