package Personajes.PowerUps;

import javax.swing.ImageIcon;

import Colisionadores.ColPowerUp;
import Inteligencias.Inteligencia;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public class Congelar extends PowerUp {

	public Congelar(int x, int y) {
		super(x,y);
		width=30;
		height=49;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/focusyn2.png"));
		col= new ColPowerUp(this);
		inteligencia= new InteligenciaPowerUp(this);
	}

	public void realizarAccion(Entidad e) {
		
	}
	
}
