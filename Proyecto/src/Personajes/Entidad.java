package Personajes;

import javax.swing.JLabel;

import Grafica.EntidadGrafica;

public abstract class Entidad {
	protected int vida;
	protected int x, y;
	
	protected EntidadGrafica grafico;
	
	protected Entidad(int vida, int x, int y) {
		this.x= x;
		this.y= y;
		this.grafico = null;
		this.vida=vida;
	}

	protected void colisionar() {}

	
	
	public int getVida() {
		return vida;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	protected abstract void mover(int dir);
	
	public JLabel getGrafico(){
	//	return this.grafico.getGrafico();
	}

}
