package Inteligencias;


import Personajes.Enemigo;

public class InteligenciaKamikazeEnemigoComun extends InteligenciaKamikaze{

	public InteligenciaKamikazeEnemigoComun(Enemigo k) {
		super(k);
	}
	
	public void mover() {
		moverAux();
	}

}
