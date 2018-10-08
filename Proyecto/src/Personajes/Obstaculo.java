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
		puntosDeMuerte=0;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/obstaculo.png"));
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
	public void golpearDisparo(Entidad d) {
		d.golpearObstaculo(this);
	}

	@Override
	public void golpearJugador(Entidad j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearEnemigo(Entidad e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearPowerUp(Entidad p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearObstaculo(Entidad o) {
		// TODO Auto-generated method stub
		
	}

}
