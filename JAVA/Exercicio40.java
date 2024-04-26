package pacote;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		
		String nome;
		int quant;
		double preco, total, desc, total_pagar;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nome do produto: ");
		nome = input.nextLine();
		
		System.out.print("Quantidade do produto: ");
		quant = input.nextInt();
		
		System.out.println("Preço do produto: ");
		preco = input.nextDouble();
		
		total = quant * preco;
		
		if(quant <= 5) {
			desc = 0.02;
		}
		else if (quant > 5 && quant <= 10) {
			desc = 0.03;
		}
		else {
			desc = 0.05;
		}
		
		total_pagar = total * (1 - desc);
		
		System.out.printf("------------ %s ------------", nome);
		System.out.printf("\nTotal: R$%.2f", total);
		System.out.printf("\nDesconto: %.0f%%", desc * 100);
		System.out.printf("\nTotal a pagar: R$%.2f", total_pagar);
		System.out.println("\n----------------------------");
		
		
		input.close();
		
	}

}
