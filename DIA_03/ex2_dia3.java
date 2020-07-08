package DIA_03;

import java.util.Scanner;

public class ex2_dia3 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int i,numero,pares=0,impares=0;
		

		for (i=0;i<10;i++){
			
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero%2==0) {
				
				pares=pares+1;
												
			} else {
				
				impares=impares+1;
				
			}
		
			
		}
		
		System.out.println("Os números pares são: "+pares);
		System.out.println("Os números impares são: "+impares);
		
	};
	
}