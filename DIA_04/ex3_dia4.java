package DIA_04;
import java.util.Scanner;

public class ex3_dia4 {
	
	public static void main (String args[]) 

	{
		Scanner leia = new Scanner (System.in);
		int [][] matriz = new int [3][3];
		int contador=0, soma=0, pares=0, impares=0;
		
		for(int l=0;l<matriz.length;l++) 
		{
			
			for(int c=0;c<matriz.length;c++) 
			{
			
				System.out.println("Entre com um número na matriz "+(l+1)+":"+(c+1)+" : ");
				matriz[l][c] = leia.nextInt();
			
				if(matriz[l][c]>10)
					{
					
						contador++;
				
					}
		

			}
			
			for(int c=0;c<matriz.length;c++) 
			{
			
					if(matriz[l][c]>10)
					{
					
						System.out.println("Maiores que 10: "+matriz[l][c]+"\n");
				
					}
		

			}
			

			
		}
		
		
		System.out.println("A matriz teve " + contador+" números maiores que 10.");
}
}