package Controlador;

import Vista.VentanaP;

public class Main {

	public static void main(String[] args) {
		
		VentanaP miVentana = new VentanaP();//CREO MI OBJETO VENTANA
		ManejadorEventos manejador = new ManejadorEventos(miVentana);//CREO MI OBJETO ManejadorEventos PASANDOLE "miVentana"
		miVentana.establecerManejador(manejador);//POR ULTIMO A "miVentana" LE PASO MI OBJETO "MANEJADOR"
		
		
		
		
	}

}
