package pacote;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a;

		System.out.println("Digite um n�mero: ");

		a = input.nextInt();

		if (a > 10) {

			System.out.println("� maior que 10!!!!!!");
		}

		else {

			System.out.println("N�o � maior que 10!!!");

		}

		input.close();
	}

}
