package Personajes;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Jugador extends Entidad {
	
	public Jugador(int velocidad, int vida, int x,int y) {
		super(velocidad,vida,x,y);
		
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/homer1.png"));
	}
	
	
	
	public void mover(int dir) {
		switch(dir) {
			case KeyEvent.VK_UP : //Arriba
				pos.setLocation(pos.x, pos.y - velocidad);
				break;
			case KeyEvent.VK_DOWN : //Abajo
				pos.setLocation(pos.x, pos.y + velocidad);
				break;
		}
	//	cambiarGrafico(dir);
	}
	/**
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
	*/
}
