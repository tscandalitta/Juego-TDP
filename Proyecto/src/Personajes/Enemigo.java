package Personajes;

import javax.swing.ImageIcon;
import Colisionadores.ColEnemigo;
import Colisionadores.Colisionador;
import Inteligencias.InteligenciaEnemigo;

public class Enemigo extends Entidad{
	protected int damage;
	protected InteligenciaEnemigo inteligencia;
	public Enemigo(int x, int y, String icono) {
		super(x,y);
		vida=100;
		damage=10;
		width=40;
		height=66;
		this.imagen[0] = new ImageIcon(this.getClass().getResource(icono));
		this.imagen[1] = new ImageIcon(this.getClass().getResource(icono));
		this.imagen[2] = new ImageIcon(this.getClass().getResource(icono));
		col= new ColEnemigo(this);
		inteligencia= new InteligenciaEnemigo(this);
	}

	public void mover() {
		int dir=inteligencia.mover();
		cambiarGrafico(dir);
	}

	public void serColisionado(Colisionador col) {
		col.afectarEnemigo(this);
	}
	
	public void golpearJugador(Entidad e) {
		e.disminuirVida(damage);
	}
	public void golpearEnemigo(Entidad e) {
	//	e.disminuirVida(damage);
	}
	public void golpearObstaculo(Entidad e) {
	}
	public void golpearPowerUp(Entidad e) {
	}

}
