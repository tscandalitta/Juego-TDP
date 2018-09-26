package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.Colisionador;

public class Enemigo extends Entidad{
	protected int damage;
	public Enemigo(int velocidad, int vida, int x, int y) {
		super(velocidad, vida, x, y);
		damage=10;
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

	@Override
	public void serColisionado(Colisionador col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearJugador(Entidad e) {
		e.disminuirVida(damage);
	}

	@Override
	public void golpearEnemigo(Entidad e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearObstaculo(Entidad e) {
		// TODO Auto-generated method stub
		
	}

}
