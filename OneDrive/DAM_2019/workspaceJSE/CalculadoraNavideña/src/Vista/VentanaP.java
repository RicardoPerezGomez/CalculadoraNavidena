package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controlador.ManejadorEventos;

public class VentanaP extends JFrame {
		
		private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5;//DECLARACION DE VARIABLES 
		private JTextField caja1, caja2; 
		private JButton botonSuma, botonResta, botonProducto, botonDiv, botonReset, botonRaiz2, botonRaiz3;
		
				
	public VentanaP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DOY TAMAÑO Y FORMA A MI VENTANA
		setSize(580,620);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setTitle("CALCULADORA NAVIDEÑA");
		setIconImage(Toolkit.getDefaultToolkit().getImage("th.jpg"));
		inicializarComponentes();
		setVisible(true);
		
	}
	
	
	private void inicializarComponentes() {
		
		try {//TRY CATCH PARA EL FONDE DE LA VENTANA
            FondoSwing fondo = new FondoSwing(ImageIO.read(new File("papanoelrodolfo.jpg")));
            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
		
		
		try {//TRY CATCH PARA LA FUENTE DE LOS COMPONENTES DE LA VENTANA
		Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Cartoon Blocks Christmas SC.otf"));
		 //FUENTE DE LOS COMPONENTES DE LA VENTANA 
		etiqueta1 = new JLabel("NUMERO 1: ");
		etiqueta1.setBounds(170, 70, 170, 30);
		etiqueta1.setForeground(Color.WHITE);
		etiqueta1.setFont(font.deriveFont(Font.BOLD, 27f));
		add(etiqueta1);
		
		
		etiqueta2 = new JLabel("NUMERO 2: ");
		etiqueta2.setBounds(170, 105, 170, 30);
		etiqueta2.setForeground(Color.WHITE);
		etiqueta2.setFont(font.deriveFont(Font.BOLD, 27f));
		add(etiqueta2);
		
		etiqueta3 = new JLabel("RESULTADØ: ");
		etiqueta3.setBounds(135, 380, 180, 30);
		etiqueta3.setForeground(Color.WHITE);
		etiqueta3.setFont(font.deriveFont(Font.BOLD, 26f));
		etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
		add(etiqueta3);
		
		etiqueta4 = new JLabel();
		etiqueta4.setBounds(320, 380, 170, 30);
		etiqueta4.setForeground(Color.WHITE);
		etiqueta4.setFont(font.deriveFont(Font.BOLD, 26f));
		add(etiqueta4);
		
		etiqueta5 = new JLabel();
		etiqueta5.setBounds(120, 480, 310, 100);
		etiqueta5.setForeground(Color.WHITE);
		etiqueta5.setFont(font.deriveFont(Font.BOLD, 34f));
		etiqueta5.setHorizontalAlignment(SwingConstants.CENTER);
		add(etiqueta5);
		

		botonSuma = new JButton("SUMAR");
		botonSuma.setBounds(150, 170, 130, 50);
		botonSuma.setForeground(Color.RED);
		botonSuma.setFont(font.deriveFont(Font.BOLD, 22f));
		botonSuma.setBackground(Color.WHITE);
		add(botonSuma);
		
		botonResta = new JButton("RESTAR");
		botonResta.setBounds(295, 170, 130, 50);
		botonResta.setForeground(Color.RED);
		botonResta.setFont(font.deriveFont(Font.BOLD, 21f));
		botonResta.setBackground(Color.WHITE);
		add(botonResta);
		
		botonProducto = new JButton("PRODUCTO");
		botonProducto.setBounds(150, 230, 130, 50);
		botonProducto.setForeground(Color.RED);
		botonProducto.setFont(font.deriveFont(Font.BOLD, 17f));
		botonProducto.setBackground(Color.WHITE);
		add(botonProducto);
		
		botonDiv = new JButton("DIVIDIR");
		botonDiv.setBounds(295, 230, 130, 50);
		botonDiv.setForeground(Color.RED);
		botonDiv.setFont(font.deriveFont(Font.BOLD, 20f));
		botonDiv.setBackground(Color.WHITE);
		add(botonDiv);
		
		botonRaiz2 = new JButton("Raiz²");
		botonRaiz2.setBounds(150, 290, 130, 50);
		botonRaiz2.setForeground(Color.RED);
		botonRaiz2.setFont(font.deriveFont(Font.BOLD, 26f));
		botonRaiz2.setBackground(Color.WHITE);
		botonRaiz2.setHorizontalAlignment(SwingConstants.CENTER);
		add(botonRaiz2);
		
		botonRaiz3 = new JButton("Raiz³");
		botonRaiz3.setBounds(295,290, 130, 50);
		botonRaiz3.setForeground(Color.RED);
		botonRaiz3.setFont(font.deriveFont(Font.BOLD, 26f));
		botonRaiz3.setBackground(Color.WHITE);
		botonRaiz3.setHorizontalAlignment(SwingConstants.CENTER);
		add(botonRaiz3);
		
		botonReset = new JButton("AC");
		botonReset.setBounds(220, 445, 100, 40);
		botonReset.setForeground(Color.RED);
		botonReset.setFont(font.deriveFont(Font.BOLD, 22f));
		botonReset.setBackground(Color.WHITE);
		add(botonReset);
		
		
		}catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		caja1 = new JTextField();
		caja1.setBounds(330, 70, 80, 30);
		caja1.setBorder(null);;
		caja1.setFont(new Font("Dialog", Font.BOLD, 18));
		caja1.setForeground(new Color(250,16,0));
		caja1.setHorizontalAlignment(SwingConstants.CENTER);
		add(caja1);
		
		caja2 = new JTextField();
		caja2.setBounds(330, 105, 80, 30);
		caja2.setBorder(null);
		caja2.setFont(new Font("Dialog", Font.BOLD, 18));
		caja2.setForeground(new Color(255,16,0));
		caja2.setHorizontalAlignment(SwingConstants.CENTER);
		add(caja2);
		
	}	
	
		public void establecerManejador(ManejadorEventos manejador) {
			botonSuma.addActionListener(manejador);  //BOTONES A USAR 
			botonResta.addActionListener(manejador);
			botonProducto.addActionListener(manejador);
			botonDiv.addActionListener(manejador);
			botonReset.addActionListener(manejador);
			botonRaiz2.addActionListener(manejador);
			botonRaiz3.addActionListener(manejador);
			
		}
		
	
		//METODO PARA PODER REPRODUCIR SONIDOS EN LA VENTANA
		public void ReproducirSonido(String nombreSonido) {
			   try {
			        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
			        Clip clip = AudioSystem.getClip();
			        clip.open(audioInputStream);
			        clip.start();
			       } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
			         System.out.println("Error al reproducir el sonido.");
			       }
		}
		
		
		public JButton getBotonSuma() {
			return botonSuma;
		}

		public JButton getBotonReset() {
			return botonReset;
		}

		public JButton getBotonResta() {
			return botonResta;
		}

		public JButton getBotonProducto() {
			return botonProducto;
		}

		public JButton getBotonDiv() {
			return botonDiv;
		}

		public JLabel getEtiqueta4() {
			return etiqueta4;
		}

		public JTextField getCaja1() {
			return caja1;
		}

		public JTextField getCaja2() {
			return caja2;
		}
		
		public void setCaja2(JTextField caja2) {
			this.caja2 = caja2;
		}
		
		public JLabel getEtiqueta5() {
			return etiqueta5;
		}
		
		public JButton getBotonRaiz2() {
			return botonRaiz2;
		}
		
		public JButton getBotonRaiz3() {
			return botonRaiz3;
		}
		
}
