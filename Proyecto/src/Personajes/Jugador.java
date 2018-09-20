package Personajes;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import Colisionadores.Colisionador;

public class Jugador extends Entidad {
	
	public Jugador(int velocidad, int vida, int x,int y) {
		super(velocidad,vida,x,y);
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Sprites/homer.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Sprites/homer.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Sprites/homerAbajo.png"));
	}
	
	public void mover(int dir) {
		switch(dir) {
			case 1 : //Arriba
				pos.setLocation(pos.x, pos.y - velocidad);
				break;
			case 2 : //Abajo
				pos.setLocation(pos.x, pos.y + velocidad);
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

	@Override
	public void serColisionado(Colisionador col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearJugador(Entidad e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearEnemigo(Entidad e) {
		// TODO Auto-generated method stub
		
	}
}
