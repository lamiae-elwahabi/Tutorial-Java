package org.foobarspam.main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("El contador va incrementando\n");
		
		for(int contador = 0;contador<=10;contador++) 
		{
			System.out.println("El contador vale: "+contador);
		}
		
		System.out.println("El contador va desincrementando\n");
		for(int contador = 10;contador>=0;contador--) 
		{
			System.out.println("El contador vale: "+contador);
		}
		
		System.out.println("El contador multiplicado por dos\n");
		for(int contador = 1;contador<=20;contador++) 
		{	
			contador = contador*2;
			System.out.println("El contador vale: "+contador);
		}

	}

}
