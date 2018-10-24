package GUI;

import Juego.Juego;

public class HiloTiempo extends Thread{
	private Juego juego;
	private volatile boolean hayJuego;
	public HiloTiempo(Juego j) {
		juego=j;
		hayJuego=true;
	}
	
	public void run() {
		while(hayJuego){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			juego.getJugador().mover();
			juego.getJugador().disparar();
			juego.agregarEntidades();
			juego.mover();
			juego.colisionar();
			juego.eliminarEntidades();
			juego.verificarMapa();
		}
	}
	
	public void finalizar() {
		hayJuego=false;
	}
}
