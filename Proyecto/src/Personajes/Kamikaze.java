package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.ColEnemigo;
import Colisionadores.Colisionador;
import Inteligencias.InteligenciaKamikaze;

public class Kamikaze extends Enemigo {
	protected InteligenciaKamikaze inteligencia;
	
	public Kamikaze(int x, int y) {
		super(x, y);
		vida=100;
		damage=50;
		width=40;
		height=66;
		puntosDeMuerte=150;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/enemigo2.png"));
		col= new ColEnemigo(this);
		inteligencia= new InteligenciaKamikaze(this);
	}


	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
		if(pos.x<-10)
			this.vida=0;
	}
	
	public void serColisionado(Colisionador col) {
		col.afectarEnemigo(this);
	}
	
	public void golpearJugador(Entidad e) {
		e.disminuirVida(damage);
		this.vida=0;
	}
	
	public void golpearEnemigo(Entidad e) {
	}
	
	public void golpearDisparo(Entidad d) {
		d.golpearEnemigo(this);
	}
	
	public void golpearObstaculo(Entidad e) {
		e.disminuirVida(damage);
		this.vida=0;
	}
	
	public void golpearPowerUp(Entidad e) {
	}
	
}
