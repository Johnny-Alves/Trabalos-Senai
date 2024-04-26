package pacote;

import java.util.Scanner;

public class Exercicio86 {

	public static void main(String[] args) {

		int[] valor = new int[5];
		int aux;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < valor.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor: ");
			valor[i] = entrada.nextInt();
		}

		for (int x = 0; x < valor.length - 1; x++) {
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
