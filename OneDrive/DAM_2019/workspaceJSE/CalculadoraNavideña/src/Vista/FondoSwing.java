package Vista;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.swing.border.Border;

public class FondoSwing implements Border {
	//AQUI CREO UNA CLASE PARA DARLE UN FONDO DE PANTALLA A LA VENTANA, LO QUE EN REALIDAD HAGO ES PONER UN BORDE
	// Y A ESE BORDE LE PONGO UNA IMAGEN
	
	private BufferedImage mImagen = null; //ESTE BUFFER NOS SIRVE PARA LA RENDERIZACION 
	
	
	 public FondoSwing(BufferedImage pImagen) {
	        mImagen = pImagen;       
	    }
	 
	 @Override
	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        if (mImagen != null) {
	            g.drawImage(mImagen, 0, 0, width, height, null);
	        }   //AQUI DIBUJO LA IMAGEN
	    }
	 
	 @Override
	    public Insets getBorderInsets(Component c) {
	        return new Insets(0, 0, 0, 0);
	    }
	     
	    @Override
	    public boolean isBorderOpaque() {
	        return true;
	    }

}
