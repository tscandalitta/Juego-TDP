package Personajes;

import javax.swing.ImageIcon;

import Colisionadores.ColDisparoJugador;
import Inteligencias.InteligenciaDisparoJugador;
import Juego.Juego;

public class DisparoJugador extends Disparo{
	public DisparoJugador(int x, int y) {
		super(x, y);
		width=28;
		height=15;
		damage=30;
		this.imagen[0]= new ImageIcon(this.getClass().getResource("/Sprites/disparo2.png"));
		this.imagen[1]= new ImageIcon(this.getClass().getResource("/Sprites/disparo2.png"));
		this.imagen[2]= new ImageIcon(this.getClass().getResource("/Sprites/disparo2.png"));
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
	}
	public void golpearDisparo(Entidad e) {
		vida=0;
	}
}
