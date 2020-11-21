package Vista;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MyIcon implements Icon { //CREE ESTA CLASE PARA PODER PONER UN ICONO EN LOS CUADROS DE DIALOGO

	@Override
	public int getIconHeight() {
		return 80;
	}

	@Override
	public int getIconWidth() {
		return 80;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Image image = new ImageIcon(getClass().getResource("/imagenes/papanoel.png")).getImage();
        g.drawImage(image, x, y, c);
		
	}
	
	

}
