package pacote;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		int a, b, c;
		Scanner input = new Scanner(System.in);

		System.out.println("Digito o primeiro valor: ");
		a = input.nextInt();

		System.out.println("Digito o segundo valor: ");
		b = input.nextInt();

		System.out.println("Digito o terceiro valor: ");
		c = input.nextInt();

		if (a > b && a > c) {

			if (b > c) {

				System.out.println("O valor da soma �: " + (a + b));
			}

			else {

				System.out.println("O valor da soma �: " + (a + c));
			}

		}

		else if (b > c && b > a) {

			if (c > a) {

				System.out.println("O valor da soma �: " + (b + c));
			}

			else {

				System.out.println("O valor da soma �: " + (b + a));
			}

		}

		else {

			if (b > a) {

				System.out.println("O valor da soma �: " + (b + c));
			}

			else {

				System.out.println("O valor da soma �: " + (c + a));
			}
		}

		input.close();
	}

}
