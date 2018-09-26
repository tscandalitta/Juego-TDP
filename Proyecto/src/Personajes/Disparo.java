package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.Colisionador;

public class Disparo extends Entidad {
	private int damage;
	
	public Disparo(int velocidad,int vida,int x, int y, int damage) {
		super(velocidad,vida,x,y);
		this.damage=damage;
		imagen=new ImageIcon[3];
		this.imagen[0]= new ImageIcon(this.getClass().getResource("/Sprites/disparo.png"));
		this.imagen[1]= new ImageIcon(this.getClass().getResource("/Sprites/disparo.png"));
		this.imagen[2]= new ImageIcon(this.getClass().getResource("/Sprites/disparo.png"));
	}


	public void mover(int dir) {
		switch(dir) {
		case 0 : //Derecha
			pos.setLocation(pos.x - velocidad, pos.y);
			break;
		case 1 : //Izquierda
			pos.setLocation(pos.x + velocidad, pos.y);
			break;
		}
		super.cambiarGrafico(dir);
	}


	public void serColisionado(Colisionador col) {
		col.afectarDisparo(this);
	}

	public void golpearJugador(Entidad e) {
		e.disminuirVida(damage);		
	}

	public void golpearEnemigo(Entidad e) {
		e.disminuirVida(damage);		
	}

	public void golpearObstaculo(Entidad e) {
		e.disminuirVida(damage);
	}
}
