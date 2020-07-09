package DIA_04;
import java.util.Scanner;

public class ex2_dia4 {
	
	public static void main (String args[]) 

	{
		Scanner leia = new Scanner (System.in);
		int [] a = new int [6];
		int acumulador=0, soma=0, pares=0, impares=0,i, soma1=0;
		
		for(i=0;i<a.length;i++) {
			
			System.out.println("Entre com um número: ");
			a[i] = leia.nextInt();
			
		}
		
		for(i=0;i<a.length;i++){
				
				if(a[i]%2==0) {
				
				soma+=a[i];
				
				
			}else {
				
				acumulador++;

			}
				
		}
		
		System.out.println("A: Os números pares são: ");
		for(i=0;i<a.length;i++){
			
		if(a[i]%2==0) {

				pares=a[i];
				System.out.println(pares+"\n");
							
		}
		}
		
		System.out.println("B: Os números impares são: ");
		for(i=0;i<a.length;i++){
				
			if(a[i]%2!=0) {

				impares=a[i];
				System.out.println(impares+"\n");
								
			}
			
		
			
		}
		
			

			System.out.println("C: A soma dos números pares digitados é: "+soma);
			System.out.println("D: A quantidade de números impares digitados é: "+acumulador);
			
	}
	
	
	
}