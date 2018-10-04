package Personajes;

import Colisionadores.Colisionador;

public class Obstaculo extends Entidad{
	public Obstaculo(int x, int y) {
		super(x,y);
		vida=100;
	}

	public void serColisionado(Colisionador col) {
		col.afectarObstaculo(this);
	}

	public void mover() {
	}
}
