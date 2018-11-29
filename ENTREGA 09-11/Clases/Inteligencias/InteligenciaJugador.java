package Inteligencias;

import java.awt.event.KeyEvent;
import Armas.Arma;
import Personajes.DisparoJugador;
import Personajes.Jugador;

public class InteligenciaJugador extends Inteligencia {
	protected Jugador jugador;
	protected int desplazamientoY;
	protected int velocidad;
	protected int contador;
	protected volatile boolean disparar;
	protected Arma arma;
	
	public InteligenciaJugador(Jugador j, Arma a) {
		jugador=j;
		pos=j.getPos();
		velocidad=10;
		disparar=false;
		arma=a;
		contador=0;
	}
	
	public void mover() {
		pos.setLocation(pos.x, pos.y+desplazamientoY);
        if (pos.y < 1) 
            pos.y = 1;
        
        if (pos.y > 600) 
            pos.y = 600;
	}
	
	public void disparar() {
		contador++;
		if(contador>=arma.getCadencia() && disparar) {
			DisparoJugador disparo= arma.crearDisparo(jugador.getPos());
			juego.agregarEntidad(disparo);
			contador=0;
		}
	}
	public void setArma(Arma a) {
		arma=a;
	}
	public void keyPressed(KeyEvent e) {
	    int key = e.getKeyCode();
	    switch (key){
	        case KeyEvent.VK_SPACE :
	        	disparar=true;
	        	break;
			case KeyEvent.VK_UP : 
				desplazamientoY = -velocidad;
				break;
			case KeyEvent.VK_DOWN : 
				desplazamientoY = velocidad;
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
				desplazamientoY = 0;
				break;
			case KeyEvent.VK_DOWN : 
				desplazamientoY = 0;
				break;	
        }
    } 
}