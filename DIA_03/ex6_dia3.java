package DIA_03;

import java.util.Scanner;

public class ex6_dia3 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int numero, soma=0, cont=0;
		double media;
		

		do{
			
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			cont=cont+1;
			
			if(numero%3==0){
				soma=soma+numero;
			}
			
			media=soma/cont;
			
		}while (numero!=0);
		
				
		System.out.printf("A m�dia dos n�meros digitados que s�o inteiros e m�ltiplos de 3 �: "+media);
			
	}
		

	};
	