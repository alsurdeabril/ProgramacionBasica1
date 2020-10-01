package ar.edu.unlam.pb1.tp02;

public class Calculadora {

	/* Atributos propios de la clase que reflejan el estado de la clase Calculadora2 */
	private double operador1;
	private double operador2;
	private double suma;
	private double resta;
	private double multiplicacion;
	private double division;
	
	/* Constructor: formato similar al de un método pero NO va a tener valor de retorno
	 * En el constructor le asignamos valores a los atributos de ese objeto y los inicializamos */
	public Calculadora() {
		this.operador1 = 10.0;
		this.operador2 = 5.0;
		this.suma = 0.0;
		this.resta = 0.0;
		this.multiplicacion = 0.0;
		this.division = 0.0;
		
	} // end Calculadora constructor 1
	
	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
		this.suma = 0.0;
		this.resta = 0.0;
		this.multiplicacion = 0.0;
		this.division = 0.0;
	
	} //  end Calculadora constructor 2
	
	/* Métodos: van a describir el comportamiento de la clase de tipo Televisor */
	public double sumar() { // double tipo de dato que devuelve la variable de retorno
		suma =  this.operador1 + this.operador2; // operación que va a devolver el método
		return suma;
	} // end sumar 1
	
	public double sumar(double operador1, double operador2) { //double tipo de dato variable de retorno
		suma = this.operador1 + this.operador2;  // operación que va a devolver el método
		return suma;
	} // end suma 2
	
	public double restar() { //double tipo de dato variable de retorno
		resta = this.operador1 - this.operador2;  // operación que va a devolver el método
		return resta;
	} // end resta 1
	
	public double restar(double operador1, double operador2) { // double tipo dato variable retorno
		resta = this.operador1 - this.operador2; // operación que va a devolver el método
		return resta;
	} // end resta2
	
	public double multiplicar() {  //double tipo de dato variable de retorno
		multiplicacion = this.operador1 * this.operador2; // operación que va a devolver el método
		return multiplicacion;
	} // end multiplicar1
	
	public double multiplicar(double operador1, double operador2) {  //double tipo de dato variable de retorno
		multiplicacion = this.operador1 * this.operador2; // operación que va a devolver el método
		return multiplicacion;
	} // end multiplicar2
	
	public double dividir() {  //double tipo de dato variable de retorno
		division = this.operador1 / this.operador2;  //double tipo de dato variable de retorno
		return division;
	} // end division1
	
	public double dividir(double numerador, double divisor) {  //double tipo de dato variable de retorno
		division = this.operador1 / this.operador2;  //double tipo de dato variable de retorno
		return division;
	} // end division2
	

	

} // end Calculadora class
