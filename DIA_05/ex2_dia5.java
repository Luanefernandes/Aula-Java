package DIA_05;

import java.util.Scanner;

public class ex2_dia5 {

	public static void main (String [] args) 
	
	{
		
		Scanner leia = new Scanner (System.in);
		
		float peso, altura;
		double imc;
		
		System.out.println("Vamos calcular seu IMC!!!\n");
		System.out.println("Informe seu peso: ");
		peso = leia.nextFloat();
		
		System.out.printf("Informe sua altura: ");
		altura = leia.nextFloat();
		
		imc=  peso/(Math.pow(altura, 2));
		
		System.out.printf("Seu imc é: "+imc);
		
		if(imc<18.5) {
			
			System.out.println("\nSegundo a OMS, você está abaixo do peso!!!");
			
		} else if(imc>18.5 & imc<25) {
			
			System.out.println("\nSegundo a OMS, você está com o peso normal!!!");
			
		} else if(imc>25 & imc<30) {
			
			System.out.println("\nSegundo a OMS, você está acima do peso!!!");
			
		} else if(imc>30) {
			
			System.out.println("\nSegundo a OMS, você está obeso(a)!!!");
			
		}
		
	}
	
	
}
