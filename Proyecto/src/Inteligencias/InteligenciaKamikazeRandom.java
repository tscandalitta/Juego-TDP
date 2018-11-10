package Inteligencias;

import Personajes.Enemigo;

public class InteligenciaKamikazeRandom extends InteligenciaKamikaze{
	protected int direccionY=1;
	protected int limiteSuperior, limiteInferior;
	protected double x,y,t;
	
	public InteligenciaKamikazeRandom(Enemigo k) {
		super(k);
		t=610;
	}
	
	protected void moverAux() {
		t-=3;
		x=2*t;
		y= this.sinModified(t);
		pos.setLocation(x, y);
		if(pos.x<-10)
			t=610;
	}
	
	private double sinModified(double x) {
		return (175*Math.sin(-x/50))+360;
	}

}
