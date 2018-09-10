package Personajes;

import Grafica.EntidadGrafica;

public abstract class Entidad {
	protected int vida;
	protected int x, y;
	
	protected EntidadGrafica grafico;
	
	protected Entidad(int x, int y) {
		this.x= x;
		this.y= y;
		this.grafico = null;
	}
	
	public int getVida() {
		return vida;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	protected void mover(int dir){
		
	}
}
