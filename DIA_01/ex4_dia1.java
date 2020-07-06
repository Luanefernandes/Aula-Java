package DIA_01;

import java.util.Scanner;

public class ex4_dia1 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int a,b,c;
		double d,r,s;
		
		System.out.printf("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.printf("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.printf("Digite o valor de C: ");
		c = leia.nextInt();
		
		r= Math.pow((a+b),2);
		s= Math.pow((b+c),2);
		d= (r+s)/2;

		System.out.printf("O valor de D é: "+d);
		
	};
	
		
	
}