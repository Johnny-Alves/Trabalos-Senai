package pacote;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int A;

		System.out.print("Digite um numero: ");

		A = input.nextInt();

		System.out.println("Valor original: " + A);
		System.out.println("Antecessor: " + (A - 1));

		input.close();
	}

}
