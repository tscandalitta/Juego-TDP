package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.Colisionador;

public class Enemigo extends Entidad{
	protected int damage;
	public Enemigo(int velocidad, int vida, int x, int y) {
		super(velocidad, vida, x, y);
		damage=10;
		width=40;
		height=66;
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Sprites/Kang.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Sprites/Kang.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Sprites/Kang.png"));
	}

	public void mover(int dir) {
		switch(dir) {
			case 0 : //Arriba
				pos.setLocation(pos.x, pos.y - velocidad);
				break;
			case 1 : //Abajo
				pos.setLocation(pos.x, pos.y + velocidad);
				break;
		}
		cambiarGrafico(dir);
	}

	public void serColisionado(Colisionador col) {
		col.afectarEnemigo(this);
	}

	public void golpearJugador(Entidad e) {
		e.disminuirVida(damage);
	}


	public void golpearEnemigo(Entidad e) {
	}


	public void golpearObstaculo(Entidad e) {
	}

}
