package GUI;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Juego;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private Juego juego;
	private HiloTiempo tiempo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public GUI() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				keyListener(arg0);
			}
		});
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1280, 720);
		contentPane = new JPanelConFondo();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		juego= new Juego(this);
		tiempo = new HiloTiempo(juego);
		tiempo.start();
	}
	
	protected void keyListener(KeyEvent key){
		if(key.getKeyCode()==KeyEvent.VK_E) 
			eliminarEnemigo();
		else
			juego.mover(key.getKeyCode());
		
		this.repaint();
	}
	
	protected void eliminarEnemigo() {
		if(!juego.getEntidades().isEmpty()) {
			this.remove(juego.getEntidades().get(0).getGrafico());
			juego.eliminarEnemigo();
		}
	}
}