package DIA_05;

import java.util.Scanner;

public class ex3_dia5 {

	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		int num=0, num1=0,num2=0,num3=0, i=0;
		
		
		do  {
			
			i++;
			
			System.out.printf("Informe um número: ");
			i = leia.nextInt();
			
			if(i>=0 & i<=25) {
				num=num+1;
				
			} else if (i>=26 & i<=50){
				num1=num1+1;
				
			} else if (i>=51 & i<=75) {
				num2=num2+1;
				
			}else if (i>=76 & i<=100) {
				num3=num3+1;
			}
		
		}
		while (i>0);
		
		
		
		System.out.println("\nVocê digitou "+num+" números entre 0 e 25");
		System.out.println("Você digitou "+num1+" números entre 25 e 61");
		System.out.println("Você digitou "+num2+" números entre 51 e 75");
		System.out.println("Você digitou "+num3+" números entre 76 e 100");
		
		
	}
	
}
