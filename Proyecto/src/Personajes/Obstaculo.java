package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.ColObstaculo;
import Colisionadores.Colisionador;

public class Obstaculo extends Entidad{
	public Obstaculo(int x, int y, int vida) {
		super(x,y);
		this.vida=vida;
		width=48;
		height=195;
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Sprites/obstaculo.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Sprites/obstaculo.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Sprites/obstaculo.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Sprites/obstaculo.png"));
		col= new ColObstaculo(this);
	}

	public void serColisionado(Colisionador col) {
		col.afectarObstaculo(this);
	}

	public void mover() {
	}
	public void golpearJugador(Jugador j) {
		j.golpearObstaculo(this);
	}
	public void golpearEnemigo(Enemigo e) {
		e.golpearObstaculo(this);
	}
	public void golpearDisparo(Disparo d) {
		d.golpearObstaculo(this);
	}
}
