package Personajes;

import javax.swing.ImageIcon;
import Colisionadores.Colisionador;

public class Jugador extends Entidad {
	
	public Jugador(int velocidad, int vida, int x, int y) {
		super(velocidad,vida,x,y);
		width=40;
		height=70;
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Sprites/homer.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Sprites/homerAbajo.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Sprites/homer.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Sprites/homer.png"));
	}
	
	public void mover(int dir) {
		switch(dir) {
			case 0 : //Arriba
				pos.setLocation(pos.x, pos.y - velocidad);
				break;
			case 1 : //Abajo
				pos.setLocation(pos.x, pos.y + velocidad);
				break;
			case 2 : 
				pos.setLocation(pos.x - velocidad, pos.y);
				break;
			case 3 : 
				pos.setLocation(pos.x + velocidad, pos.y);
				break;
		}
		cambiarGrafico(dir);
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

	public void serColisionado(Colisionador col) {
		col.afectarJugador(this);
	}

	
}
