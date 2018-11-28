package Personajes.PowerUps;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.ImageIcon;

import Colisionadores.ColPowerUp;
import Inteligencias.Inteligencia;
import Inteligencias.InteligenciaDummy;
import Inteligencias.InteligenciaPowerUp;
import Personajes.Entidad;

public class Congelar extends PowerUp implements Runnable{
	private static Congelar instancia;
	
	private Congelar(int x, int y) {
		super(x,y);
		width=28;
		height=35;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/congelar.png"));
		col= new ColPowerUp(this);
		inteligencia= new InteligenciaPowerUp(this);
	}
	
	public static Congelar getInstancia(int x, int y) {
		if(instancia==null) {
			instancia= new Congelar(x,y);
		}
		return instancia;
	}
	
	public void mover() {
		super.mover();
		if(pos.x<-10)
			instancia=null;
	}
	
	public void realizarAccion(Entidad jugador) {
		this.jugador=jugador;
		(new Thread(this)).start();
	}

	public void run() {
		Map<Entidad,Inteligencia> mapeoInteligencias= new HashMap<Entidad,Inteligencia>(); 
		@SuppressWarnings("unchecked")
		LinkedList<Entidad> lista= (LinkedList<Entidad>) juego.getEntidades().clone();
		for(Entidad e: lista) { 
			mapeoInteligencias.put(e, e.getInteligencia());
			e.setInteligenciaDummy(new InteligenciaDummy());
		}
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(Entidad e: juego.getEntidades()) {
			if(mapeoInteligencias.containsKey(e))
				e.setInteligencia(mapeoInteligencias.get(e));
		}
		mapeoInteligencias.clear();
		instancia=null;
	}
	
}
