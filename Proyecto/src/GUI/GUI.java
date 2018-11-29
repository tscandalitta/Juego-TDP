package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
		iniciarKeyListener();
		
		getContentPane().setLayout(null);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1280, 720);
		contentPane = new JPanelConFondo();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		inicializarLabels();		
		contentPane.add(puntaje);
		setContentPane(contentPane);
		this.setResizable(false);
		juego= new Juego(this);
		tiempo = new HiloTiempo(juego);
		tiempo.start();
		juego.setHilo(tiempo);
	}
	
	private void iniciarKeyListener() {
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
	}
	public void gameOver() {
		gameOver= new JLabel();
		gameOver.setBounds(0,0,1280,720);
		gameOver.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/perder2.png")));
		terminarJuego(gameOver);
	}
	public void ganar() {
		ganar= new JLabel();
		ganar.setBounds(0,0,1280,720);
		ganar.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/ganar.png")));
		terminarJuego(ganar);
	}
	private void terminarJuego(JLabel label) {
		JButton volverAJugar= new JButton();
		volverAJugar.setBounds(50, 20, 230, 36);
		volverAJugar.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/volverAJugar.png")));
		volverAJugar.setOpaque(false);
		volverAJugar.setBackground(new Color(0,0,0));
		volverAJugar.setBorderPainted(false);
		volverAJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				repaint();
				juego.reiniciarJuego();
				tiempo=new HiloTiempo(juego);
				tiempo.start();
				inicializarLabels();
				requestFocus();
			}
		});
		
		JButton salir= new JButton();
		salir.setBounds(50, 70, 61, 29);
		salir.setIcon(new ImageIcon(this.getClass().getResource("/Sprites/salir.png")));
		salir.setOpaque(false);
		salir.setBackground(new Color(0,0,0));
		salir.setBorderPainted(false);
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
		});
		
		contentPane.removeAll();
		contentPane.add(label);
		contentPane.add(volverAJugar);
		contentPane.add(salir);
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