package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.ColDisparoJugador;
import Colisionadores.Colisionador;
import Inteligencias.InteligenciaDisparoJugador;

public class DisparoJugador extends Disparo{
	public DisparoJugador(int damage, int x, int y) {
		super(damage, x, y);
		width=28;
		height=28;  
		this.imagen= new ImageIcon(this.getClass().getResource("/Sprites/disparo.gif")); 
		col= new ColDisparoJugador(this);
		inteligencia=new InteligenciaDisparoJugador(this);
	}
	
	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
		if(pos.x>1280)
			this.vida=0;
	}
	
	public void serColisionado(Colisionador col) {
		col.afectarDisparoJugador(this);
	}
	
	public void golpearJugador(Entidad e) {
		this.vida=0;
	}
	
	public void golpearEnemigo(Entidad e) {
		e.disminuirVida(damage);	
		this.vida=0;
	}
	
	public void golpearObstaculoDestruible(Entidad o) {
		o.disminuirVida(damage);
		this.vida=0;
	}
	
	public void golpearPowerUp(Entidad e) {
		this.vida=0;
	}
	
	public void golpearObstaculoBarricada(Entidad o) {
		o.disminuirVida(damage);
		this.vida=0;
	}

	public void golpearDisparoJugador(Entidad d) {
	}

	public void golpearDisparoEnemigo(Entidad d) {
	}

}
