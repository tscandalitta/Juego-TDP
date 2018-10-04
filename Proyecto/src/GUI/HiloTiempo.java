package GUI;

import Juego.Juego;

public class HiloTiempo extends Thread{
	private Juego juego;
	
	public HiloTiempo(Juego j) {
		juego=j;
	}
	
	public void run() {
		while(true){
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			juego.agregarDisparos();
			juego.mover();
			juego.colisionar();
			juego.eliminarEntidades();
		}
	}
}
