package Personajes.PowerUps;

import javax.swing.ImageIcon;

import Colisionadores.ColPowerUp;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public class SuperDisparo extends PowerUp implements Runnable{
	
	
	public SuperDisparo(int x, int y) {
		super(x,y);
		width=30;
		height=60;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/superdisparo.png"));
		col= new ColPowerUp(this);
		inteligencia= new InteligenciaPowerUp(this);
	}

	public void realizarAccion(Entidad e) {
		jugador=e;
		(new Thread(this)).start();
	}

	public void run() {
		try {
			jugador.setDamage(jugador.getDamage()*2);
			Thread.sleep(5000);
			jugador.setDamage(jugador.getDamage()/2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
