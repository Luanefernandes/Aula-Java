package DIA_02;

import java.util.Scanner;

public class ex4_dia2 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int numero;
		
		System.out.printf("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero%2==0)
		{
			System.out.printf("É par!!!");			
		}

		else
		{
			System.out.printf("É impar!!!");
		}
		
	};
	
		
	
}