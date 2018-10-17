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

	@Override
	public void serColisionado(Colisionador col) {
		// TODO Auto-generated method stub
		
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
	public void golpearObstaculoBarricada(Entidad o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearObstaculoDestruible(Entidad o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearDisparo(Entidad d) {
		// TODO Auto-generated method stub
		
	}

}
