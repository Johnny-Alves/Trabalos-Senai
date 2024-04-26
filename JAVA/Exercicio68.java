package pacote;

import java.util.Scanner;

public class Exercicio68 {

	public static void main(String[] args) {
		
		int quant_mercadorias;
		double valor_mercadoria, soma = 0, media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número total de mercadorias: ");
		quant_mercadorias = entrada.nextInt();
		
		System.out.println("--------------------------------------------------");
		
		for (int i = 1; i <= quant_mercadorias; i++) {
			System.out.print("Informe o valor da " + i + "° mercadoria: ");
			valor_mercadoria = entrada.nextDouble();
			
			soma += valor_mercadoria;
		}
		
		media = soma / quant_mercadorias;
		
		System.out.println("--------------------------------------------------");
		System.out.printf("O valor total em estoque é: R$%.2f", soma);
		System.out.printf("\nA média de valor das mercadorias é: R$%.2f", media);
		
		entrada.close();

	}

}
