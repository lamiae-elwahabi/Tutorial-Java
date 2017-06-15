package org.foobarspam.main;

public class Main {
	/**
	 * Operandos lógicos
	 * >, >=, <, <=, ==, ||, &&, !
	 */

	public static void main(String[] args) {
		
		System.out.println("###Codigo Facilito##\n");
	
		//Variables
		boolean cond = true;
		int var=7;
		int var2 = 10;
		
		//Condición igualar 
		if(var==8)
		{
			System.out.println("La condición igualar es verdadera");
		}
		else 
		{
			System.out.println("La condición igualar es falsa");
		}
		
		//Condución mayor
		if(var>5)
		{
			System.out.println("La condución mayor es verdadera");
		}
		else 
		{
			System.out.println("La condución mayor es falsa");
		}
		
		//Condución mayor o igual
		if(var>=8) 
		{
			System.out.println("La condución mayor o igual es verdadera");
		}
		else 
		{
			System.out.println("La condución mayor o igual es falsa");
		}
		//Condución menor
		if(var<10)
		{
			System.out.println("La condución menor es verdadera");
		}
		else 
		{
			System.out.println("La condución menor es falsa");
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
				System.out.println("La condución menor o igual es verdadera");
			}
			else 
			{
				System.out.println("La condución menor o igual es falsa");
			}
					
		//Conducion and 
		if((var==6) && (var2>5)) 
		{
			System.out.println("La condución and es verdadera");
		}
		else 
		{
			System.out.println("La condución and es falsa");
		}
		//Conducion or
		if((var==6) || (var2>5)) 
		{
			System.out.println("La condución or es verdadera");
		}
		else 
		{
			System.out.println("La condución or es falsa");
		}
		//Condicion negación
		if(!(var==6) && (var2>5)) 
		{
			System.out.println("La condución negación es verdadera");
		}
		else 
		{
			System.out.println("La condución negación es falsa");
		}

	}

}
