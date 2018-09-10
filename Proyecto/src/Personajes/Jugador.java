package Personajes;

import java.awt.event.KeyEvent;

public class Jugador extends Entidad {

	protected Jugador(int x, int y) {
		super(x, y);
	}

	protected void mover(int dir) {
		switch(dir) {
			case KeyEvent.VK_UP: 
				x+=5;
				break;
			case KeyEvent.VK_DOWN:
				x-=5;
				break;
		}
	}
}
