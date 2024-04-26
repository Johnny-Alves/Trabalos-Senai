package pacote;

import java.util.Scanner;

public class Exercicio69 {

	public static void main(String[] args) {
		
		int quant_mercadorias = 0, i = 1;
		double valor_mercadoria, soma = 0, media;
		char resp;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.print("Informe o valor da " + i + "° mercadoria: ");
			valor_mercadoria = entrada.nextDouble();
			
			soma += valor_mercadoria;
			
			i++;
			quant_mercadorias++;
			
			System.out.print("Mais mercadorias (S/N): ");
			resp = entrada.next().charAt(0);
			
		} while (resp == 'S' || resp == 's');
		
		media = soma / quant_mercadorias;
		
		System.out.println("--------------------------------------------------");
		System.out.printf("O valor total em estoque é: R$%.2f", soma);
		System.out.printf("\nA média de valor das mercadorias é: R$%.2f", media);
		
		entrada.close();

	}

}
