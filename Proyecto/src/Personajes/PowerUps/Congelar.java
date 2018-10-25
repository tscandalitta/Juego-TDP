package Personajes.PowerUps;

import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

import Colisionadores.ColPowerUp;
import Inteligencias.Inteligencia;
import Inteligencias.InteligenciaDummy;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public class Congelar extends PowerUp implements Runnable{

	public Congelar(int x, int y) {
		super(x,y);
		width=28;
		height=35;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/congelar.png"));
		col= new ColPowerUp(this);
		inteligencia= new InteligenciaPowerUp(this);
	}

	public void realizarAccion(Entidad e) {
		jugador=e;
		(new Thread(this)).start();
		
	}

	public void run() {
		Map<Entidad,Inteligencia> mapeoInteligencias= new HashMap<Entidad,Inteligencia>();
		synchronized(juego.getEntidades()) {
			for(Entidad e: juego.getEntidades()) { 
				mapeoInteligencias.put(e, e.getInteligencia());
				e.setInteligenciaDummy(new InteligenciaDummy());
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			for(Entidad e: juego.getEntidades()) {
				if(mapeoInteligencias.containsKey(e))
					e.setInteligencia(mapeoInteligencias.get(e));
			}
		}
		mapeoInteligencias.clear();
	}
	
}
