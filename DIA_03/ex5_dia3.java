package DIA_03;

import java.util.Scanner;

public class ex5_dia3 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int numero, soma=0;
		

		do{
			
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			
			
			if(numero>0){
				soma=soma+numero;
			}
			
		}while (numero>0);
		
		System.out.printf("A soma dos n�meros digitados �: "+soma);
			
	}
		

	};