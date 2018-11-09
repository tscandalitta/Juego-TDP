package Personajes.PowerUps;

import javax.swing.ImageIcon;

import Armas.ArmaHiperPotente;
import Colisionadores.ColPowerUp;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public class HiperDisparo extends PowerUp{

	public HiperDisparo(int x, int y) {
		super(x,y);
		width=30;
		height=60;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/superdisparo.png"));
		col= new ColPowerUp(this);
		inteligencia= new InteligenciaPowerUp(this);
	}

	public void realizarAccion(Entidad jugador) {
		int duracion=6000;
		HiloArmas hilo= new HiloArmas(juego, new ArmaHiperPotente(jugador), duracion);
		hilo.start();
	}

}
