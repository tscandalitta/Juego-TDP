package Inteligencias;

import java.awt.event.KeyEvent;

import Juego.Juego;
import Personajes.Jugador;

public class InteligenciaJugador extends Inteligencia {
	protected Jugador jugador;
	protected Juego juego;
	protected int dy;
	protected int velocidad;
	
	public InteligenciaJugador(Jugador j) {
		jugador=j;
		pos=j.getPos();
		velocidad=10;
	}
	
	public void mover() {
		pos.setLocation(pos.x, pos.y+dy);
        if (pos.y < 1) 
            pos.y = 1;
        
        if (pos.y > 600) 
            pos.y = 600;
	}
	
	
	 public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
        
	        case KeyEvent.VK_SPACE :
	        	juego.crearDisparoJugador();
	        	break;
			case KeyEvent.VK_UP : 
				dy = -velocidad;
				break;
			case KeyEvent.VK_DOWN : 
				dy = velocidad;
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
        }

    }
    
    public void setJuego(Juego j) {
    	juego=j;
    }
	 
}
