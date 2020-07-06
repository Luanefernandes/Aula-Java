package DIA_01;

import java.util.Scanner;

public class ex8_dia1 {

	public static void main (String args [])

	{
		Scanner leia = new Scanner(System.in);
		float custoFabrica, custoConsumidor, percentagemDistribuidor, impostos;
		
		System.out.printf("Digite o custo da fábrica do carro: ");
		custoFabrica = leia.nextInt();
		
		percentagemDistribuidor=(custoFabrica*28)/100;
		impostos=(custoFabrica*45)/100;
		custoConsumidor=custoFabrica+percentagemDistribuidor+impostos;

		System.out.printf("O custo do carro ao consumidor de é R$: "+custoConsumidor);
		
		
	}	
}