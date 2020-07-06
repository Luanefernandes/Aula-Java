package DIA_01;

import java.util.Scanner;

public class ex3_dia1 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int segundosTotais, segundos, minutos, horas;
		
		System.out.printf("Digite o tempo de duração do evento em segundos: ");
		segundosTotais = leia.nextInt();
				
		horas=(segundosTotais/3600);
		minutos=(segundosTotais%3600/60);
		segundos=(segundosTotais%3600)%60;
		
				
		System.out.printf("O evento teve duração de "+ horas+ " horas, "+ minutos+ " minutos, e "+ segundos+" segundos.");
		
		
	};
	
		
	
}