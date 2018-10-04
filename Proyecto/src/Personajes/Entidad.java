package Personajes;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.JLabel;

import Colisionadores.Colisionador;
import Inteligencias.Inteligencia;

public abstract class Entidad {
	protected int vida;
	protected Point pos;
	protected Colisionador col;
	protected int width;
	protected int height;
	protected JLabel grafico;
	protected Icon imagen[];
	
	protected Entidad(int x, int y) {
		this.pos= new Point(x, y);
		this.imagen= new Icon[4];
	}
	
	public int getVida() {
		return vida;
	}
	public Point getPos() {
		return pos;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public void cambiarGrafico(int dir){
		if(this.grafico != null){
			this.grafico.setIcon(this.imagen[dir]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
	}
	
	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(imagen[0]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
		return this.grafico;
	}
	
	public void setCol(Colisionador col) {
		this.col=col;
	}
	public void colisionar(Entidad e) {
		e.serColisionado(col);
	}
	
	public abstract void serColisionado(Colisionador col);
		
	public abstract void mover();
		
	protected void disminuirVida(int damage) {
		vida-=damage;
		if(vida<0)
			vida=0;
	}
	
}
