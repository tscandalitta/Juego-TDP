package Personajes;

import java.util.Random;

import javax.swing.ImageIcon;

import Colisionadores.ColEnemigo;
import Inteligencias.InteligenciaKamikaze;
import Inteligencias.InteligenciaKamikazeRandom;
import Memento.Memento;

public class Kamikaze extends Enemigo {
	private Memento estadoInicial;
	
	public Kamikaze(int x, int y) {
		super(x, y);
		vida=200;
		damage=50;
		width=40;
		height=44;
		puntosDeMuerte=150;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/enemigo2.png"));
		col= new ColEnemigo(this);
		
		Random r= new Random();
		int n= r.nextInt(2);
		if(n==0)
			inteligencia= new InteligenciaKamikaze(this);
		if(n==1)
			inteligencia= new InteligenciaKamikazeRandom(this);
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
