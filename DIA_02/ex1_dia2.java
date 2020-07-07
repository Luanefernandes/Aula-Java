package DIA_02;

import java.util.Scanner;

public class ex1_dia2 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int numero,maior=0,i;
		

		for (i=0;i<3;i++)	
		{
			System.out.printf("Digite o valor de X: ");
			numero = leia.nextInt();	
		
			if(maior<numero)
			{
				maior=numero;
			}
		}
		
			
		System.out.printf("O maior valor de X é: "+maior);
		


	};
	
		
	
}