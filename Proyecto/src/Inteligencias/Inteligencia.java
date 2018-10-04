package Inteligencias;

import java.awt.Point;
import Personajes.Entidad;

public abstract class Inteligencia {
	protected int velocidad;
	protected Point pos;
	
	public abstract int mover();
}
