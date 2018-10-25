package Personajes;

import javax.swing.ImageIcon;

import Inteligencias.InteligenciaBoss;

public class Boss extends Enemigo {

	public Boss(int x, int y) {
		super(x,y);
		vida=3000;
		damage=20;
		width=200;
		height=267;
		puntosDeMuerte=1000;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/boss.png"));
		inteligencia=new InteligenciaBoss(this);
	}
	
	protected void lanzarPower() {
	}
}
