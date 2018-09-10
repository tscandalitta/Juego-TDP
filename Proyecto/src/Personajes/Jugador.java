package Personajes;

import java.awt.event.KeyEvent;

public class Jugador extends Entidad {

	protected Jugador(int x, int y) {
		super(100,x, y);
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
