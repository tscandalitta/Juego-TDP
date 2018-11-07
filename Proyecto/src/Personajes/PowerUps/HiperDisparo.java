package Personajes.PowerUps;

import javax.swing.ImageIcon;

import Armas.Arma;
import Armas.ArmaHiperPotente;
import Armas.ArmaNormal;
import Colisionadores.ColPowerUp;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public class HiperDisparo extends PowerUp implements Runnable {

	public HiperDisparo(int x, int y) {
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
			Arma a= new ArmaHiperPotente(jugador);
			a.setJuego(juego);
			Arma armaOriginal= new ArmaNormal(jugador);
			armaOriginal.setJuego(juego);
			jugador.setArma(a);
			Thread.sleep(7000);
			jugador.setArma(armaOriginal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
