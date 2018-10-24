package Escudos;

public class EscudoSimple extends Escudo {
	private boolean meGolpearon;
	
	public EscudoSimple() {
		super(100);
		meGolpearon=false;
	}

	public void disminuirVida(int damage) {
		if(!meGolpearon)
			meGolpearon=true;
		else
			vida-=damage;
			
	}

}
