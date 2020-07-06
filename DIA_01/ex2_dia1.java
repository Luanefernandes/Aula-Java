package DIA_01;

import java.util.Scanner;

public class ex2_dia1 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int anos, meses, dias, diasTotais;
		
		System.out.printf("Digite sua idade em dias: ");
		diasTotais = leia.nextInt();
				
		anos=(diasTotais/365);
		meses=(diasTotais%365/30);
		dias=(diasTotais%365)%30;
		
				
		System.out.printf("Você já viveu por "+anos+" anos, "+meses+" meses, e "+dias+" dias.4");
		
		
	};
	
		
	
}