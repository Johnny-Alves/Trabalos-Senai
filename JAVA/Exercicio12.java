package pacote;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		double f, c;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma temperatura em graus Fahrenheit: ");

		f = input.nextDouble();

		c = (5 * (f - 32)) / 9;

		System.out.printf("A temperatura em graus celsius é: %.0f°C", c);

		input.close();
	}

}
