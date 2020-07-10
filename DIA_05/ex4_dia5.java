package DIA_05;

import java.util.Scanner;

public class ex4_dia5 {

	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		float soma=0, divisao, a=0, b=0;
		int i=0;
		
		System.out.println("Vamos fazer a soma da seguinte expressão: 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50 \n");
		
		for(i=1;i<=50;i++) {
			
			a= (i * 2) - 1;
			b = i;
			divisao=(a/b);
			soma = soma + divisao;
					
			}
			
		System.out.println("O resultado da soma é: "+soma);
					
	}
	
}
