package org.foobarspam.main;

public class Main {
	
	/**
	 *short - numeros cortos 
	 *int - numeros enteros
	 *long - numeros enteros largos
	 
	 *float - numeros flotantes
	 *double - numeros dobles 
	 *byte - se maneja en bytes
	 *char - caracteres
	 *boolean - boleanos, verdaderos o falsos
	 *String - cadenas de texto
	 *  + -  * / % 
	 */
	public static void main(String[] args) {
		
		System.out.println("### Codigo Lamiae###\n");
		
		int numero = 5;
		
		
		int resultadoM;
		int resultadoS;
		float resultadoD;
		int resultadoR;
		long resultadoRs;
		
		
		resultadoM = numero * 5;
		resultadoS = numero + 8;
		resultadoD = numero / 5;
		resultadoR = numero - 5;
		resultadoRs = numero %2;
		
		
		System.out.println("El resultado de multiplicación es : " +resultadoM);
		System.out.println("El resultado de suma es : "+ resultadoS);
		System.out.println("El resultado de la división es : " +resultadoD);
		System.out.println("El resultado de la resta es: "+resultadoR);
		System.out.println("El resultado de la residuo es: "+resultadoRs);
		
		System.out.println("### Codigo Facilito###\n");
		
		short suma = 3+10;
		int resta = 8-17;
		long residuo = 9/2;
		float multiplicacion = 2*(15*(-2));
		double division = 10/3.4;
		
		System.out.println("El resultado de la suma es: "+suma); //Suma
		System.out.println("El resultados de la resta es: "+resta);//resta
		System.out.println("El resultado de la residuo es: "+residuo);//residuo
		System.out.println("El resultado de la multiplicacion es: "+multiplicacion);//multiplicacion
		System.out.println("El resultado de la division es: "+division);//division
	}

}
