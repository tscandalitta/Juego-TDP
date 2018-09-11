package Juego;

import java.awt.event.KeyEvent;
import GUI.GUI;
import Personajes.Jugador;

public class Juego {
	private Jugador jugador;
	
	public Juego(GUI gui) {
		jugador = new Jugador(15, 100, 10, 100);
		gui.add(jugador.getGrafico());
	}
	
	public void mover(int dir){		
		int direccion=-1;
		
		switch (dir){
			case KeyEvent.VK_UP : //Arriba
				direccion = 0;
				break;
			case KeyEvent.VK_DOWN : //Abajo
				direccion = 1;
				break;
		}
		if(direccion!=-1)  //Si se apreta una tecla que no sea flecha, no realiza ninguna accion
			jugador.mover(direccion);
	}
}
