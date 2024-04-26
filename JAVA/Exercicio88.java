package pacote;

import java.util.Scanner;

public class Exercicio88 {

	public static void main(String[] args) {
	
		int[] vetor = new int[5];
		int[] vetor2 = new int[5];
		int x, j = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor: ");
			vetor[i] = entrada.nextInt();
		}
		
		System.out.println("---------------------");
		System.out.print("Buscar por valor: ");
		x = entrada.nextInt();
		System.out.println("---------------------");
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] != x) {
				vetor[j] = vetor[i];
				j++;
			}
		}
		
		for (int i = 0; i < vetor2.length - (5 - j); i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println("\n---------------------");

		entrada.close();
	}

}
