package Personajes;


public class Jugador extends Entidad {
	
	public Jugador(int velocidad, int vida, int x,int y) {
		super(velocidad,vida,x,y);
	}
	
	
	
	protected void mover(int dir) {
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
	/**
	public void disminuirVida(int n) {
		vida-=n;
		if(vida<=0)
			finJuego();	
	}
	public boolean activarPremio() {
		premioActivado=true;
	}
	public boolean desactivarPremio() {
		premioActivado=false;
	}
	*/
}
