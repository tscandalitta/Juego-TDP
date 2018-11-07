package Personajes.PowerUps;

import javax.swing.ImageIcon;

import Armas.Arma;
import Armas.ArmaNormal;
import Armas.ArmaRapida;
import Colisionadores.ColPowerUp;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public class DisparoRapido extends PowerUp implements Runnable{

	public DisparoRapido(int x, int y) {
		super(x,y);
		width=40;
		height=24;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/powerupRapido.png"));
		col= new ColPowerUp(this);
		inteligencia= new InteligenciaPowerUp(this);
	}

	public void realizarAccion(Entidad e) { 
		jugador=e;
		(new Thread(this)).start();
	}

	public void run() {
		try {
			Arma a= new ArmaRapida(jugador);
			a.setJuego(juego);
			Arma armaOriginal= new ArmaNormal(jugador);
			armaOriginal.setJuego(juego);
			jugador.setArma(a);
			Thread.sleep(8000);
			jugador.setArma(armaOriginal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
