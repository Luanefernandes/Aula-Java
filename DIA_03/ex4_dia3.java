package DIA_03;

import java.util.Scanner;

public class ex4_dia3 {
	
	public static void main (String args []) 
	
	{	
			
		Scanner leia=new Scanner (System.in);
		int idade,temp,cont=1,calma=0,mnervosa=0,hagressivo=0,nervosa40=0,calma18=0, sexo;
		

		
		while(cont<=150) {
			
			System.out.println("Cidad�o n�mero "+cont+":");
						
			System.out.println("Informe seu sexo: \n1-Feminino\n2-Masculino");
			sexo = leia.nextInt();
			
			System.out.println("Informe sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Informe seu temperamento: \n1- Calma(o) \n2-Nervosa(o) \n3-Agressiva(o)");
			temp = leia.nextInt();
			
			if(temp==1){
				
				calma=calma+1;
				
			}else if(temp==2 & sexo==1){
				
				mnervosa++;
				
			}else if(temp==1 & idade<=18){
				
				calma18++;				
				
			}else if(temp==3 & idade>=40){
				
				nervosa40++;
				
			} else if(temp==3 & sexo==2) {
				
				hagressivo++;
				
			}
			
			cont++;
			
		}
		
		System.out.println("O n�mero de pessoas calmas �: "+calma);
		System.out.println("O n�mero de mulheres nervosas �: "+mnervosa);
		System.out.println("O n�mero de homens agressivos �: "+hagressivo);
		System.out.println("O n�mero de pessoas nervosas acima de 40 anos �: "+nervosa40);
		System.out.println("O n�mero de pessoas nervosas abaixo de 18 anos �: "+calma18);
	};
	
		
	
}