package DIA_05;

import java.util.Scanner;

public class ex1_dia5 {

	public static void main (String args[])
	
	{
		Scanner leia = new Scanner (System.in);
		
		int  op ;
		double preco, total;
		
		System.out.println("Digite o valor total da sua compra: ");
		preco = leia.nextInt();
		
		System.out.println("Escolha sua forma de pagamento: \n(1) À vista em dinheiro ou cheque, recebe 20% de desconto \n(2) À vista no cartão de crédito, recebe 15% de desconto \n(3) Em duas vezes, preço normal da etiqueta sem juros \n(4) Em três vezes, preço normal de etiqueta mais juros de 10%");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			
			total=preco-(preco*0.2);
			System.out.println("O total a ser pago é de: "+total+" reais.");
			break;
			
		case 2:
			
			total=preco-(preco*0.15);
			System.out.println("O total a ser pago é de: "+total+" reais.");
			break;
			
		case 3:
			
			total=preco/2;
			System.out.println("O total a ser pago são duas parcelas de: "+total+"\nTotalizando: "+preco+" reais.");
			break;
			
		case 4:
			
			total = preco+(preco*0.1);
			System.out.println("O total a ser pago é de: "+total+" reais.");
			break;
			
			
		default:
			
			System.out.println("Opção inválida...");
			break;
			
		
		
		}	
		
	}
	
	
}
