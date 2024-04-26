package pacote;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		int a;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		a = input.nextInt();

		if (a >= 0) {

			System.out.println("É positivo");
		}

		else {

			System.out.println("É negativo");
		}
		
		input.close();
	}

}
