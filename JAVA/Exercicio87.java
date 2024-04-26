package pacote;

import java.util.Scanner;

public class Exercicio87 {

	public static void main(String[] args) {

		int N = 6;
		int[] valor = new int[N];
		int aux;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < valor.length - 1; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor: ");
			valor[i] = entrada.nextInt();
		}

		for (int x = 0; x < valor.length; x++) {
			for (int i = 0; i < valor.length - 1; i++) {

				if (valor[i] > valor[i + 1]) {
					aux = valor[i];
					valor[i] = valor[i + 1];
					valor[i + 1] = aux;
				}
			}
		}

		System.out.println("-------------------------");

		for (int i = 0; i < valor.length; i++) {
			if (valor[i] != 0) {
				System.out.print(valor[i] + " ");
			}
		}

		System.out.println("\n-------------------------");
		System.out.print("Insira um valor: ");
		valor[0] = entrada.nextInt();
		System.out.println("-------------------------");

		for (int x = 0; x < valor.length; x++) {
			for (int i = 0; i < valor.length - 1; i++) {

				if (valor[i] > valor[i + 1]) {
					aux = valor[i];
					valor[i] = valor[i + 1];
					valor[i + 1] = aux;
				}
			}
		}

		for (int i = 0; i < valor.length; i++) {

			System.out.print(valor[i] + " ");

		}

		entrada.close();

	}

}
