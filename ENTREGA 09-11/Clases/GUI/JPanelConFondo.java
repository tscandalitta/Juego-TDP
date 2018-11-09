package GUI;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
 
@SuppressWarnings("serial")
public class JPanelConFondo extends JPanel {
 
    private Image imagen= new ImageIcon(this.getClass().getResource("/Sprites/fondo.jpg")).getImage();
    
    public void paint(Graphics g) {
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}