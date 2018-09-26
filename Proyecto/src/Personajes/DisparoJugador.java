package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.ColDisparoJugador;
import Inteligencias.InteligenciaDisparoJugador;

public class DisparoJugador extends Disparo{

	public DisparoJugador(int velocidad, int damage, int x, int y) {
		super(velocidad, damage, x, y);
		width=20;
		height=37;
		this.imagen[0]= new ImageIcon(this.getClass().getResource("/Sprites/disparo.png"));
		this.imagen[1]= new ImageIcon(this.getClass().getResource("/Sprites/disparo.png"));
		this.imagen[2]= new ImageIcon(this.getClass().getResource("/Sprites/disparo.png"));
		col= new ColDisparoJugador(this);
		inteligencia=new InteligenciaDisparoJugador(this);
	}
	
	public void golpearJugador(Entidad e) {
		e.disminuirVida(damage);
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
	}
	public void golpearDisparo(Entidad e) {
	}
}
