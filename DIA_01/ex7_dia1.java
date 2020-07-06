package DIA_01;

import java.util.Scanner;

public class ex7_dia1 {

	public static void main (String args [])

	{
		Scanner leia = new Scanner(System.in);
		float a,b,c,d,ve,f,x,y;
		
		System.out.printf("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.printf("Digite o valor de B: ");
		b= leia.nextInt();
		
		System.out.printf("Digite o valor de C: ");
		c = leia.nextInt();
		
		System.out.printf("Digite o valor de D: ");
		d = leia.nextInt();

		System.out.printf("Digite o valor de E: ");
		ve = leia.nextInt();

		System.out.printf("Digite o valor de F: ");
		f = leia.nextInt();

		x=(c*ve)-(b*f)/(a*ve)-(b*d);
		y=(a*f)-(c*d)/(a*ve)-(b*d);
		
		System.out.printf("O valor x é: "+x+"\n");

		System.out.printf("O valor y é: "+y);
		
		
		
	}	
}