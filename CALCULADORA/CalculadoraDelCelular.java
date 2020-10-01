package ar.edu.unlam.pb1.tp02;

public class CalculadoraDelCelular {

	public static void main(String[] args) {
		
		Calculadora calCelular = new Calculadora(10.0,5.0); // recibe parámetros
		
		System.out.println("El resultado de la suma es: " + calCelular.sumar());
		
		System.out.println("El resultado de la resta es: " + calCelular.restar());
		
		System.out.println("El resultado de la multiplicación es: " + calCelular.multiplicar());
		
		System.out.println("El resultado de la división es: " + calCelular.dividir());

	} // end main

} // end CalculadoraDelCelular class
