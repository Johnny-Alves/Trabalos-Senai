package pacote;

import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {

		double n1, n2, media;

		Scanner input = new Scanner(System.in);

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

		input.close();

	}

}
