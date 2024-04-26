package pacote;

import java.util.Scanner;

public class Exercicio72 {

	public static void main(String[] args) {
		
		int codigo, quant = 5;
		double preco, maior = Integer.MIN_VALUE, soma = 0, media;
		
		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= quant; i++) {
			System.out.print("Informe o codigo do " + i + "° produto: ");
			codigo = entrada.nextInt();
			
			System.out.print("Informe o preço do " + i + "° produto: ");
			preco = entrada.nextDouble();
			
			System.out.println("--------------------------------------------");
			
			soma += preco;
			
			if(preco > maior) {
				maior = preco;
			}	
		}
		
		media = soma / quant;
		
		System.out.println("--------------------------------------------");
		System.out.printf("Maior valor: R$%.2f " , maior);
		System.out.printf("\nMédia dos preços: R$%.2f ", media);
		System.out.println("\n--------------------------------------------");
		
		entrada.close();

	}

}
