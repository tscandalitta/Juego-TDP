package Personajes;

import javax.swing.ImageIcon;
import Colisionadores.ColEnemigo;
import Colisionadores.Colisionador;
import Inteligencias.InteligenciaEnemigo;

public class Enemigo extends Entidad{
	protected int damage;
	protected InteligenciaEnemigo inteligencia;
	public Enemigo(int x, int y) {
		super(x,y);
		vida=100;
		damage=10;
		width=40;
		height=55;
		puntosDeMuerte=100;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/enemigo1.gif"));
		col= new ColEnemigo(this);
		inteligencia= new InteligenciaEnemigo(this);
	}

	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
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
	public void golpearObstaculoDestruible(Entidad e) {
		e.disminuirVida(damage);
	}
	public void golpearPowerUp(Entidad e) {
	}

	public void golpearObstaculoBarricada(Entidad o) {
	}
}
