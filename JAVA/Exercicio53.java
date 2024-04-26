package pacote;

import java.util.Scanner;

public class Exercicio53 {

	public static void main(String[] args) {

		int n;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor de n: ");
		n = entrada.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nFim do programa!");

		entrada.close();

	}

}
