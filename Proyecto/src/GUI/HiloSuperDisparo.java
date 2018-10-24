package GUI;

import Personajes.Entidad;

public class HiloSuperDisparo extends Thread{
	private Entidad jugador;
	private int damage;
	
	public HiloSuperDisparo(Entidad e) {
		jugador=e;
		damage=jugador.getDamage();
	}
	
	public void run() {
		try {
			jugador.setDamage(damage*2);
			Thread.sleep(5000);
			jugador.setDamage(damage);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
