package DIA_04;
import java.util.Scanner;

public class ex1_dia4 {
	
	public static void main (String args[]) 

	{
		Scanner leia = new Scanner (System.in);
		int [] a = new int [6];
		int acumulador=0, soma=0;
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Entre com um número: ");
			a[i] = leia.nextInt();
			
			
			if(a[i]==a[4] & a[i]!=a[1]) {
				
				a[i]=100;
				
			}
		
			
			
			soma=a[0]+a[1]+a[5];
		}
		
			
			System.out.println("A soma dos vetores A[0], A[1] e A[5] é: "+soma+"\n");
			
				
			System.out.println("O valor do vetor 0 é: "+a[0]);
			System.out.println("O valor do vetor 1 é: "+a[1]);
			System.out.println("O valor do vetor 2 é: "+a[2]);
			System.out.println("O valor do vetor 3 é: "+a[3]);
			System.out.println("O valor do vetor 4 é: "+a[4]);
			System.out.println("O valor do vetor 5 é: "+a[5]);
			
			
			
	}
	
	
	
}
