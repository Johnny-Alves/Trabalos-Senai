package pacote;

import java.util.Scanner;

public class Exercicio81 {

	public static void main(String[] args) {

		double[] valor = new double[10];
		double teste, menor = Integer.MAX_VALUE;
		int posicao = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < valor.length; i++) {
			do {
				System.out.print("informe o " + (i + 1) + "° valor: ");
				teste = entrada.nextDouble();
				if (teste < 0) {
					System.out.println("Valor inválido!");
				}
				else {
					valor[i] = teste;
				}
			} while (teste < 0);
		}
		
		for (int i = 0; i < valor.length; i++) {
			if(valor[i] < menor) {
				menor = valor[i];
				posicao = i + 1;
			}
		}
		
		System.out.println("-----------------------");
		System.out.println("Menor elemento: " + menor);
		System.out.println("Posição: " + posicao);
		System.out.println("-----------------------");
		
		entrada.close();

	}

}
