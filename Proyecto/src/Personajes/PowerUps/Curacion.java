package Personajes.PowerUps;

import javax.swing.ImageIcon;

import Colisionadores.ColPowerUp;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public class Curacion extends PowerUp {
	
	public Curacion(int x, int y) {
		super(x,y);
		width=30;
		height=26;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/curacion.png"));
		col= new ColPowerUp(this);
		inteligencia= new InteligenciaPowerUp(this);
	}

	public void realizarAccion(Entidad e) {
		e.aumentarVida(100);
	}
}
