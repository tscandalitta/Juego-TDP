package Inteligencias;

import java.awt.event.KeyEvent;

import Armas.Arma;
import Juego.Juego;
import Personajes.DisparoJugador;
import Personajes.Jugador;

public class InteligenciaJugador extends Inteligencia {
	protected Jugador jugador;
	protected int dy;
	protected int velocidad;
	protected int contadorDisparar;
	protected volatile boolean disparar;
	protected Arma arma;
/////////TEMPORAL//////////SACAR BOOLEANO
	protected boolean tengoEscudo=false;
	
	public InteligenciaJugador(Jugador j, Arma a) {
		jugador=j;
		pos=j.getPos();
		velocidad=10;
		contadorDisparar=0;
		disparar=false;
		arma=a;
	}
	
	public void mover() {
		pos.setLocation(pos.x, pos.y+dy);
        if (pos.y < 1) 
            pos.y = 1;
        
        if (pos.y > 600) 
            pos.y = 600;
	}
	
	public void disparar() {
		arma.disparar(disparar);
	}
	public void setArma(Arma a) {
		arma=a;
	}
	public boolean tieneEscudo() {
		return tengoEscudo;
	}
	
	public void activarEscudo() {
		tengoEscudo=true;
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