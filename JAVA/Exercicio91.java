package pacote;

import java.util.Scanner;

public class Exercicio91 {

	public static void main(String[] args) {

		int aux1 = 0;
		int[] vet = new int[5];
		int[] aux = new int[5];

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor: ");
			vet[i] = entrada.nextInt();
		}

		System.out.println("--------------------------");
		for (int i = 0; i < vet.length; i++) {

			boolean repete = false;

			for (int j = 0; j < vet.length; j++) {
				if (i != j) {
					if (vet[i] == vet[j]) {
						for (int k = 0; k < aux.length; k++) {

							if (aux[k] == j + 1) {
								repete = true;
							}
						}

						if (!repete) {
							aux[aux1] = j + 1;
							System.out.println("Valor: " + vet[i] + " || Posição: " + (j + 1));
							aux1++;
						}
					}
				}
			}
		}

		entrada.close();

	}
}
