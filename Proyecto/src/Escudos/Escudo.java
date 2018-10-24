package Escudos;

public abstract class Escudo {
	protected int vida;
	
	
	public Escudo(int vida) {
		this.vida=vida;
	}
	
	public abstract void disminuirVida(int damage);
	
	public int getVida() {
		return vida;
	}
}
