package Inteligencias;

import java.awt.event.KeyEvent;

import Juego.Juego;
import Personajes.DisparoJugador;
import Personajes.Jugador;

public class InteligenciaJugador extends Inteligencia {
	protected Jugador jugador;
	//protected Juego juego;
	protected int dy;
	protected int velocidad;
	protected int contadorDisparar;
	protected volatile boolean disparar;
	
	public InteligenciaJugador(Jugador j) {
		jugador=j;
		pos=j.getPos();
		velocidad=10;
		contadorDisparar=0;
		disparar=false;
	}
	
	public void mover() {
		pos.setLocation(pos.x, pos.y+dy);
        if (pos.y < 1) 
            pos.y = 1;
        
        if (pos.y > 600) 
            pos.y = 600;
	}
	
	public void disparar(int damage) {
		contadorDisparar++;
		if(contadorDisparar>=12 && disparar) {
			crearDisparo(damage);
			contadorDisparar=0;
		}
	}
	
	private void crearDisparo(int damage) {
		DisparoJugador disparo= new DisparoJugador(damage, pos.x+40, pos.y+25);
		juego.agregarEntidad(disparo);
	}
	 public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
        
	        case KeyEvent.VK_SPACE :
	        	disparar=true;
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
        	case KeyEvent.VK_SPACE :
        		disparar=false;
        		break;
			case KeyEvent.VK_UP : 
				dy = 0;
				break;
			case KeyEvent.VK_DOWN : 
				dy = 0;
				break;	
        }
    }
	 
}