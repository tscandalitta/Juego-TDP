package Personajes;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Colisionadores.Colisionador;

public abstract class Entidad {
	protected int vida;
	protected Point pos;
	protected Colisionador col;
	protected int width, height;
	protected int puntosDeMuerte;
	protected JLabel grafico;
	protected Icon imagen;
	
	protected Entidad(int x, int y) {
		this.pos= new Point(x, y);
		imagen= new ImageIcon();
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
	public int getPuntos() {
		return puntosDeMuerte;
	}
	
	protected void actualizarGrafico(){
		if(this.grafico != null){
			this.grafico.setIcon(this.imagen);
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
		
	public abstract void mover();
		
	protected void disminuirVida(int damage) {
		vida-=damage;
		if(vida<0)
			vida=0;
	}
	
	public void aumentarVida(int v) {
		vida+=v;
		if(vida>100)
			vida=100;
	}
	
	public abstract void golpearJugador(Entidad j);
	public abstract void golpearEnemigo(Entidad e);
	public abstract void golpearPowerUp(Entidad p);
	public abstract void golpearObstaculoBarricada(Entidad o);
	public abstract void golpearObstaculoDestruible(Entidad o);
	public abstract void golpearDisparoJugador(Entidad d);
	public abstract void golpearDisparoEnemigo(Entidad d);
	
}
