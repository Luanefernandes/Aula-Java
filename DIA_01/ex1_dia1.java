package DIA_01;

import java.util.Scanner;

public class ex1_dia1 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int anos, meses, dias, diasTotais;
		
		System.out.printf("Escreva sua idade em anos: ");
		anos = leia.nextInt();
		System.out.printf("Escreva sua idade em meses: ");
		meses = leia.nextInt();		
		System.out.printf("Escreva sua idade em dias: ");
		dias = leia.nextInt();			
		
		diasTotais=(anos*365)+(meses*30)+dias;
		
		System.out.printf("Você já viveu por "+diasTotais);
		
		
	};
	
		
	
}