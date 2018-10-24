package Personajes;

import javax.swing.ImageIcon;
import Inteligencias.InteligenciaDummy;

public class Boss extends Enemigo {

	public Boss(int x, int y) {
		super(x,y);
		vida=1000;
		damage=10;
		width=200;
		height=267;
		puntosDeMuerte=1000;
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/boss2.png"));
		inteligencia=new InteligenciaDummy();
	}
}
