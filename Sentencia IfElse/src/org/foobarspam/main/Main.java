package org.foobarspam.main;

public class Main {
	/**
	 * Operandos l�gicos
	 * >, >=, <, <=, ==, ||, &&, !
	 */

	public static void main(String[] args) {
		
		System.out.println("###Codigo Facilito##\n");
	
		//Variables
		boolean cond = true;
		int var=7;
		int var2 = 10;
		
		//Condici�n igualar 
		if(var==8)
		{
			System.out.println("La condici�n igualar es verdadera");
		}
		else 
		{
			System.out.println("La condici�n igualar es falsa");
		}
		
		//Conduci�n mayor
		if(var>5)
		{
			System.out.println("La conduci�n mayor es verdadera");
		}
		else 
		{
			System.out.println("La conduci�n mayor es falsa");
		}
		
		//Conduci�n mayor o igual
		if(var>=8) 
		{
			System.out.println("La conduci�n mayor o igual es verdadera");
		}
		else 
		{
			System.out.println("La conduci�n mayor o igual es falsa");
		}
		//Conduci�n menor
		if(var<10)
		{
			System.out.println("La conduci�n menor es verdadera");
		}
		else 
		{
			System.out.println("La conduci�n menor es falsa");
		}
				
		//Conducion menor o igual 
		//(if/else dentro if/else)
		if(var<= 19) 
		{
			cond = true;
			
		}
		else 
		{
			cond = false;
			
		}
			if(cond)
			{
				System.out.println("La conduci�n menor o igual es verdadera");
			}
			else 
			{
				System.out.println("La conduci�n menor o igual es falsa");
			}
					
		//Conducion and 
		if((var==6) && (var2>5)) 
		{
			System.out.println("La conduci�n and es verdadera");
		}
		else 
		{
			System.out.println("La conduci�n and es falsa");
		}
		//Conducion or
		if((var==6) || (var2>5)) 
		{
			System.out.println("La conduci�n or es verdadera");
		}
		else 
		{
			System.out.println("La conduci�n or es falsa");
		}
		//Condicion negaci�n
		if(!(var==6) && (var2>5)) 
		{
			System.out.println("La conduci�n negaci�n es verdadera");
		}
		else 
		{
			System.out.println("La conduci�n negaci�n es falsa");
		}

	}

}
