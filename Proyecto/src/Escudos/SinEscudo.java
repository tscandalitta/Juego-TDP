package Escudos;

public class SinEscudo extends Escudo{

	public SinEscudo() {
		super(100);
	}
	
	public void disminuirVida(int damage) {
		vida-=damage;
	}
}
