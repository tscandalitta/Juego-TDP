package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Juego;
import Personajes.Entidad;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private Juego juego;
	private HiloTiempo tiempo;
	private JLabel puntaje, vida, kills;
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
			//	keyListener(arg0);
				juego.getJugador().getInteligencia().keyPressed(arg0);
			}
			//esto lo agrege
			 @Override
        	public void keyReleased(KeyEvent arg0) {
            	juego.getJugador().getInteligencia().keyReleased(arg0);
			 }
		});
		
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1280, 720);
		contentPane = new JPanelConFondo();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		inicializarLabels();		
		contentPane.add(puntaje);
		setContentPane(contentPane);
		juego= new Juego(this);
		tiempo = new HiloTiempo(juego);
		tiempo.start();
		juego.setHilo(tiempo);
	}
	
	private void inicializarLabels() {
		inicializarVida();
		inicializarPuntaje();
		inicializarKills();
	}
	private void inicializarVida() {
		vida=new JLabel("VIDA: 100");
		vida.setForeground(Color.WHITE);
		vida.setFont(new java.awt.Font("Tahoma", 1, 16));
		vida.setBounds(100, 5, 100, 25);
		contentPane.add(vida);
	}
	private void inicializarKills() {
		kills=new JLabel("KILLS: 0");
		kills.setForeground(Color.WHITE);
		kills.setFont(new java.awt.Font("Tahoma", 1, 16));
		kills.setBounds(425, 5, 100, 25);
		contentPane.add(kills);
	}
	private void inicializarPuntaje() {
		puntaje=new JLabel("PUNTAJE: 0");
		puntaje.setForeground(Color.WHITE);
		puntaje.setFont(new java.awt.Font("Tahoma", 1, 16));
		puntaje.setBounds(250, 5, 200, 25);
		contentPane.add(puntaje);
	}
	public void actualizarPuntajes() {
		puntaje.setText("PUNTAJE: "+juego.getPuntaje());
		kills.setText("KILLS: "+juego.getKills());
		vida.setText("VIDA: "+juego.getVidaJugador());
	}
	/**
	protected void keyListener(KeyEvent key){
		if(key.getKeyCode()==KeyEvent.VK_SPACE) 
			
			juego.crearDisparo();
		else
			juego.mover(key.getKeyCode());
		this.repaint();
	}
	*/
	

}