package pacote;

import java.util.Scanner;

public class Exercicio71 {

	public static void main(String[] args) {
		
		int quant, valor, soma = 0, maior = Integer.MIN_VALUE;
		double media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantidade de números a ser lido: ");
		quant = entrada.nextInt();
		
		System.out.println("-------------------------------------");

		for (int i = 1; i <= quant; i++) {
			System.out.print("Informe o " + i + "° valor: ");
			valor = entrada.nextInt();
			soma += valor;
			
			if(valor > maior) {
				maior = valor;
			}
			
		}
		
		media = soma / quant;
		
		System.out.println("-------------------------------------");
		
		System.out.println("Maior valor lido: " + maior);
		System.out.println("Média dos valores: " + media);
	
		entrada.close();

	}

}
