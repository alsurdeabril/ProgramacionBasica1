package ar.edu.unlam.pb1.tp02;

public class Casio {

	public static void main(String[] args) {
		
		Calculadora casio = new Calculadora(); // no recibe parámetros
		
		casio.setOperadores(10, 5); // 
	
		
		System.out.println("El resultado de la suma es : " + casio.sumar());
		
		System.out.println("El resultado de la resta es: " + casio.restar());
		
		System.out.println("El resultado de la multiplicación es: " + casio.multiplicar());
		
		System.out.println("El resultado de la división es: " + casio.dividir());
	} // end main

} // end Casio class
