package Personajes.PowerUps;

import Armas.Arma;
import Armas.ArmaNormal;
import Juego.Juego;
import Personajes.Entidad;

public class HiloArmas extends Thread{
	private Juego juego;
	private Entidad jugador;
	private Arma arma;
	private int duracion;
	
	public HiloArmas(Juego j, Arma a, int duracion) {
		juego=j;
		jugador=juego.getJugador();
		arma=a;
		this.duracion=duracion;
	}
	

	public void run() {
		try {
			Arma armaOriginal= new ArmaNormal();
			jugador.setArma(arma);
			Thread.sleep(duracion);
			jugador.setArma(armaOriginal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}