package Personajes;

import java.awt.event.KeyEvent;


public class Jugador extends Entidad {
	private Disparador arma;
	private boolean premioActivado;
	
	public Jugador(int x,int y) {
		super(100,x,y);
		premioActivado=false;
	}
	public void disminuirVida(int n) {
		vida-=n;
		if(vida<=0)
			finJuego();	
	}
	public boolean activarPremio() {
		premioActivado=true;
	}
	public boolean desactivarPremio() {
		premioActivado=false;
	}
	
	protected void mover(int dir) {
		switch(dir) {
			case KeyEvent.VK_UP: 
				x+=velocidad;
				break;
			case KeyEvent.VK_DOWN:
				x-=velocidad;
				break;
		}
	}
}
