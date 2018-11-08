package Personajes;

import java.util.Random;

import javax.swing.ImageIcon;

import Inteligencias.InteligenciaBoss;
import Personajes.PowerUps.Congelar;
import Personajes.PowerUps.Curacion;
import Personajes.PowerUps.DisparoRapido;
import Personajes.PowerUps.HiperDisparo;
import Personajes.PowerUps.PowerUp;
import Personajes.PowerUps.SuperDisparo;
import Personajes.PowerUps.SuperEscudo;

public class Boss extends Enemigo {

	public Boss(int x, int y) {
		super(x,y);
		vida=30;
		damage=20;
		width=200;
		height=267;
		puntosDeMuerte=1000;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/boss.png"));
		inteligencia=new InteligenciaBoss(this);
	}
	
	public void disminuirVida(int damage) {
		super.disminuirVida(damage);
		lanzarPowerUp();
	}
	
	protected void lanzarPowerUp() {
		Random r= new Random();
		int n= r.nextInt(30);
		PowerUp powerup=null;
		switch(n) {
		case 1: 
			powerup= new Congelar(pos.x,pos.y);
			break;
		case 2:
			powerup= new Curacion(pos.x,pos.y);
			break;
		case 3:
			powerup= new SuperDisparo(pos.x,pos.y);
			break;
		case 4:
			powerup= new DisparoRapido(pos.x,pos.y);
			break;
		}
		if(powerup!=null) {
			powerup.setJuego(juego);
			juego.agregarEntidad(powerup);
		}
	}
}
