package ar.edu.unlam.pb1.ejerciciosenclase;

public class Televisor {

	/* Atributos propios de la clase que reflejan el 
	 * estado de la clase Televisor */
	
	private String nombre;
	private int volumenActual;
	private int canalActual;
	private boolean encendido;
	
	/* Constructor: formato similar al de un método
	 * pero NO va a tener valor de retorno
	 * En el constructor le asignamos valores a los
	 * atributos de ese objeto y los inicializamos */
	public Televisor() {
		this.nombre = nombre; // this -> se hace referencia al objeto de la clase
		encendido = false;
		canalActual = 1;
		volumenActual = 0;
	} // end Televisor constructor
	
	/* Métodos: van a describir el comportamiento
	 * de la clase de tipo Televisor */
	
	public void encenderOapagar() { // void -> no devuelve
	//	ningún valor solo ejecuta una acción
		
		encendido = !encendido; // realiza la acción contraria
		
	} // end encenderOapagar
	
	public void subirCanal() { // void -> no devuelve
		//	ningún valor solo ejecuta una acción
		canalActual++; // sube el canal en 1
		
	} // end subirCanal
	
	public void bajarCanal() { // void -> no devuelve
		//	ningún valor solo ejecuta una acción
		canalActual--; // baja el canal en 1
		
	} // end bajarCanal
	
	public void subirVolumen() { // void -> no devuelve 
		// ningún valor, solo ejecuta una acción
		volumenActual++; // aumenta el volumen en 1
	} //end subirVolumen
	
	public void bajarVolumen() { // void -> no devuelve 
		// ningún valor, solo ejecuta una acción
		volumenActual--; // decrementa el volumen en 1
	} // end bajarVolumen
	
	public void cambiarDeCanal(int canalNuevo) { // void -> no devuelve ningún valor, solo ejecuta una acción
		/* En este caso genero una nueva variable que
		 * va alojar el estado que quiere la acción que
		   sea reflejada */
		canalActual = canalNuevo; 
	} // end cambiarDeCanal
	
	public int consultarElCanal() { // int tipo de dato
		// que va a tener la variable de retorno
		return canalActual;
	} // end consultarElCanal
	
	public int consultarElVolumen() { // int tipo de dato
		// que va a tener la variable de retorno
		return volumenActual;
	} // end volumenActual
	
} // end Televisor class
