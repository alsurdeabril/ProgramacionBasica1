package ar.edu.unlam.pb1.ejerciciosenclase;

public class ControlRemoto {

	public static void main(String[] args) {
	
		Televisor lg = new Televisor();
		
		lg.encenderOapagar();
		

		lg.subirCanal();
		
		lg.bajarCanal();
		
		lg.subirVolumen();
		lg.subirVolumen();
		
		lg.cambiarDeCanal(25);
		
		System.out.println("El canal actual es: " + lg.consultarElCanal());
		System.out.println("El volumen actual es: " + lg.consultarElVolumen());
		
	} // end main

} // end ControlRemoto
