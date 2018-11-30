package Personajes.Obstaculos;

import javax.swing.ImageIcon;

import Colisionadores.ColObstaculoBarricada;
import Colisionadores.Colisionador;
import Inteligencias.InteligenciaObstaculoBarricada;
import Personajes.Entidad;

public class ObstaculoBarricada extends Obstaculo{
	
	public ObstaculoBarricada(int x, int y, int vida) {
		super(x, y, vida);
		width=25;
		height=138;
		puntosDeMuerte=25;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/barrera.png"));
		col= new ColObstaculoBarricada(this);
		inteligencia=new InteligenciaObstaculoBarricada(this);
	}

	public void serColisionado(Colisionador col) {
		col.afectarObstaculoBarricada(this);
	}
	
	public void golpearJugador(Entidad j) {
	}
	public void golpearEnemigo(Entidad e) {
	}
	public void golpearDisparoJugador(Entidad d) {
	}
	public void golpearDisparoEnemigo(Entidad e) {
	}
	public void golpearPowerUp(Entidad p) {
	}
	public void golpearObstaculoBarricada(Entidad o) {
	}
	public void golpearObstaculoDestruible(Entidad o) {
	}

}
