package DIA_02;

import java.util.Scanner;

public class ex3_dia2 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int age;
		
		System.out.printf("Digite sua idade: ");
		age = leia.nextInt();

		
		if (age>=10 & age<=14)
		{
			System.out.printf("A sua categorida é: infantil.");
			age = leia.nextInt();
		}

		else if (age>=15 & age<=17)
		{
			System.out.printf("A sua categorida é: juvenil.");
			age = leia.nextInt();	
		}
		
		else 
		{
			System.out.printf("A sua categorida é: adulto.");			
		}
		
	};
	
		
	
}