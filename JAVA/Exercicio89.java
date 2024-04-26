package pacote;

import java.util.Scanner;

public class Exercicio89 {

	public static void main(String[] args) {

		int[] V1 = new int[5];
		int[] V2 = new int[5];
		int[] pos = new int[5];

		int quant = 0, j = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < V1.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor (vetor 1): ");
			V1[i] = entrada.nextInt();
		}

		System.out.println("------------------------------------");

		for (int i = 0; i < V2.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor (vetor 2): ");
			V2[i] = entrada.nextInt();
		}

		for (int i = 0; i < V2.length; i++) {
			if (V1[i] == V2[i]) {

				quant++;
				pos[j] = i + 1;

				j++;
			}
		}

		System.out.println("------------------------------------");
		System.out.println("Quantidade de vezes que repetem: " + quant);

		System.out.print("Posições: ");
		for (int i = 0; i < pos.length; i++) {
			if (pos[i] != 0) {
				System.out.print(pos[i] + "°  ");
			}
		}
		System.out.println("\n------------------------------------");
		
		entrada.close();
	}

}
