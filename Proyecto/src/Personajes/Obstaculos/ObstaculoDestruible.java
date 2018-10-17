package Personajes.Obstaculos;

import javax.swing.ImageIcon;

import Colisionadores.ColObstaculoDestruible;
import Colisionadores.Colisionador;
import Inteligencias.InteligenciaObstaculoDestruible;
import Personajes.Entidad;

public class ObstaculoDestruible extends Obstaculo{

	public ObstaculoDestruible(int x, int y, int vida) {
		super(x, y, vida);
		width=40;
		height=115;
		puntosDeMuerte=5;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/destruible.png"));
		col= new ColObstaculoDestruible(this);
		inteligencia=new InteligenciaObstaculoDestruible(this);
	}

	public void serColisionado(Colisionador col) {
		col.afectarObstaculoDestruible(this);
	}
	
	public void golpearJugador(Entidad j) {
		j.golpearObstaculoDestruible(this);
	}
	public void golpearEnemigo(Entidad e) {
		e.golpearObstaculoDestruible(this);
	}
	public void golpearDisparo(Entidad d) {
		d.golpearObstaculoDestruible(this);
	}

	public void golpearPowerUp(Entidad p) {
	}

	public void golpearObstaculoBarricada(Entidad o) {
	}

	public void golpearObstaculoDestruible(Entidad o) {
	}

}
