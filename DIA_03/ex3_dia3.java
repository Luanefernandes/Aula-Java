package DIA_03;

import java.util.Scanner;

public class ex3_dia3 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int idade=1,maior=0,menor=0;
		
		System.out.println("Entre com uma idade: ");
		idade = leia.nextInt();
		
		while(idade<99) {
			
			
			if(idade<=21){
				
				menor++;
				
			}
			
			else if(idade>=50){
				
				maior++;

			}
			
			System.out.println("Entre com uma idade: ");
			idade = leia.nextInt();
		

		}
		
		System.out.printf("O total de pessoas acima de 50 anos, são: "+maior+"\n");
		System.out.printf("O total de pessoas com menos de 21 anos, são: "+menor);

	};
	
		
	
}