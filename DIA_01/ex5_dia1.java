package DIA_01;

import java.util.Scanner;

public class ex5_dia1 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		float nota1, nota2, nota3, media;
		System.out.printf("Vamos calcular sua média :) \n");		
		System.out.printf("Digite o valor da N1: ");
		nota1 = leia.nextInt();
		System.out.printf("Digite o valor da N2: ");
		nota2 = leia.nextInt();
		System.out.printf("Digite o valor da N3: ");
		nota3 = leia.nextInt();		
		
		media=((nota1*2)+(nota2*3)+(nota3*5))/10;
		
				
		System.out.printf("A média final é de: "+ media);
		
		
	};
	
		
	
}