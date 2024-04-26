package pacote;

import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		
		double n1, n2, media;
		char resp;

		Scanner input = new Scanner(System.in);

		do {
			do {

				System.out.println("Digite a primeira nota: ");
				n1 = input.nextDouble();

			} while (n1 < 0 || n1 > 10);

			do {

				System.out.println("Digite a segunda nota: ");
				n2 = input.nextDouble();

			} while (n2 < 0 || n2 > 10);

			media = (n1 + n2) / 2;

			System.out.printf("A nota média é:  %.2f", media);
			
			System.out.println("\nQuer continuar: (S/N)");
			resp = input.next().charAt(0);
			
		} while (resp == 's' || resp == 'S');

		input.close();

	}

}
