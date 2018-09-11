package Personajes;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.JLabel;

public abstract class Entidad {
	protected int vida;
	protected int velocidad;
	protected Point pos;
	
	protected final int width= 32;
	protected final int height= 32;
	protected JLabel grafico;
	protected Icon imagen;
	
	protected Entidad(int velocidad, int vida, int x, int y) {
		this.velocidad= velocidad;
		this.vida= vida;
		this.pos= new Point(x, y);
	}
	
	public int getVida() {
		return vida;
	}
	
	public Point getPos() {
		return pos;
	}
	
	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(imagen);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
		
		return this.grafico;
	}

	public abstract void mover(int dir);
	

}
