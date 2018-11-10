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
		x=1280;
	}
	
	protected void moverAux() {
	/**	x-=0.1;
		y=(int) (150*Math.sin(-x/20))+360;
		pos.setLocation(x, y);
		System.out.println(x+","+y);
		*/
		pos.setLocation(pos.x -velocidad, pos.y - direccionY*velocidad);
		if(pos.y<limiteSuperior)
			direccionY=-direccionY;
		if(pos.y>limiteInferior)
			direccionY=-direccionY;
		
	}

}
