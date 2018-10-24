package Personajes;

public abstract class Disparo extends Entidad {
	
	protected Disparo(int damage, int x, int y) {
		super(x,y);
		this.damage=damage;
		vida=1;
		puntosDeMuerte=0;
	}
}
