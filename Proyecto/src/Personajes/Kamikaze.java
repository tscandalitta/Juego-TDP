package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.ColEnemigo;
import Inteligencias.InteligenciaKamikaze;
import Memento.Memento;

public class Kamikaze extends Enemigo {
	private Memento estadoInicial;
	
	public Kamikaze(int x, int y) {
		super(x, y);
		vida=100;
		damage=50;
		width=40;
		height=44;
		puntosDeMuerte=150;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/enemigo2.png"));
		col= new ColEnemigo(this);
		inteligencia= new InteligenciaKamikaze(this);
		crearMemento();
	}

	public void crearMemento() {
		estadoInicial= new Memento(vida,pos.x,pos.y);
	}
	
	public void reestablecer(Memento m) {
		pos.setLocation(m.getPos());
	}
	
	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
		if(pos.x<-10)
			reestablecer(estadoInicial);
	}
}
