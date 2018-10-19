package GUI;

import Juego.Juego;

public class Disparador extends Thread{
	private Juego juego;
	private volatile boolean hayJuego;
	public Disparador(Juego j) {
		juego=j;
		hayJuego=true;
	}
	
	public void run() {
		while(hayJuego){
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			juego.getJugador().disparar();
		}
	}
	
	public void finalizar() {
		hayJuego=false;
	}
}