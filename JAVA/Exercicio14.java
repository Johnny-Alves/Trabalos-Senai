package pacote;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a;

		System.out.println("Digite um número: ");

		a = input.nextInt();

		if (a > 10) {

			System.out.println("É maior que 10!!!!!!");
		}

		else {

			System.out.println("Não é maior que 10!!!");

		}

		input.close();
	}

}
