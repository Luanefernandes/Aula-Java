package DIA_03;

import java.util.Scanner;

public class ex2_dia3 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int i,numero,pares=0,impares=0;
		

		for (i=0;i<10;i++){
			
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			
			if(numero%2==0) {
				
				pares=pares+1;
												
			} else {
				
				impares=impares+1;
				
			}
		
			
		}
		
		System.out.println("Os n�meros pares s�o: "+pares);
		System.out.println("Os n�meros impares s�o: "+impares);
		
	};
	
}