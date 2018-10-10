package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.ColObstaculo;
import Colisionadores.Colisionador;
import Inteligencias.InteligenciaObstaculo;

public class Obstaculo extends Entidad{
	protected InteligenciaObstaculo inteligencia;
	public Obstaculo(int x, int y, int vida) {
		super(x,y);
		this.vida=vida;
		width=40;
		height=115;
		puntosDeMuerte=0;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/obstaculo.png"));
		col= new ColObstaculo(this);
		inteligencia=new InteligenciaObstaculo(this);
	}

	public void serColisionado(Colisionador col) {
		col.afectarObstaculo(this);
	}

	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
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

	public void golpearPowerUp(Entidad p) {
	}

	public void golpearObstaculo(Entidad o) {
	}

}
