package org.foobarspam.main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Instrucción break\n");
		for(int i=0; i<=10;i++)
		{
			System.out.println("Aun estas en el ciclo for");
			if(i == 4)
			{
				break;
			}
			System.out.println("El valor de i es: "+i);
		}
		System.out.println("Has dejado el ciclo for");
		
		System.out.println("Instrucción continue\n");
		for(int i=0; i<=10;i++)
		{
			System.out.println("Aun estas en el ciclo for");
			if(i == 4)
			{
				continue;
			}
			System.out.println("El valor de i es: "+i);
		}
		System.out.println("Has dejado el ciclo for");
	}

}
