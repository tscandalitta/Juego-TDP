package Personajes;

import javax.swing.ImageIcon;

public class Enemigo extends Entidad{

	public Enemigo(int velocidad, int vida, int x, int y) {
		super(velocidad, vida, x, y);
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/Kang.png"));
	}

	@Override
	public void mover(int dir) {
		// TODO Auto-generated method stub
		
	}

}
