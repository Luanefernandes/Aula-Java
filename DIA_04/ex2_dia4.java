package DIA_04;
import java.util.Scanner;

public class ex2_dia4 {
	
	public static void main (String args[]) 

	{
		Scanner leia = new Scanner (System.in);
		int [] a = new int [6];
		int acumulador=0, soma=0, pares=0, impares=0,i, soma1=0;
		
		for(i=0;i<a.length;i++) {
			
			System.out.println("Entre com um n�mero: ");
			a[i] = leia.nextInt();
			
		}
		
		for(i=0;i<a.length;i++){
				
				if(a[i]%2==0) {
				
				soma+=a[i];
				
				
			}else {
				
				acumulador++;

			}
				
		}
		
		System.out.println("A: Os n�meros pares s�o: ");
		for(i=0;i<a.length;i++){
			
		if(a[i]%2==0) {

				pares=a[i];
				System.out.println(pares+"\n");
							
		}
		}
		
		System.out.println("B: Os n�meros impares s�o: ");
		for(i=0;i<a.length;i++){
				
			if(a[i]%2!=0) {

				impares=a[i];
				System.out.println(impares+"\n");
								
			}
			
		
			
		}
		
			

			System.out.println("C: A soma dos n�meros pares digitados �: "+soma);
			System.out.println("D: A quantidade de n�meros impares digitados �: "+acumulador);
			
	}
	
	
	
}