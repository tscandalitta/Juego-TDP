package Inteligencias;

import java.awt.event.KeyEvent;

import Juego.Juego;
import Personajes.Jugador;

public class InteligenciaJugador extends Inteligencia {
	protected Jugador jugador;
	protected Juego juego;
	protected int dx,dy;
	protected int velocidad;
	
	public InteligenciaJugador(Jugador j, Juego ju) {
		jugador=j;
		juego=ju;
		pos=j.getPos();
		velocidad=7;
	}
	
	public int mover() {
		pos.setLocation(pos.x+dx, pos.y+dy);
        if (pos.x < 1) {
            pos.x = 1;
        }

        if (pos.y < 1) {
            pos.y = 1;
        }
        if (pos.y > 600) {
            pos.y = 600;
        }
        jugador.cambiarGrafico(0);
		return 0;
	}
	
	
	 public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
        
	        case KeyEvent.VK_SPACE :
	        	juego.crearDisparo();
	        	break;
			case KeyEvent.VK_UP : 
				dy = -velocidad;
				break;
			case KeyEvent.VK_DOWN : 
				dy = velocidad;
				break;		
			case KeyEvent.VK_LEFT : 
				dx = -velocidad;
				break;
			case KeyEvent.VK_RIGHT : 
				dx = velocidad;
				break;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        switch (key){
        
			case KeyEvent.VK_UP : 
				dy = 0;
				break;
			case KeyEvent.VK_DOWN : 
				dy = 0;
				break;		
			case KeyEvent.VK_LEFT : 
				dx = 0;
				break;
			case KeyEvent.VK_RIGHT : 
				dx = 0;
				break;
        }

    }
	 
}
