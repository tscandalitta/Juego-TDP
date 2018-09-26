package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.ColDisparoJugador;

public class DisparoJugador extends Disparo{

	public DisparoJugador(int velocidad, int damage, int x, int y) {
		super(velocidad, damage, x, y);
		width=40;
		height=40;
		this.imagen[0]= new ImageIcon(this.getClass().getResource("/Sprites/disparo.png"));
		this.imagen[1]= new ImageIcon(this.getClass().getResource("/Sprites/disparo.png"));
		this.imagen[2]= new ImageIcon(this.getClass().getResource("/Sprites/disparo.png"));
		col= new ColDisparoJugador(this);
	}
	
	public void golpearJugador(Entidad e) {
		e.disminuirVida(damage);
	}
	public void golpearEnemigo(Entidad e) {
		e.disminuirVida(damage);	
	}
	public void golpearObstaculo(Entidad e) {
		e.disminuirVida(damage);
	}
	public void golpearPowerUp(Entidad e) {
	}
}
