package Personajes.PowerUps;

import javax.swing.ImageIcon;

import Colisionadores.ColPowerUp;
import GUI.HiloSuperDisparo;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public class SuperDisparo extends PowerUp{

	public SuperDisparo(int x, int y) {
		super(x,y);
		width=30;
		height=32;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/escudo.png"));
		col= new ColPowerUp(this);
		inteligencia= new InteligenciaPowerUp(this);
	}

	public void realizarAccion(Entidad e) {
		HiloSuperDisparo hilo= new HiloSuperDisparo(e);
		hilo.start();
	}
}
