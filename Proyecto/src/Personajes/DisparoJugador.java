package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.ColDisparoJugador;
import Inteligencias.InteligenciaDisparoJugador;

public class DisparoJugador extends Disparo{
	public DisparoJugador(int x, int y) {
		super(x, y);
		width=28;
		height=28;
		damage=50;
		this.imagen= new ImageIcon(this.getClass().getResource("/Sprites/disparo.gif"));
		col= new ColDisparoJugador(this);
		inteligencia=new InteligenciaDisparoJugador(this);
	}
	
	public void golpearJugador(Entidad e) {
		this.vida=0;
	}
	public void golpearEnemigo(Entidad e) {
		e.disminuirVida(damage);	
		this.vida=0;
	}
	public void golpearObstaculo(Entidad e) {
		e.disminuirVida(damage);
		this.vida=0;
	}
	public void golpearPowerUp(Entidad e) {
		this.vida=0;
	}
	public void golpearDisparo(Entidad e) {
		vida=0;
	}

}
