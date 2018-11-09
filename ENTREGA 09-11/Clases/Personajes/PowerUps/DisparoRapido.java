package Personajes.PowerUps;

import javax.swing.ImageIcon;

import Armas.ArmaRapida;
import Colisionadores.ColPowerUp;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public class DisparoRapido extends PowerUp{

	public DisparoRapido(int x, int y) {
		super(x,y);
		width=40;
		height=24;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/powerupRapido.png"));
		col= new ColPowerUp(this);
		inteligencia= new InteligenciaPowerUp(this);
	}
	
	public void realizarAccion(Entidad jugador) {
		HiloArmas hilo= new HiloArmas(juego, new ArmaRapida(jugador), 6000);
		hilo.start();
	}
}
