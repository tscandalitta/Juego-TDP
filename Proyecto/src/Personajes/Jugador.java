package Personajes;

import javax.swing.ImageIcon;

import Armas.Arma;
import Armas.ArmaNormal;
import Colisionadores.ColJugador;
import Colisionadores.Colisionador;
import Escudos.SinEscudo;
import Inteligencias.InteligenciaJugador;
import Juego.Juego;
import Memento.Memento;

public class Jugador extends Entidad {
	protected InteligenciaJugador inteligencia;
	private int oportunidades;
	
	public Jugador(int x, int y) {
		super(x,y);
		oportunidades=3;
		width=40;
		height=70;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/homer.png"));
		col=new ColJugador(this);
		arma= new ArmaNormal(this);
		inteligencia= new InteligenciaJugador(this, arma);
		escudo= new SinEscudo(this);
		vida=100;
	}
	
	public Memento crearMemento() {
		return new Memento(vida,pos.x,pos.y);
	}
	
	public void reestablecer(Memento m) {
		vida=m.getVida();
		pos.setLocation(m.getPos());
	}
	
	public void serColisionado(Colisionador col) {
		col.afectarJugador(this);
	}
	
	public void setArma(Arma a) {
		arma=a;
		inteligencia.setArma(a);
	}
	public void setJuego(Juego j) {
		inteligencia.setJuego(j);
		arma.setJuego(j);
	}
	
	public void disparar() {
		inteligencia.disparar();
	}
	public void mover() {
		inteligencia.mover();
		actualizarGrafico();
	}
	public InteligenciaJugador getInteligencia() {
		return inteligencia;
	}
	
	public void disminuirVida(int damage) {
		vida-=damage;
		if(vida<=0) {
			vida=0;
			oportunidades--;
		}
	}
	
	public int getOportunidades() {
		return oportunidades;
	}
	
	
	public void golpearPowerUp(Entidad e) {
		e.golpearJugador(this);
	}
	
	public void golpearObstaculoDestruible(Entidad o) {
	}
	
	public void golpearEnemigo(Entidad e) {
		escudo.golpearEnemigo(e);
	}
	
	public void golpearJugador(Entidad j) {
	}
	
	public void golpearObstaculoBarricada(Entidad o) {
	}

	
	public void golpearDisparoJugador(Entidad d) {
	}

	public void golpearDisparoEnemigo(Entidad d) {
		d.golpearJugador(this);
	}
}
