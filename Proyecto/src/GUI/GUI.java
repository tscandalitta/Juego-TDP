package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Juego.Juego;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private Juego juego;
	private HiloTiempo tiempo;
	private JLabel puntaje, vidas, salud, kills, gameOver, ganar;
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
				juego.getJugador().getInteligencia().keyPressed(arg0);
			}
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
	public void gameOver() {
		gameOver= new JLabel("HAS PERDIDO");
		gameOver.setForeground(Color.RED);
		this.actualizarPuntajes();
		terminarJuego(gameOver);
	}
	public void ganar() {
		ganar= new JLabel("HAS GANADO");
		ganar.setForeground(Color.GREEN);
		this.actualizarPuntajes();
		terminarJuego(ganar);
	}
	private void terminarJuego(JLabel label) {
		label.setFont(new java.awt.Font("Tahoma", 1, 60));
		label.setHorizontalAlignment(JTextField.CENTER);;
		label.setBackground(Color.BLACK);
		label.setBounds(1, 330, 1280, 50);
		contentPane.removeAll();
		contentPane.add(label);		
		this.repaint();
	}
	public void actualizarPuntajes() {
		puntaje.setText("PUNTAJE: "+juego.getPuntaje());
		kills.setText("KILLS: "+juego.getKills());
		salud.setText("SALUD: "+juego.getJugador().getVida());
		vidas.setText("VIDAS: "+juego.getJugador().getOportunidades());
	}
	private void inicializarLabels() {
		inicializarVida();
		inicializarPuntaje();
		inicializarKills();
		inicializarSalud();
	}
	private void inicializarVida() {
		salud=new JLabel("SALUD:");
		salud.setForeground(Color.WHITE);
		salud.setFont(new java.awt.Font("Tahoma", 1, 18));
		salud.setBounds(10, 5, 120, 25);
		contentPane.add(salud);
	}
	private void inicializarKills() {
		kills=new JLabel("KILLS:");
		kills.setForeground(Color.WHITE);
		kills.setFont(new java.awt.Font("Tahoma", 1, 18));
		kills.setBounds(1150, 5, 120, 25);
		contentPane.add(kills);
	}
	private void inicializarPuntaje() {
		puntaje=new JLabel("PUNTAJE:");
		puntaje.setForeground(Color.WHITE);
		puntaje.setFont(new java.awt.Font("Tahoma", 1, 18));
		puntaje.setBounds(975, 5, 150, 25);
		contentPane.add(puntaje);
	}
	private void inicializarSalud() {
		vidas=new JLabel("VIDAS: ");
		vidas.setForeground(Color.WHITE);
		vidas.setFont(new java.awt.Font("Tahoma", 1, 18));
		vidas.setBounds(160, 5,	120, 25);
		contentPane.add(vidas);
	}
}