package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {

	private Image image;

	public PanelPrincipal() {
		image = new ImageIcon("Captura.png").getImage();
		this.setPreferredSize(new Dimension(450, 310));
		inicializar();

	}

	public void inicializar() {
		
		
	}

	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(image, 0, 0, null);

	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

}
