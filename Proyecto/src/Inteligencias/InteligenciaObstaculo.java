package Inteligencias;

import Personajes.Obstaculos.Obstaculo;

public abstract class InteligenciaObstaculo extends Inteligencia{
	protected Obstaculo obstaculo;
	
	protected InteligenciaObstaculo(Obstaculo o) {
		obstaculo=o;
		pos=obstaculo.getPos();
	}
}
