package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Vista.MyIcon;
import Vista.VentanaP;



	public class ManejadorEventos implements ActionListener  {
			
			private VentanaP ventana;
			
			
			public ManejadorEventos(VentanaP ventana) {
				this.ventana = ventana;
			}
			
	@Override
	public void actionPerformed(ActionEvent e) {
				
		try {//ABRO UN TRY PARA LAS EXCEPCIONES
				double resultado=0.0;// CREO VARIABLE DOUBLE PARA PODER 
				double resultado1=0.0;// HACER OPERACIONES CON DECIMALES
				double resultado2=0.0;
				double resultado3=0.0;
				String texto = "Funcionalidad no disponible";
				double resultado4 =0.0;
				double resultado5 =0.0;
				
				double num1 = Double.parseDouble(ventana.getCaja1().getText());// AQUI LA PARSEO PORQUE ES UNA 
				double num2 = Double.parseDouble(ventana.getCaja2().getText());// CAJA DE TEXTO
				String mensaje = "FELIZ NAVIDAD";
				MyIcon icon = new MyIcon();//CREO UN OBJETO DE MI CLASE MyIcon
			
				if(e.getSource() == ventana.getBotonSuma()) {//METODO DE SUMA
					resultado = num1 + num2;
					ventana.getEtiqueta4().setText(String.valueOf(resultado));//setText DEVUELVE UN STRING ASI QUE 
					ventana.getEtiqueta5().setText(mensaje);		//POR ESO HAY QUE PONER VALUEOF
					 ventana.ReproducirSonido("navidad2.wav");//METO EL METODO PARA REPRODUCIR CANCIONES
				}
				
				if(e.getSource() == ventana.getBotonResta()) {//METODO RESTA
					resultado1 = num1 - num2;
					ventana.getEtiqueta4().setText(String.valueOf(Math.round(resultado1*100.0)/100.0));
					ventana.getEtiqueta5().setText(mensaje);
					ventana.ReproducirSonido("navidad.wav");
				} 
				
				if(e.getSource() == ventana.getBotonProducto()) {//METODO PRODUCTO
					resultado2 = num1*num2;	
					ventana.getEtiqueta4().setText(String.valueOf(Math.round(resultado2*100.0)/100.0));
					ventana.getEtiqueta4().setText(String.valueOf(resultado2));// PARA SACAR SOLO 2 DECIMALES USO
					ventana.getEtiqueta5().setText(mensaje);//Math.round MULTPLICADO POR 100 Y DIVIDIDO POR 100
					ventana.ReproducirSonido("navidad-cancion-metal-.wav");
				}
				
				if(e.getSource() == ventana.getBotonDiv()) { //METODO DIVISION
					
					if(num2!=0) { //AQUI LE DIGO QUE SI NUM2 ES DISTINTO DE CERO REALICE LA DIVISION
						resultado3 = num1/num2;
						ventana.getEtiqueta4().setText(String.valueOf(Math.round(resultado3*100.0)/100.0));
						ventana.getEtiqueta5().setText(mensaje);
						ventana.ReproducirSonido("Minions-3.wav");
					}else {
						ventana.getEtiqueta4().setText("NO SE PUEDE");//SINO LE DIGO QUE ES IMPOSIBLE
						ventana.ReproducirSonido("ho-ho-ho.wav");
					}
				}
				
				if(e.getSource() == ventana.getBotonRaiz2()) {
					
					JOptionPane.showMessageDialog(null, "Uno de los campos tiene que ser cero",mensaje,JOptionPane.DEFAULT_OPTION, icon);
					if(num2 == 0) {
						ventana.getCaja2().setEnabled(false);
						ventana.ReproducirSonido("Mariah.wav");
						JOptionPane.showMessageDialog(null, texto, mensaje,JOptionPane.INFORMATION_MESSAGE );
						ventana.getEtiqueta5().setText(mensaje);
					}
			
					if(num1 == 0) {
						ventana.getCaja1().setEnabled(false);
						ventana.ReproducirSonido("Wham.wav");
						JOptionPane.showMessageDialog(null, texto, mensaje,JOptionPane.INFORMATION_MESSAGE );
						ventana.getEtiqueta5().setText(mensaje);
					}
				}
				
				if(e.getSource() == ventana.getBotonRaiz3()) {
					String password;
					JOptionPane.showMessageDialog(null, "Uno de los campos tiene que ser cero",mensaje,JOptionPane.DEFAULT_OPTION, icon);
					
					if(num2==0) {
						password = JOptionPane.showInputDialog("Introduzca contaseña");
							if(password.equalsIgnoreCase("navidad")) {
								ventana.getCaja2().setEnabled(false);
								resultado4 =  Math.cbrt(num1);
								ventana.getEtiqueta4().setText(String.valueOf(Math.round(resultado4*100.0)/100.0));
								ventana.getEtiqueta5().setText(mensaje);
								ventana.ReproducirSonido("JoseFeliciano.wav");
							}else {
								JOptionPane.showMessageDialog(null, "CLAVE INCORRECTA",mensaje,JOptionPane.DEFAULT_OPTION, icon);
							}
					}
					
					if(num1==0) {
						password = JOptionPane.showInputDialog("Introduzca contaseña");
							if(password.equalsIgnoreCase("navidad")) {
								ventana.getCaja1().setEnabled(false);
								resultado5 =  Math.cbrt(num2);
								ventana.getEtiqueta4().setText(String.valueOf(Math.round(resultado5*100.0)/100.0));
								ventana.getEtiqueta5().setText(mensaje);
								ventana.ReproducirSonido("ande,ande.wav");
							}else {
								JOptionPane.showMessageDialog(null, "CLAVE INCORRECTA",mensaje,JOptionPane.DEFAULT_OPTION, icon);
							}
					}
						
				}
			
				if(e.getSource() == ventana.getBotonReset()) { //AQUI HE CREADO UN RESET 
					ventana.getCaja1().setText("");
					ventana.getCaja2().setText("");
					ventana.getEtiqueta4().setText("");
					ventana.getEtiqueta5().setText("");
					ventana.getCaja1().setEnabled(true);
					ventana.getCaja2().setEnabled(true);
					ventana.getCaja1().requestFocus();
				}
			}
		
		catch(NumberFormatException e1) { // AQUI TERMINO CON EL CATCH Y QUE ME IMPRIMA UNOS MENSAJES EN CASO DE 
										//QUE OCURRA UNA EXCEPTION
			System.out.println("Se ha producido un NumberFormatException");
			System.out.println("Teclea un numero por favor");
			System.out.println("Para las Raices usa los dos campos");
			System.out.println(e1.getMessage());
			ventana.getEtiqueta5().setText("PON NUMEROS");
			ventana.ReproducirSonido("ho-ho-ho.wav");
			return;
		} 
		
	
		
	}
		
}
