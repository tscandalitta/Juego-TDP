package Personajes;

public abstract class Entidad {
	protected int vida;
	protected int posX;
	protected int posY;
	protected Entidad(int v,int x, int y) {
		vida=v;
		posX=x;
		posY=y;
	}

	protected void colisionar() {}
}
