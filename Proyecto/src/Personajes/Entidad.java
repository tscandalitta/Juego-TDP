package Personajes;

public abstract class Entidad {
	protected int vida;
	protected int posX;
	protected int posY;
	
	protected Entidad() {
		vida=0;
		posX=0;
		posY=0;
	}
    protected void colisionar() {}
}
