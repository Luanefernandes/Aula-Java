package DIA_01;

import java.util.Scanner;

public class ex6_dia1 {

	public static void main (String args [])

	{
		Scanner leia = new Scanner(System.in);
		double x1,y1,x2,y2,d;
		
		System.out.printf("Preencha as coordenadas! \n");
		System.out.printf("X1: ");
		x1 = leia.nextInt();
		
		System.out.printf("X2: ");
		x2 = leia.nextInt();
		
		System.out.printf("Y1: ");
		y1 = leia.nextInt();		
		
		System.out.printf("Y2: ");
		y2 = leia.nextInt();		
		
		d=(Math.pow((x2-x1),2))+(Math.pow((y2-y1), 2));
		d=Math.sqrt(d);
		
		System.out.printf("A distância entre os dois pontos é de: "+d);		
		
		
		
	}	
}