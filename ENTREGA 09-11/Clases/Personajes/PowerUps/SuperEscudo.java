package Personajes.PowerUps;

import javax.swing.ImageIcon;

import Colisionadores.ColPowerUp;
import Escudos.EscudoSimple;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public class SuperEscudo extends PowerUp {

	public SuperEscudo(int x, int y) {
		super(x,y);
		width=30;
		height=32;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/escudo.png"));
		col= new ColPowerUp(this);
		inteligencia= new InteligenciaPowerUp(this);
	}

	public void realizarAccion(Entidad jugador) {
		jugador.setEscudo(new EscudoSimple(jugador));
	}
}
