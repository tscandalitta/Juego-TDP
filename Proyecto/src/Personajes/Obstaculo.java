package Personajes;

import Colisionadores.Colisionador;

public class Obstaculo extends Entidad{
	public Obstaculo(int vida, int velocidad, int x, int y) {
		super(vida,velocidad,x,y);
	}

	public void serColisionado(Colisionador col) {
		col.afectarObstaculo(this);
	}

	public void mover(int dir) {
	}
}
