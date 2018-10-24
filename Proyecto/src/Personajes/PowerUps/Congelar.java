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
		width=30;
		height=49;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/focusyn.png"));
		col= new ColPowerUp(this);
		inteligencia= new InteligenciaPowerUp(this);
	}

	public void realizarAccion(Entidad e) {
		jugador=e;
		(new Thread(this)).start();
		
	}

	public void run() {
		Map<Entidad,Inteligencia> mapeoInteligencias= new HashMap<Entidad,Inteligencia>();
		if(juego==null)
			System.out.println("holaaaa");
		for(Entidad e: juego.getEntidades()) {
			e.setInteligenciaDummy(new InteligenciaDummy());
			mapeoInteligencias.put(e, e.getInteligencia());
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
		mapeoInteligencias.clear();
	}
	
}
