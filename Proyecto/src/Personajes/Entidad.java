package Personajes;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.JLabel;

import Colisionadores.Colisionador;

public abstract class Entidad {
	protected int vida;
	protected int velocidad;
	protected Point pos;
	protected Colisionador col;
	protected final int width=42;
	protected final int height=70;
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
	
	protected void cambiarGrafico(int dir){
		if(this.grafico != null){
		//	this.grafico.setIcon(this.image[dir]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
	}
	
	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(imagen);
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
	
	public abstract void golpearJugador(Entidad e);
	public abstract void golpearEnemigo(Entidad e);
	public abstract void mover(int dir);
		
	protected void disminuirVida(int vida) {
		this.vida-=vida;
	}
}
