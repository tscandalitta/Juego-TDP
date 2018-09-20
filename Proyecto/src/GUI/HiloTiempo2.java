package GUI;

import Juego.Juego;

public class HiloTiempo2 extends Thread{
	private Juego juego;
	
	public HiloTiempo2(Juego j) {
		juego=j;
	}
	
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(!juego.getEntidades().isEmpty()) {
				juego.getEntidades().getFirst().setVida(0);
			}
		}
	}
}
