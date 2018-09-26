package Inteligencias;

import java.awt.Point;
import Personajes.Entidad;

public abstract class Inteligencia {
	protected Entidad entidad;
	protected int velocidad;
	protected Point pos;
	
	public abstract void mover(int dir);
}
