package Personajes.PowerUps;

import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public abstract class PowerUp extends Entidad{
	protected InteligenciaPowerUp inteligencia;
	
	protected PowerUp(int x, int y) {
		super(x,y);
		vida=50;
	}
	
	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
		if(pos.x<-10)
			vida=0;
	}
	
	public abstract void realizarAccion(Entidad e);
}