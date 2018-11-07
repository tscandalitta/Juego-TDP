package Personajes;

import javax.swing.ImageIcon;

public abstract class Disparo extends Entidad {
	
	protected Disparo(int damage, int x, int y) {
		super(x,y);
		this.damage=damage;
		vida=1;
		puntosDeMuerte=0;
	}
	
	public void setSpritePoderoso() {
		this.imagen= new ImageIcon(this.getClass().getResource("/Sprites/disparoPoderoso.png"));
		height=32;
		width=32;
	}
	
	public void setSpriteRapido() {
		this.imagen= new ImageIcon(this.getClass().getResource("/Sprites/disparoRapido.png"));
		height=12;
		width=20;
	}
}
