package Memento;

import java.awt.Point;

public class Memento {
	private int vida;
	private Point pos;
	
	public Memento(int v, int x, int y) {
		vida=v;
		pos= new Point(x,y);
	}
	
	public int getVida() {
		return vida;
	}
	public Point getPos() {
		return pos;
	}
}
