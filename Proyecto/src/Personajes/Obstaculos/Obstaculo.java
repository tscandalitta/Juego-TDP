package Personajes.Obstaculos;

import Inteligencias.Inteligencia;
import Personajes.Entidad;

public abstract class Obstaculo extends Entidad{
	
	protected Obstaculo(int x, int y, int vida) {
		super(x,y);
		this.vida=vida;
	}

	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
	}
	
	public void setInteligenciaDummy(Inteligencia i) {
		inteligencia=i;
	}
}
