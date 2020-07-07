package DIA_02;

import java.util.Scanner;

public class ex2_dia2 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int a,b,c;
		
		System.out.printf("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.printf("Digite o valor de B: ");
		b = leia.nextInt();

		System.out.printf("Digite o valor de C: ");
		c = leia.nextInt();
		

		if(a<b)	{
			if(b<c)	{
				System.out.printf("Os números em ordem crescente é: "+a+" "+b+" "+c);
				
			}else if(a<c){
				System.out.printf("Os números em ordem crescente é: "+a+" "+c+" "+b);			
			
			}else{
				System.out.printf("Os números em ordem crescente é: "+c+" "+a+" "+b);	
			}
		}else if(b<c){
			if(a<c) {
				System.out.printf("Os números em ordem crescente é: "+b+" "+a+" "+c);
			
			}else{
				System.out.printf("Os números em ordem crescente é: "+b+" "+c+" "+a);			
			}
		}else {
				System.out.printf("Os números em ordem crescente é: "+c+" "+b+" "+a);	
		}
		

	};
	
		
	
}