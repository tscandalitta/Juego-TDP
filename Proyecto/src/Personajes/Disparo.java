package Personajes;

import Colisionadores.Colisionador;
import Inteligencias.InteligenciaDisparo;

public abstract class Disparo extends Entidad {
	protected int damage;
	protected InteligenciaDisparo inteligencia;
	protected Disparo(int x, int y) {
		super(x,y);
		vida=1;
		puntosDeMuerte=0;
	}

	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
	}


	public void serColisionado(Colisionador col) {
		col.afectarDisparo(this);
	}
}
