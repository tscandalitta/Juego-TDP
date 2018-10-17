package Personajes.Obstaculos;

import Inteligencias.InteligenciaObstaculo;
import Personajes.Entidad;

public abstract class Obstaculo extends Entidad{
	protected InteligenciaObstaculo inteligencia;
	public Obstaculo(int x, int y, int vida) {
		super(x,y);
		this.vida=vida;
	}

	

	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
	}
	

}
