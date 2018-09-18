package Personajes;

import javax.swing.ImageIcon;

public class Enemigo extends Entidad{

	public Enemigo(int velocidad, int vida, int x, int y) {
		super(velocidad, vida, x, y);
		this.imagen = new ImageIcon(this.getClass().getResource("/Sprites/Kang.png"));
	}

	public void mover(int dir) {
		switch(dir) {
			case 0 : //Arriba
				pos.setLocation(pos.x, pos.y - velocidad);
				break;
			case 1 : //Abajo
				pos.setLocation(pos.x, pos.y + velocidad);
				break;
		}
		cambiarGrafico(dir);
	}

}
